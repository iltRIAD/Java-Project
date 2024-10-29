import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

public class DeleteMember extends JFrame {

    JLabel l1, l2, l3;
    PrintWriter pwriter;
    JTextField tf1, tf2;
    JTextArea t1, t2;
    JButton b1, b2, b3;
    Font f1, f2;
    JComboBox securityQsn;
    JPasswordField tf3;
    Cursor cursor;

    DeleteMember() {

        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("DeleteMember.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bachelor's Home");
        this.setSize(500, 400);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        f1 = new Font("Segoe UI Black", Font.PLAIN, 15);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // username
        l1 = new JLabel();
        l1.setText("Username");
        l1.setBounds(50, 40, 80, 30);
        l1.setFont(f1);
        add(l1);

        // Textfield
        tf1 = new JTextField();
        tf1.setBounds(140, 45, 150, 30);
        tf1.setFont(f1);
        add(tf1);

        // JButtons
        b1 = new JButton("Delete");
        b1.setBounds(360, 40, 80, 20);
        b1.setFont(f1);
        b1.setCursor(cursor);
        b1.setForeground(Color.red);
        b1.setBackground(Color.decode("#2E75B6"));
        add(b1);

        b2 = new JButton("Back");
        b2.setBounds(0, 5, 60, 20);
        b2.setFont(f1);
        b2.setCursor(cursor);
        b2.setForeground(Color.red);
        b2.setBackground(Color.decode("#2E75B6"));
        add(b2);

        // t1 = new JTextArea();
        // t1.setBounds(100, 100, 150, 100);
        // t1.setFont(f1);
        // add(t1);
        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Back
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                new ManagerDashboard();
            }
        });

        // Search
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String textField1 = tf1.getText().toLowerCase(); // User Name

                if (textField1.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {

                        String userNameS = "User Name : " + textField1;
                        BufferedReader reader = new BufferedReader(
                                new FileReader("Member_Userdata.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        BufferedReader br = new BufferedReader(reader);
                        pwriter = new PrintWriter(new FileWriter("Member_Userdata.txt", false));
                        t1.read(br, null);
                        br.close();
                        t1.requestFocus();
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get("Member_Userdata.txt"))
                                    .get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files
                                        .readAllLines(Paths.get("Member_Userdata.txt"))
                                        .get((i + 1));
                                FileWriter writer = new FileWriter("Member_Userdata.txt");
                                BufferedWriter bw = new BufferedWriter(writer);
                                t1.write(bw);
                                bw.close();
                                t1.setText("");
                                t1.requestFocus();

                                JOptionPane.showMessageDialog(null, " Member find and Deleted", "Bachelors Home!",
                                        JOptionPane.WARNING_MESSAGE);

                                setVisible(false);
                                new ManagerDashboard();

                                break;

                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, " Member find and Deleted", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }

                }

            }
        });

    }

    public static void main(String[] args) {
        new DeleteMember();

    }

}

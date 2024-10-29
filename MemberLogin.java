import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class MemberLogin extends JFrame {
    JButton btn1, btn2, btn3, btn4, btn5;
    JTextField tf1;
    JPasswordField tf2;
    Font f2, f3;
    private Cursor cursor;

    MemberLogin() {
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Member login.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bachelor's Home");
        setSize(1310, 634);
        setLayout(null);
        setVisible(true);

        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 15);

        tf1 = new JTextField();
        tf1.setBounds(879, 204, 145, 40);
        add(tf1);

        tf2 = new JPasswordField();
        tf2.setBounds(879, 259, 145, 40);
        add(tf2);

        btn1 = new JButton("Exit");
        btn1.setBounds(300, 5, 183, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.red);
        btn1.setBackground(Color.decode("#C00000"));
        add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(20, 5, 183, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.yellow);
        btn2.setBackground(Color.decode("#2E75B6"));
        add(btn2);

        btn3 = new JButton("Login");
        btn3.setBounds(845, 312, 100, 33);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.green);
        btn3.setBackground(Color.decode("#2E75B6"));
        add(btn3);

        btn4 = new JButton("Forgotten Password");
        btn4.setBounds(860, 350, 200, 25);
        btn4.setFont(f3);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.cyan);
        btn4.setBackground(Color.decode("#2E75B6"));
        add(btn4);

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                new Identity();

            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name
                String textField2 = tf2.getText(); // Password

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        String userNameS = "User Name : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(
                                new FileReader("Member_Userdata.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get("Member_Userdata.txt"))
                                    .get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files
                                        .readAllLines(Paths.get("Member_Userdata.txt"))
                                        .get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Login Successful.", "Bachelors Home!",
                                            JOptionPane.WARNING_MESSAGE);

                                    setVisible(false);
                                    new Member();

                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }

                }

            }
        });
    }
}
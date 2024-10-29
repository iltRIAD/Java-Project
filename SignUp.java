import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.time.format.*;

public class SignUp extends JFrame {

    private JLabel label1;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField tf1, tf2, tf4, tf5;
    private JComboBox securityQsn;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private JPasswordField tf3;
    private Cursor cursor;
    private int a, b;

    SignUp() {

        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Signup.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Frame Layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bachelor's Home");
        setSize(1310, 634);
        setLayout(null);
        setVisible(true);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Enter Your Information");
        label1.setBounds(730, 25, 500, 50);
        label1.setFont(f1);
        add(label1);

        // User Name
        label1 = new JLabel();
        label1.setText("User Name");
        label1.setBounds(730, 75, 500, 50);
        label1.setFont(f4);
        add(label1);

        tf1 = new JTextField();
        tf1.setBounds(870, 85, 260, 30);
        tf1.setFont(f5);
        add(tf1);

        // Email
        label1 = new JLabel();
        label1.setText("Email");
        label1.setBounds(730, 110, 500, 50);
        label1.setFont(f4);
        add(label1);

        tf2 = new JTextField();
        tf2.setBounds(870, 120, 260, 30);
        tf2.setFont(f5);
        add(tf2);

        // Password
        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(730, 145, 500, 50);
        label1.setFont(f4);
        add(label1);

        tf3 = new JPasswordField();
        tf3.setBounds(870, 155, 260, 30);
        tf3.setFont(f2);
        tf3.setEchoChar('*');
        add(tf3);

        // Question
        label1 = new JLabel();
        label1.setText("Question");
        label1.setBounds(730, 180, 500, 50);
        label1.setFont(f4);
        add(label1);
        String[] secQsn = { "Choose a Security Question...", "Your dream job?", "Your favorite song?",
                "First pet's name?", "Your favorite hobby?" };
        securityQsn = new JComboBox(secQsn);
        securityQsn.setBounds(870, 190, 259, 30);
        securityQsn.setSelectedIndex(0);
        securityQsn.setFont(f5);
        securityQsn.setBackground(Color.white);
        add(securityQsn);

        // Answer
        label1 = new JLabel();
        label1.setText("Answer");
        label1.setBounds(730, 215, 500, 50);
        label1.setFont(f4);
        add(label1);

        tf4 = new JTextField();
        tf4.setBounds(870, 225, 260, 30);
        tf4.setFont(f5);
        add(tf4);

        // Captcha Label and Text Field
        label1 = new JLabel();
        label1.setText("Captcha");
        label1.setBounds(730, 250, 500, 50);
        label1.setFont(f4);
        add(label1);

        tf5 = new JTextField();
        tf5.setBounds(915, 260, 215, 30);
        tf5.setFont(f5);
        add(tf5);

        // To get a random number for captcha
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);

        // Captcha
        label1 = new JLabel();
        label1.setText(" " + a + " + " + b + " ");
        label1.setBounds(830, 260, 75, 30);
        label1.setFont(f4);
        label1.setForeground(Color.red);
        label1.setBackground(Color.decode("#FFD3D3"));
        label1.setOpaque(true);
        add(label1);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
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

        btn3 = new JButton("Reset");
        btn3.setBounds(750, 325, 183, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.orange);
        btn3.setBackground(Color.decode("#2E75B6"));
        add(btn3);

        btn4 = new JButton("Register");
        btn4.setBounds(949, 325, 183, 50);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.green);
        btn4.setBackground(Color.decode("#2E75B6"));
        add(btn4);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        add(nBtn);

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
                new HomeLogin();

            }
        });

        // Reset Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);

                new SignUp();
            }
        });

        // Register Button
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name
                String textField2 = tf2.getText(); // Email
                String textField3 = tf3.getText(); // Password
                String textField4 = tf4.getText(); // Security Question Answer
                String textField5 = tf5.getText(); // Captcha
                String secQsn = String.valueOf(securityQsn.getSelectedItem()); // Security Question
                int result = 0;

                if (textField5.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    result = Integer.parseInt(tf5.getText());
                    if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                            || textField5.isEmpty() || ((securityQsn.getSelectedIndex()) == 0)) {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    } else if (result == (a + b)) {
                        JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);
                    } else {

                        try {
                            File file = new File("Home_Userdata.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            String timeAndDate = myDateObj.format(myFormatObj);

                            pw.println("User Name : " + textField1);
                            pw.println("Password : " + textField3);
                            pw.println("Email : " + textField2);
                            pw.println("Security Question : " + secQsn);
                            pw.println("Answer : " + textField4);
                            pw.println("Time & Date : " + timeAndDate);
                            pw.println("===============================================");
                            pw.close();

                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "file ex");
                            // System.out.println("file created");
                        }

                        JOptionPane.showMessageDialog(btn4, "Registration Successfully Completed.",
                                "Registration Complete", JOptionPane.WARNING_MESSAGE);
                        setVisible(false);
                        new HomeLogin();

                    }
                }
            }
        });
    }
}

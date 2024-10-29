import java.lang.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.util.*;

import java.io.*;
import java.nio.file.*;

public class HomeLogin {

    JLabel l1, l2;

    JTextField tf1;

    JButton b1, b2, b3, b4, b5;

    JPasswordField tf2;

    HomeLogin() {

        JFrame f = new JFrame();
        try {
            f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("HomeLogin.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        l1 = new JLabel("Home ID");
        l1.setBounds(200, 250, 150, 20);
        l1.setFont(new Font("italic", Font.BOLD, 15));
        l1.setForeground(Color.PINK);

        l2 = new JLabel("Home Password");
        l2.setBounds(137, 285, 150, 20);
        l2.setFont(new Font("italic", Font.BOLD, 15));
        l2.setForeground(Color.cyan);

        tf1 = new JTextField();
        tf1.setBounds(280, 250, 150, 20);

        tf2 = new JPasswordField();
        tf2.setBounds(280, 280, 150, 20);

        b3 = new JButton("Login");
        b3.setBounds(315, 320, 90, 30);
        b3.setBackground(Color.cyan);
        b3.setForeground(Color.RED);

        b4 = new JButton("Forgotten Password");
        b4.setBounds(360, 370, 150, 20);

        b5 = new JButton(" Register ");
        b5.setBounds(200, 370, 120, 30);
        b5.setFont(new Font("italic", Font.BOLD, 15));
        b5.setBackground(Color.blue);

        b1 = new JButton("EXIT");
        b1.setBounds(1225, 0, 100, 30);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.setBackground(Color.red);
        b1.setOpaque(true);

        b2 = new JButton("PREVIOUS");
        b2.setBounds(0, 0, 150, 30);
        b2.setFont(new Font("Arial", Font.BOLD, 15));
        b2.setBackground(Color.green);
        b2.setOpaque(true);
        b2.setBorderPainted(false);
        b2.setForeground(Color.BLACK);

        f.add(l1);
        f.add(l2);
        f.add(tf1);
        f.add(tf2);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setTitle("Bachelor's Home");

        f.setVisible(true);

        f.setSize(1572, 948);

        f.setLayout(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // EXIT
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                f.setVisible(false);
            }
        });
        // PREVIOUS
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Window();
            }
        });

        // Register
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                f.setVisible(false);
                new SignUp();
            }
        });

        // LOGIN
        b3.addActionListener(new ActionListener() {
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
                                new FileReader("Home_Userdata.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get("Home_Userdata.txt"))
                                    .get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files
                                        .readAllLines(Paths.get("Home_Userdata.txt"))
                                        .get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Login Successful.", "Bachelors Home!",
                                            JOptionPane.WARNING_MESSAGE);

                                    f.setVisible(false);
                                    new Identity();

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
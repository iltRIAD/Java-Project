import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;

public class ManagerLogin extends JFrame {
    JButton btn1, btn2, btn3, btn4, btn5;
    JTextField tf1;
    JPasswordField tf2;
    Font f2, f3;
    private Cursor cursor;

    ManagerLogin() {
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Manager Login.jpg")))));
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
        tf1.setBounds(895, 229, 145, 40);
        add(tf1);

        tf2 = new JPasswordField();
        tf2.setBounds(895, 287, 145, 40);
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
        btn3.setBounds(870, 340, 100, 33);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.green);
        btn3.setBackground(Color.decode("#2E75B6"));
        add(btn3);

        btn4 = new JButton("Forgotten Password");
        btn4.setBounds(900, 390, 200, 25);
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
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == btn3) {
                    String user = tf1.getText();
                    String pass = tf2.getText();
                    if (user.equals("riad") && pass.equals("1065")) {
                        setVisible(false);
                        JOptionPane.showMessageDialog(null, "Login Successful.", "Bachelors Home!",
                                JOptionPane.WARNING_MESSAGE);
                        new Manager();
                    } else {
                        showMessageDialog(null, "Invalid Username and password!");
                    }

                }
            }
        });
    }
}
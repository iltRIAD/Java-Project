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

public class Member extends JFrame {
    JButton b1, b2, b3, b4, b5;

    Font f1, f2;
    private Cursor cursor;

    Member() {
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Manager.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bachelor's Home");
        setSize(1152, 650);
        setLayout(null);
        setVisible(true);

        f1 = new Font("Segoe UI Black", Font.PLAIN, 15);
        f2 = new Font("Algerian", Font.PLAIN, 35);

        b1 = new JButton("Back");
        b1.setBounds(100, 5, 70, 20);
        b1.setFont(f1);
        b1.setCursor(cursor);
        b1.setForeground(Color.green);
        b1.setBackground(Color.decode("#FFE4C4"));
        add(b1);

        b2 = new JButton("Exit");
        b2.setBounds(972, 5, 40, 20);
        b2.setFont(f1);
        b2.setCursor(cursor);
        b2.setForeground(Color.red);
        b2.setBackground(Color.decode("#FFE4C4"));
        add(b2);

        b3 = new JButton("Dashboard");
        b3.setBounds(953, 35, 90, 40);
        b3.setFont(f1);
        b3.setCursor(cursor);
        b3.setForeground(Color.red);
        b3.setBackground(Color.decode("#FFE4C4"));
        add(b3);

        b4 = new JButton("Logout");
        b4.setBounds(972, 72, 80, 40);
        b4.setFont(f1);
        b4.setCursor(cursor);
        b4.setForeground(Color.red);
        b4.setBackground(Color.decode("#FFE4C4"));
        add(b4);

        // back
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                new MemberLogin();

            }
        });

        // Exit
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);

            }
        });

        // Dashborad
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new MemberDashboard();
            }
        });

        // Logout
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new MemberLogin();
            }
        });

    }

    public static void main(String[] args) {
        new Member();
    }

}
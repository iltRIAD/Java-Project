import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Identity extends JFrame {

    JButton btn1, btn2, btn3, btn4;
    Font f2;
    private Cursor cursor;

    Identity() {
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Identity.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bachelor's Home");
        setSize(1310, 634);
        setLayout(null);
        setVisible(true);

        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

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

        btn3 = new JButton("MANAGER");
        btn3.setBounds(750, 325, 183, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.orange);
        btn3.setBackground(Color.decode("#2E75B6"));
        add(btn3);

        btn4 = new JButton("MEMBER");
        btn4.setBounds(949, 325, 183, 50);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.green);
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
                new HomeLogin();

            }
        });

        // manager buttom
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);

                new ManagerLogin();
            }
        });

        // mamber buttom
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);

                new MemberLogin();
            }
        });

    }
}
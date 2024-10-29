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

public class ManagerDashboard extends JFrame {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    JTextField tf1u, tf2p, tf3m;

    JTextArea dp;

    Font f2, f3;
    JTable jt;
    private Cursor cursor;

    ManagerDashboard() {
        jt = new JTable();

        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("ManagerDashboard.jpeg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bachelor's Home");
        setSize(612, 408);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 10);

        b1 = new JButton("Add Member");
        b1.setBounds(50, 70, 160, 40);
        b1.setFont(f3);
        b1.setCursor(cursor);
        b1.setForeground(Color.red);
        b1.setBackground(Color.decode("#FFE4C4"));
        add(b1);

        b2 = new JButton("Delete Member");
        b2.setBounds(50, 137, 160, 40);
        b2.setFont(f3);
        b2.setCursor(cursor);
        b2.setForeground(Color.red);
        b2.setBackground(Color.decode("#FFE4C4"));
        add(b2);

        b3 = new JButton("Search Member");
        b3.setBounds(50, 204, 160, 40);
        b3.setFont(f3);
        b3.setCursor(cursor);
        b3.setForeground(Color.red);
        b3.setBackground(Color.decode("#FFE4C4"));
        add(b3);

        b4 = new JButton("Display");
        b4.setBounds(50, 271, 160, 40);
        b4.setFont(f3);
        b4.setCursor(cursor);
        b4.setForeground(Color.red);
        b4.setBackground(Color.decode("#FFE4C4"));
        add(b4);

        b5 = new JButton("Back");
        b5.setBounds(20, 7, 45, 15);
        b5.setFont(f3);
        b5.setCursor(cursor);
        b5.setForeground(Color.red);
        b5.setBackground(Color.decode("#FFE4C4"));
        add(b5);

        b6 = new JButton("Exit");
        b6.setBounds(580, 0, 35, 15);
        b6.setFont(f3);
        b6.setCursor(cursor);
        b6.setForeground(Color.red);
        b6.setBackground(Color.decode("#FFE4C4"));
        add(b6);

        b7 = new JButton("Merket Cost");
        b7.setBounds(20, 356, 80, 15);
        b7.setFont(f3);
        b7.setCursor(cursor);
        b7.setForeground(Color.red);
        b7.setBackground(Color.decode("#FFE4C4"));
        add(b7);

        b8 = new JButton("Balance");
        b8.setBounds(476, 356, 60, 15);
        b8.setFont(f3);
        b8.setCursor(cursor);
        b8.setForeground(Color.red);
        b8.setBackground(Color.decode("#FFE4C4"));
        add(b8);

        b9 = new JButton("Show Meal");
        b9.setBounds(270, 363, 80, 15);
        b9.setFont(f3);
        b9.setCursor(cursor);
        b9.setForeground(Color.red);
        b9.setBackground(Color.decode("#FFE4C4"));
        add(b9);

        b10 = new JButton("Add Meal");
        b10.setBounds(170, 363, 80, 15);
        b10.setFont(f3);
        b10.setCursor(cursor);
        b10.setForeground(Color.red);
        b10.setBackground(Color.decode("#FFE4C4"));
        add(b10);

        // Addmember
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new AddMember();
            }
        });

        // Dsiplay
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new Details();

            }
        });

        // Back
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new Manager();
            }
        });
        // Exit
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);

            }
        });
        // Delete
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new DeleteMember();
            }
        });
        // Search
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new SearchMember();
            }
        });

    }

    public static void main(String[] args) {
        new ManagerDashboard();
    }

}

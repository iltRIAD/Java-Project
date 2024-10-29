import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.plaf.TextUI;
import javax.swing.text.AttributeSet.FontAttribute;
import javax.swing.text.StyledEditorKit.FontSizeAction;
import javax.swing.*;

public class Notice extends JFrame {
    JButton b1, b2;

    Notice() {
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Notice.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bachelor's Home");
        setSize(1666, 934);
        setLayout(null);
        setVisible(true);

        b1 = new JButton("EXIT");
        b1.setBounds(1320, 0, 100, 30);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.setBackground(Color.red);
        b1.setOpaque(true);
        add(b1);

        b2 = new JButton("PREVIOUS");
        b2.setBounds(0, 0, 150, 30);
        b2.setFont(new Font("Arial", Font.BOLD, 15));
        b2.setBackground(Color.green);
        b2.setOpaque(true);
        b2.setBorderPainted(false);
        b2.setForeground(Color.BLACK);
        add(b2);

        // EXIT
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
            }
        });
        // PREVIOUS
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Window();
            }
        });

    }

    public static void main(String[] args) {
        new Notice();
    }
}
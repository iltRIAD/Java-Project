import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.util.*;
import java.lang.*;
import java.lang.ref.Cleaner;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.nio.file.*;

public class Details extends JFrame {
    JTextArea t1;
    Font f1;

    Details() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bachelor's Home");
        this.setSize(1186, 782);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        f1 = new Font("Segoe UI Black", Font.PLAIN, 15);

        t1 = new JTextArea();
        t1.setBounds(100, 100, 150, 100);
        t1.setFont(f1);
        add(t1);

        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Screenshot1.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fin = new FileInputStream("Member_Userdata.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);

                // t1.setText();
            }
            bin.close();
            t1.setVisible(true);
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        setVisible(false);
        new ManagerDashboard();

    }

    public static void main(String[] args) {
        new Details();
    }
}

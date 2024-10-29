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

public class Window {
	JFrame f;
	JButton b;
	JButton b1;
	JButton b2;
	JButton b3;

	public Window() {

		JFrame f = new JFrame();
		try {
			f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Hand.jpg")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		JButton b = new JButton("JOIN");
		b.setBounds(970, 160, 255, 135);
		JButton b1 = new JButton("Contribution");
		b1.setBounds(1300, 0, 140, 30);
		JButton b2 = new JButton("About");
		b2.setBounds(1300, 30, 140, 30);
		JButton b3 = new JButton("Notice");
		b3.setBounds(1300, 60, 140, 30);
		b.setBackground(Color.cyan);
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.green);
		b3.setBackground(Color.red);
		b.setOpaque(true);
		b.setBorderPainted(false);
		b1.setOpaque(true);
		b1.setBorderPainted(false);
		b2.setOpaque(true);
		b2.setBorderPainted(false);
		b3.setOpaque(true);
		b3.setBorderPainted(false);
		b.setFont(new Font("Arial", Font.BOLD, 50));
		b1.setFont(new Font("Arial", Font.BOLD, 15));
		b2.setFont(new Font("Arial", Font.BOLD, 15));
		b3.setFont(new Font("Arial", Font.BOLD, 15));
		b.setForeground(Color.RED);
		b1.setForeground(Color.PINK);
		b2.setForeground(Color.yellow);
		b.setHorizontalTextPosition(JButton.CENTER);
		f.add(b);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setTitle("Bachelor's Home");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1472, 832);
		f.setLayout(null);
		f.setVisible(true);

		// JOIN
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				f.setVisible(false);
				new HomeLogin();
			}
		});

		// CONTRIBUTIONS
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				f.setVisible(false);
				new Contributions();
			}
		});

		// Notice
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				f.setVisible(false);
				new About();
			}
		});

		// About
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				f.setVisible(false);
				new Notice();
			}
		});

	}

}
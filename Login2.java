import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login2 {

    Login2() {
        JFrame f = new JFrame();
        int res = JOptionPane.showOptionDialog(new JFrame(), "Whats you", "Login2",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new Object[] { "Manager", "Member" }, JOptionPane.YES_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            System.out.println("Selected Manager!");
        } else if (res == JOptionPane.NO_OPTION) {
            System.out.println("Selected Member!");
        } else if (res == JOptionPane.CLOSED_OPTION) {
            System.out.println("Window closed without selecting!");
        }
        f.setSize(1572, 948);
        f.setLayout(null);
        f.setVisible(true);
    }
}
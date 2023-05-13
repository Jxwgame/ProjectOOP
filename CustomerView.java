import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CustomerView {
    private JFrame fr;
    private JPanel panel;
    private JMenuBar mbbar;
    private JMenu menu, profile, basket;
    private JMenuItem Logout, myaccount;
    private JButton bt;
    private JLabel lb;
    public CustomerView(){
        fr = new JFrame();
        panel = new JPanel();
        mbbar = new JMenuBar();
        menu = new JMenu("🏡 Menu");
        profile = new JMenu("Hi What's up Babie yo!");
        basket = new JMenu("My purchase");
        myaccount = new JMenuItem("My account");
        Logout = new JMenuItem("Logout");
        lb = new JLabel();
        
        profile.add(myaccount);
        profile.add(Logout);
        //basket.setIcon(icon);
        mbbar.setBackground(new Color(230, 132, 28));
        mbbar.setLayout(new BoxLayout(mbbar, BoxLayout.X_AXIS));
        fr.setJMenuBar(mbbar);
        mbbar.add(menu);
        mbbar.add(Box.createHorizontalGlue());
        mbbar.add(basket);
        mbbar.add(profile);
        
        //fr.setUndecorated(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1500, 900);
        fr.setLocation(100, 100);
        fr.getRootPane().setBorder(BorderFactory.createEmptyBorder());
        fr.setLayout(null);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new CustomerView();
    }
}

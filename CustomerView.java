import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class CustomerView {
    private JFrame fr;
    private JPanel panelup;
    private JMenuItem logout, myaccount;
    private JPopupMenu popup;
    private JLabel purchase, account, logo;
    public CustomerView(){
        ImageIcon icon = null;
        fr = new JFrame();
        panelup = new JPanel();
        myaccount = new JMenuItem("My account");
        logout = new JMenuItem("Logout");
        popup = new JPopupMenu();
        URL imageURL = CustomerView .class.getResource("Image/logomarket.png");
        if (imageURL != null) {
            icon = new ImageIcon(imageURL);
        }
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);
        logo = new JLabel("CatchCoin", icon, JLabel.CENTER);
        
        ImageIcon icon2 = null;
        URL imageURL2 = CustomerView.class.getResource("Image/human.png");
        if (imageURL != null) {
            icon2 = new ImageIcon(imageURL2);
        }
        Image img2 = icon2.getImage();
        Image newImg2 = img2.getScaledInstance(45,38,Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg2);
        account = new JLabel("My account", icon, JLabel.CENTER);
        
        ImageIcon icon3 = null;
        URL imageURL3 = CustomerView.class.getResource("Image/basket.png");
        if (imageURL != null) {
            icon3 = new ImageIcon(imageURL3);
        }
        Image img3 = icon3.getImage();
        Image newImg3 = img3.getScaledInstance(48,48,Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg3);
        purchase = new JLabel("My purchase", icon, JLabel.CENTER);
        
        Font font = new Font("Arial", Font.PLAIN, 18);
        purchase.setFont(font);
        account.setFont(font);
        logo.setFont(font);
        account.setFont(font);
        logout.setFont(font);
        myaccount.setFont(font);
        
        myaccount.setForeground(Color.WHITE);
        logout.setForeground(Color.RED);
        popup.setPreferredSize(new Dimension(220, 60));
        popup.add(logout);
        
        logo.setForeground(Color.WHITE);
        logo.setBounds(-30, 0, 220, 60);
        logo.setOpaque(false);
        
        account.setForeground(Color.WHITE);
        account.setBounds(1025, 0, 220, 60);
        account.setOpaque(false);
        
        purchase.setForeground(Color.WHITE);
        purchase.setBounds(850, 0, 220, 60);
        purchase.setOpaque(false);
        
        panelup.setBackground(Color.blue);
        panelup.setBounds(0, 0, 1250, 60);
        panelup.add(account);
        panelup.setLayout(null);
        panelup.add(logo);
        panelup.add(purchase);
        
        //fr.setUndecorated(true);
        fr.add(panelup);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1250, 700);
        fr.setLocation(100, 100);
        fr.getContentPane().setBackground(Color.WHITE);
        fr.setLayout(null);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new CustomerView();
    }
    public JFrame getfr(){
        return this.fr;
    }
    public JLabel getpurchase(){
        return this.purchase;
    }
}

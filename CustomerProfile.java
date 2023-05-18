import java.awt.*;
import java.net.URL;
import javax.swing.*;
public class CustomerProfile {
    private JFrame fr;
    private JLabel username, name, email, phone, acct, gender;
    private JRadioButton male, female, other;
    private JTextField tfuser, tfname, tfemail, tfphone;
    private JButton save;
    private ButtonGroup btngroup;
    private JPanel panel1, panel2;
    public CustomerProfile(){
        fr = new JFrame();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");
        btngroup = new ButtonGroup();
        username = new JLabel("  Usename :");
        name = new JLabel("      Name :");
        email = new JLabel("      Email :");
        phone = new JLabel("      Phone :");
        acct = new JLabel("   My Account");
        gender = new JLabel("     Gender");
        panel1 = new JPanel();
        panel2 = new JPanel();
        tfname = new JTextField();
        tfemail = new JTextField();
        tfuser = new JTextField();
        tfphone = new JTextField();
        save = new JButton("Save");
        
        Font fontlb = new Font("Arial", Font.PLAIN, 18);
        username.setFont(fontlb);
        name.setFont(fontlb);
        email.setFont(fontlb);
        phone.setFont(fontlb);
        gender.setFont(fontlb);
        save.setFont(fontlb);
        
        Font fontmain = new Font("Arial", Font.PLAIN, 26);
        acct.setFont(fontmain);
        acct.setBounds(350, 20, 400, 100);
        
        username.setBounds(250, 100, 400, 40);
        name.setBounds(250, 150, 400, 40);
        email.setBounds(250, 200, 400, 40);
        phone.setBounds(250, 250, 400 ,40);
        
        tfuser.setBounds(350, 110, 250, 25);
        tfname.setBounds(350, 160, 250 ,25);
        tfemail.setBounds(350, 210, 250, 25);
        tfphone.setBounds(350, 260, 250, 25);
        
        save.setBackground(new Color(102, 178, 255));
        save.setBounds(385, 310, 80, 40);
        save.setForeground(Color.white);
        //panel1.setBackground(new Color(102, 178, 255));
        //panel1.setBounds(240, 20, 450, 300);
        
        
        fr.add(acct);
        fr.add(username);
        fr.add(name);
        fr.add(email);
        fr.add(phone);
        fr.add(tfuser);
        fr.add(tfname);
        fr.add(tfemail);
        fr.add(tfphone);
        fr.add(panel1);
        fr.add(save);
        fr.setLayout(null);
        //fr.add(male); fr.add(female); fr.add(other);
        //fr.add(panel2);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(850, 600);
        fr.setLocation(100, 100);
        fr.setResizable(false);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new CustomerProfile();
    }
}

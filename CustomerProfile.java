import java.awt.*;
import java.net.URL;
import javax.swing.*;
public class CustomerProfile {
    private JFrame fr;
    private JLabel username, name, email, phone, acct, gender;
    private JRadioButton male, female, other;
    private JTextField tfuser, tfname, tfemail, tfphone;
    private ButtonGroup btngroup;
    private JPanel panel1, panel2;
    public CustomerProfile(){
        fr = new JFrame();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");
        btngroup = new ButtonGroup();
        username = new JLabel("  Usename");
        name = new JLabel("      Name");
        email = new JLabel("      Email");
        phone = new JLabel("      Phone");
        acct = new JLabel("   My Account");
        gender = new JLabel("     Gender");
        panel1 = new JPanel();
        panel2 = new JPanel();
        tfname = new JTextField();
        tfemail = new JTextField();
        tfuser = new JTextField();
        tfphone = new JTextField();
        
        Font fontlb = new Font("Arial", Font.PLAIN, 18);
        username.setFont(fontlb);
        name.setFont(fontlb);
        email.setFont(fontlb);
        phone.setFont(fontlb);
        gender.setFont(fontlb);
        
        Font fontmain = new Font("Arial", Font.PLAIN, 22);
        acct.setFont(fontmain);
        acct.setBounds(350, 10, 400, 100);
        
        username.setBounds(250, 100, 400, 50);
        name.setBounds(250, 150, 400, 50);
        email.setBounds(250, 200, 400, 50);
        phone.setBounds(250, 250, 400 ,50);
        
        tfuser.setBounds(350, 110, 300, 25);
        tfname.setBounds(350, 160, 300 ,25);
        tfemail.setBounds(350, 210, 300, 25);
        tfphone.setBounds(350, 260, 300, 25);
        
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

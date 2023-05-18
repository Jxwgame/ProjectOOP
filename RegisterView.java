import java.awt.*;
import javax.swing.*;
import java.net.URL;
public class RegisterView {
    private JFrame fr;
    private JPasswordField pass1, pass2;
    private JLabel username, password, phone, name, passwordconfirm, register;
    private JTextField tfuser, tfphone, tfname;
    private JPanel panel1;
    public RegisterView(){
        fr = new JFrame();
        pass1 = new JPasswordField(20);
        pass2 = new JPasswordField(20);
        register = new JLabel("Register");
        username = new JLabel("Username :");
        password = new JLabel("Password :");
        passwordconfirm = new JLabel("Confirm Password :");
        name = new JLabel("Name :");
        phone = new JLabel("Phone :");
        tfuser = new JTextField();
        tfphone = new JTextField();
        tfname = new JTextField();
        panel1 = new JPanel();
        
        Font fontlb = new Font("Arial", Font.PLAIN, 18);
        username.setFont(fontlb);
        password.setFont(fontlb);
        passwordconfirm.setFont(fontlb);
        name.setFont(fontlb);
        phone.setFont(fontlb);
        tfuser.setFont(fontlb);
        tfname.setFont(fontlb);
        tfphone.setFont(fontlb);
        
        register.setFont(new Font("Arial", Font.PLAIN, 24));
        
        register.setBounds(370, -100, 300, 300);
        username.setBounds(200, -50, 300, 300);
        password.setBounds(200, 20, 300 ,300);
        passwordconfirm.setBounds(200, 85, 300, 300);
        name.setBounds(200, 150, 300, 300);
        phone.setBounds(200, 210, 300, 300);
        
        tfuser.setBounds(200, 120, 350, 30);
        pass1.setBounds(200, 185, 350, 30);
        pass2.setBounds(200, 250, 350, 30);
        tfname.setBounds(200, 315, 350, 30);
        tfphone.setBounds(200, 375, 350, 30);
        
        panel1.setBackground(new Color(125, 232, 232));
        panel1.setBounds(0, 0, 400, 500);
        
        fr.add(register);
        fr.add(username);
        fr.add(password);
        fr.add(passwordconfirm);
        fr.add(name);
        fr.add(phone);
        
        fr.add(tfuser);
        fr.add(pass1);
        fr.add(pass2);
        fr.add(tfname);
        fr.add(tfphone);
        fr.add(panel1);
        
        fr.setLayout(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(800, 500);
        fr.setLocation(100, 100);
        fr.setResizable(false);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new RegisterView();
    }
}

import java.awt.*;
import java.net.URL;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Cart {
    private JButton btn;
    private JLabel lb1;
    private JPanel pList, panelmain;
    private JList<String> cartList;
    private DefaultListModel<String> cartListModel;
    private JButton bDel, bPay;
    
    public Cart(){
        btn = new JButton("Pay");
        lb1 = new JLabel("");
        pList = new JPanel();
        bDel = new JButton("Delete");
        bPay = new JButton("Pay");
        panelmain = new JPanel();
        
        JScrollPane spList = new JScrollPane();
        cartListModel = new DefaultListModel<>();
        cartList = new JList<>(cartListModel);
        cartList.setFont(new java.awt.Font("Arail", java.awt.Font.PLAIN, 24));
        spList.setViewportView(cartList);
        
        spList.setBounds(0, 0, 600, 400);
        //BasicInternalFrameUI ui2 = (BasicInternalFrameUI) ifList.getUI();
        //ui2.setNorthPane(null);
        bDel.setFont(new java.awt.Font("Arail", java.awt.Font.PLAIN, 26));
        bDel.setBounds(250, 450, 120, 75);
        bPay.setFont(new java.awt.Font("Arail", java.awt.Font.PLAIN, 26));
        bPay.setBounds(100, 450, 120, 75);
        
        panelmain.add(bDel);
        panelmain.add(bPay);
        panelmain.add(spList);
        panelmain.setSize(1250, 700);
        panelmain.setLocation(100, 100);
        panelmain.setLayout(null);
        panelmain.setVisible(false);
    }
    public static void main(String[] args) {
        new Cart();
    }
    public JPanel getPanel(){
        return this.panelmain;
    }
    public void addCart(JLabel l){
        cartListModel.addElement(l.getText());
    }
}

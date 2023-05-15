import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CustomerController implements ActionListener, MouseListener{
    private CustomerView cv;
    public CustomerController(){
        cv = new CustomerView();
        init();
    }
    public void init(){
        cv.getPurchase().addMouseListener(this);
        cv.getMyaccount().addActionListener(this);
        //cv.getLogo().addMouseListener(this);
        cv.getAccount().addMouseListener(this);
        cv.getLogout().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(cv.getAccount())){
            cv.clickPopup();
        }
        else if(e.getSource().equals(cv.getPurchase())){
            
        }
        else if(e.getSource().equals(cv.getAccount())){
            
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
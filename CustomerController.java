import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CustomerController implements ActionListener, MouseListener{
    private CustomerView cv;
    private Cart c;
    public CustomerController(CustomerView cv){
        this.cv = cv;
        //cv = new CustomerView();
        init();
    }
    public void init(){
        cv.getPurchase().addMouseListener(this);
        cv.getMyaccount().addActionListener(this);
        cv.getLogo().addMouseListener(this);
        cv.getAccount().addMouseListener(this);
        cv.getLogout().addActionListener(this);
        for (int i=0; i<cv.getArrayList().size(); i++) {
            ((JLabel)cv.getArrayList().get(i)).addMouseListener(this);
        }
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
        else if(e.getSource().equals(cv.getLogout())){
            // Back to Login
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(cv.getPurchase())){
            cv.getC().getPanel().setVisible(true);
            cv.getPanelItem().setVisible(false);
        }
        else if(e.getSource().equals(cv.getLogo())){
            cv.getC().getPanel().setVisible(false);
            cv.getPanelItem().setVisible(true);
        }
        else if(cv.getArrayList().indexOf(e.getSource())!=-1){
            cv.getC().addCart((JLabel)cv.getArrayList().get(cv.getArrayList().indexOf(e.getSource())));
        }
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
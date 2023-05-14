/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaswing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class JFrameDemo extends JFrame implements ActionListener{
    //private JFrame frame;
    JButton okButton,exitButton,cancelButton;
    
    
    public JFrameDemo(){
        createAndShow();
    }

  
    private void createAndShow() {
        okButton = new JButton( "OK");
        exitButton =  new JButton("Exit");
        cancelButton = new JButton("Cancel");
        
        //frame = new JFrame("Title");
        setTitle("Vân Chinh");
        this.setSize(400,300);
        this.setLocationRelativeTo(null); // hiển thị ra giữa màn hình
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tắt running
        
        this.add(okButton);
        okButton.setActionCommand("ok");
        okButton.addActionListener(this);
        okButton.setMnemonic(KeyEvent.VK_O);
        okButton.setToolTipText("Click nút OK để xác nhận"); //hiển thị
        
        this.add(exitButton);
        exitButton.setActionCommand("exit");
        exitButton.addActionListener(this);
        exitButton.setMnemonic(KeyEvent.VK_E);
        exitButton.setToolTipText("Click vào nút này để thoát");
        
        
        this.add(cancelButton);
        cancelButton.setActionCommand("cancel");
        cancelButton.addActionListener(this);
        cancelButton.setMnemonic(KeyEvent.VK_C); // phím tắt  alt+C
        cancelButton.setToolTipText("Click nút cancel để hủy thao tác vừa chọn");
       
        this.setLayout(new FlowLayout()); // tạo khung cho nút ok
        //this.pack(); giống setSize
        
        setVisible(true);//hiển thị
        
    }
    
       
    public static void main(String[] args) {
      new JFrameDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("ok".equals(e.getActionCommand()))
            JOptionPane.showMessageDialog(rootPane,"Ban vua an nut OK");
        if("exit".equals(e.getActionCommand()))
            System.exit(0);
        if("cancel".equals(e.getActionCommand()))
            JOptionPane.showConfirmDialog(rootPane, "Ban co chac muon huy bo khong");
    }

}

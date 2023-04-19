// This class use for UI and main class

package antivirus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UI extends JFrame{
    public static JTextField inputField;
    public static JTextArea outputField;
    JButton button;
    ImageIcon icon;
    
    void window(){
        this.getContentPane().setLayout(null);
        
        icon=new ImageIcon(getClass().getResource("shield.png"));
        setIconImage(icon.getImage());
        
        //setting the size and location of the frame
        setSize(700,500);
        setLocationRelativeTo(null);
        setResizable(false);
        
        //setting the title of the frame and activating default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Antivirus");
        
        outputField=new JTextArea();
        outputField.setEditable(false);
        outputField.setBounds(20,20,650,290);
        this.getContentPane().add(outputField);
        
        inputField=new JTextField();
        inputField.setBounds(20,320,650,40);
        this.getContentPane().add(inputField);
        
        button=new JButton("Scan Now");
        button.setBounds(300,360,100,40);
        this.getContentPane().add(button);
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                /*outputField.append(inputField.getText());
                outputField.append("Hello");*/
                outputField.setText("");
                Hexvalu ob = new Hexvalu();
            }
        });
        
        //activating the visibility of the calculator frame
        setVisible(true);
    }
    
    public static void main(String[] args){
        UI ui=new UI();
        ui.window();
    }
}
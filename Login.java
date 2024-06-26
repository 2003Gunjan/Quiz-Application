/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application; 
import java.awt.Color;
import javax.swing.*;//Jframe class is present inside the extended package of java 
import java.awt.*;
import java.awt.event.*; 


public class Login extends JFrame implements ActionListener { 
    
    JButton rules,back;
    JTextField tfname;
     Login(){  
         getContentPane().setBackground(Color.white);  
         setLayout(null);
         ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/login.jpeg"));//jframe k andar ek class hoti hai 
        //ImageIcon i1= new ImageIcon(Login.class.getResource("/icon/login.jpeg")); 
        

         JLabel image= new JLabel(i1); 
         image.setBounds(0,0,500, 500);
         add(image);  
         
         JLabel heading = new JLabel("simple Minds");
         heading .setBounds(750,60,300,45);
         heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40)); 
         heading.setForeground(new Color(30,144,254)); 
         add(heading);  
         
         JLabel name = new JLabel("Enter your name");
         heading .setBounds(810,150,300,20);
         heading.setFont(new Font("Mangolian Baiti",Font.BOLD,40)); 
         heading.setForeground(new Color(30,144,254)); 
         add(heading); 
         
          tfname= new JTextField();
         tfname.setBounds(735,200,300,25); 
         tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
         add(tfname); 
         
         rules= new JButton("Rules");
         rules.setBounds(735,270,120,25);
         rules.setBackground(new Color(30,144,254));
         rules.setForeground(Color.WHITE);
         rules.addActionListener(this);
         add(rules); 
         
         back= new JButton("Back");
         back.setBounds(915,200,300,25);
         back.setBackground(new Color(30,144,254));
         back.setForeground(Color.WHITE);
         back.addActionListener(this);
         add(back);
         
         setSize(900,500);
         setLocation(100,120);
         setVisible(true);
} 
     public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
   public static void main(String[] args){
         new Login();       
   }
}

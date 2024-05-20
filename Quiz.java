/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;
import javax.swing.*;
import java.awt.*;

public class Quiz  extends JFrame{ 
    Quiz(){
        setBounds(50,0,1440,850);
        getContentPane().setBackground(Color.WHITE); 
        setLayout(null); 
         ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/quiz.jpg"));//jframe k andar ek class hoti hai 
        //ImageIcon i1= new ImageIcon(Login.class.getResource("/icon/login.jpeg")); 
        

         JLabel image= new JLabel(i1); 
         image.setBounds(0,0,1440, 392);
         add(image); 
        setVisible(true); 
    }
    public static void main(String[] args){
        new Quiz();
    }
    
    
}

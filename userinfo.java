//package RMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.nio.file.*;
import java.io.IOException;


public class userinfo extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	   
	JButton b1,b2,b3;

    JPanel P1,P2;

    String line1,line2,line3,line4,line5;

	


    public userinfo()
    {
        super("user info");
        this.setSize(750,510);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
        


    // panels
       
        P1 = new JPanel();
        P1.setBounds(0,0,750,80);
        P1.setBackground(new Color(124,124,124));
        P1.setBorder(BorderFactory.createLineBorder(Color.black));
        P1.setLayout(null);

        
        P2 = new JPanel();
        P2.setBounds(0,80,750,430);
        P2.setBackground(new Color(218,227,243));
        P2.setBorder(BorderFactory.createLineBorder(Color.black));
        P2.setLayout(null);

        

    //panel 1 

        l1 = new JLabel("User information");
        l1.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,38));
        l1.setForeground(Color.black);
        l1.setBounds(20,22,480,35);
        P1.add(l1);
        
        
        b1 = new JButton("Sign out");
        b1.setFont(new Font("Serif",Font.BOLD,20));
        b1.setBackground(Color.green);
        b1.setBounds(600, 20, 110, 35);
        b1.addActionListener(this);
        b1.setFocusable(false);
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P1.add(b1);


    
    // panel 2 

        b2 = new JButton("Back");
        b2.setFont(new Font("Serif",Font.BOLD,20));
        b2.setBackground(Color.orange);
        b2.setBounds(40, 420, 100, 35);
        b2.addActionListener(this);
        b2.setFocusable(false);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b2);


        b3 = new JButton("Password change");
        b3.setFont(new Font("Serif",Font.BOLD,20));
        b3.setBackground(Color.pink);
        b3.setBounds(490, 420, 200, 35);
        b3.addActionListener(this);
        b3.setFocusable(false);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b3);






   
    //name
   
        l2 = new JLabel();
        l2.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,20));
        l2.setForeground(Color.black);
        l2.setBounds(55,120,480,35);
        P2.add(l2);


      

    //password
        l3 = new JLabel();
        l3.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,20));
        l3.setForeground(Color.black);
        l3.setBounds(55,170,480,35);
        P2.add(l3);




    //mobile
        l4 = new JLabel();
        l4.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,20));
        l4.setForeground(Color.black);
        l4.setBounds(55,220,480,35);
        P2.add(l4);





    //email
        l5 = new JLabel();
        l5.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,20));
        l5.setForeground(Color.black);
        l5.setBounds(55,270,480,35);
        P2.add(l5);


    //gender
        l6 = new JLabel();
        l6.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,20));
        l6.setForeground(Color.black);
        l6.setBounds(55,320,480,35);
        P2.add(l6);



        try{
            BufferedReader reader = new BufferedReader(new FileReader("data\\login data.txt"));
            reader.close();
     
            line1 = Files.readAllLines(Paths.get("data\\login data.txt")).get(0);
            line2 = Files.readAllLines(Paths.get("data\\login data.txt")).get(1);
            line3 = Files.readAllLines(Paths.get("data\\login data.txt")).get(2);
            line4= Files.readAllLines(Paths.get("data\\login data.txt")).get(3);
            line5 = Files.readAllLines(Paths.get("data\\login data.txt")).get(4);

            l2.setText(line1);
            l3.setText(line2);
            l4.setText(line3);
            l5.setText(line4);
            l6.setText(line5);





            } 
            catch(IOException e){}



        
        this.add(P1);
        this.add(P2);
        
        setVisible(true);

    }

    

    public void actionPerformed(ActionEvent ae){

       
		if(ae.getSource()==b1)
		{
			
			Login L = new Login();
            this.setVisible(false);
		    L.setVisible(true);

		  
		}

        else if(ae.getSource()==b2)
		{
			food f = new food();
			this.setVisible(false);
		    f.setVisible(true);
		}

        else if(ae.getSource()==b3)
		{
			passwordChange pc = new passwordChange();
			this.setVisible(false);
		    pc.setVisible(true);
		}

        
    }

    

    public static void main(String [] args)
	{
		userinfo u = new userinfo();
		
	}

}

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


public class passwordChange extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	   
	JButton b1,b2,b3,b4,b5,b6;

    JPanel P1,P2,P3,P4,P5,P6;

    JTextField t1;

    JPasswordField pa1,pa2,pa3;

    String line1,line2,line3,line4,line5;

    JCheckBox c1,c2;
	


    public passwordChange()
    {
        super("passwordChange");
        this.setSize(750,510);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      


    // panels
       
        P1 = new JPanel();
        P1.setBounds(0,0,750,70);
        P1.setBackground(new Color(118,113,113));
        P1.setBorder(BorderFactory.createLineBorder(Color.black));
        P1.setLayout(null);

        
        P2 = new JPanel();
        P2.setBounds(0,70,750,440);
        P2.setBackground(new Color(219,219,219));
        P2.setBorder(BorderFactory.createLineBorder(Color.black));
        P2.setLayout(null);


        P3 = new JPanel();
        P3.setBounds(0,70,750,440);
        P3.setBackground(new Color(219,219,219));
        P3.setBorder(BorderFactory.createLineBorder(Color.black));
        P3.setLayout(null);

        

    //panel 1 

        l1 = new JLabel("RMS");
        l1.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,35));
        l1.setForeground(Color.orange);
        l1.setBounds(20,22,480,35);
        P1.add(l1);
        
        
        b1 = new JButton("Back");
        b1.setFont(new Font("Serif",Font.BOLD,20));
        b1.setBackground(Color.orange);
        b1.setBounds(40, 420, 100, 35);
        b1.addActionListener(this);
        b1.setFocusable(false);
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b1);


    
    // panel 2 

        b2 = new JButton("Continue");
        b2.setFont(new Font("Serif",Font.BOLD,20));
        b2.setBackground(Color.green);
        b2.setBounds(570, 420, 130, 35);
        b2.addActionListener(this);
        b2.setFocusable(false);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b2);

   
   
        l2 = new JLabel("Please verify yourself : ");
        l2.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,23));
        l2.setForeground(Color.black);
        l2.setBounds(65,130,480,35);
        P2.add(l2);


    
    //username
        l3 = new JLabel("User name : ");
        l3.setFont(new Font("Serif",Font.PLAIN,20));
        l3.setForeground(Color.black);
        l3.setBounds(155,210,200,35);
        P2.add(l3);

        
        t1 = new JTextField();
		t1.setFont(new Font("Serif",Font.PLAIN,18));
        t1.setBounds(260,215,270,27);
        P2.add(t1);


    //password

        l4 = new JLabel("Password : ");
        l4.setFont(new Font("Serif",Font.PLAIN,20));
        l4.setForeground(Color.black);
        l4.setBounds(155,280,200,35);
        P2.add(l4);

        pa1 = new JPasswordField();
        pa1.setEchoChar('*');
		pa1.setFont(new Font("Serif",Font.PLAIN,19));
        pa1.setBounds(260,285,270,27);
        P2.add(pa1);



    //panel 3

        l5 = new JLabel("Enter your new password : ");
        l5.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,23));
        l5.setForeground(Color.black);
        l5.setBounds(65,130,480,35);
        P3.add(l5);

       //new password
        l6 = new JLabel("New password : ");
        l6.setFont(new Font("Serif",Font.PLAIN,20));
        l6.setForeground(Color.black);
        l6.setBounds(125,210,200,35);
        P3.add(l6);

        
        pa2 = new JPasswordField();
        pa2.setEchoChar('*');
		pa2.setFont(new Font("Serif",Font.PLAIN,20));
        pa2.setBounds(260,215,270,27);
        P3.add(pa2);


       //retype password
        l7 = new JLabel("Retype password : ");
        l7.setFont(new Font("Serif",Font.PLAIN,20));
        l7.setForeground(Color.black);
        l7.setBounds(105,280,200,35);
        P3.add(l7);

        pa3 = new JPasswordField();
        pa3.setEchoChar('*');
		pa3.setFont(new Font("Serif",Font.PLAIN,20));
        pa3.setBounds(260,285,270,27);
        P3.add(pa3);

       //confirm button
        b3 = new JButton("Confirm");
        b3.setFont(new Font("Serif",Font.BOLD,20));
        b3.setBackground(Color.orange);
        b3.setBounds(570, 420, 130, 35);
        b3.addActionListener(this);
        b3.setFocusable(false);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P3.add(b3);


    //checkbox
       c1 = new JCheckBox("Show password");
	   c1.setFont(new Font("Serif",Font.PLAIN,16));
	   c1.setForeground(Color.black);
	   c1.setBackground(new Color(219,219,219));
	   c1.setBounds(260,320,270,38);
	   c1.addActionListener(this); 
	   c1.setFocusable(false);
	   c1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(c1);


        this.add(P1);
        this.add(P2);
        
        setVisible(true);

    }

    

    public void actionPerformed(ActionEvent ae)
    {

		if(ae.getSource()==b1)
		{
			userinfo u = new userinfo();
            this.setVisible(false);
		    u.setVisible(true);		  
		}

        else if(ae.getSource()==b2)
		{

            if(t1.getText().length() <=0 || pa1.getText().length() <=0){
				JOptionPane.showMessageDialog(this,"Fill all information");}

            else{

                try{

                    BufferedReader reader = new BufferedReader(new FileReader("data\\login data.txt"));
                     line1 = Files.readAllLines(Paths.get("data\\login data.txt")).get(0);
                     line2 = Files.readAllLines(Paths.get("data\\login data.txt")).get(1);
                    reader.close();

                    String userNameS = "Name        :  "+t1.getText();
					String passwordS = "Password  :  "+pa1.getText();


                         if(line1.equals(userNameS) && line2.equals(passwordS)){
                             this.add(P3);
                             P3.add(c1);
                             P2.setVisible(false);
                             }
                         else{
                            JOptionPane.showMessageDialog(this,"Wrong User name or password");
                         }

                }
                catch(IOException e){}


            }

			
		}

        else if(ae.getSource()==b3)
        {

            if(pa2.getText().length() <=0 || pa3.getText().length() <=0){
				JOptionPane.showMessageDialog(this,"Fill all information");}


            else if(!(pa2.getText()).equals(pa3.getText())){
            JOptionPane.showMessageDialog(this," Password doesn't match ");
            }
            

         else
            {  
               

                 try
                     {
                       

                     BufferedReader readers = new BufferedReader(new FileReader("data\\login data.txt"));
                     line1 = Files.readAllLines(Paths.get("data\\login data.txt")).get(0);
                     line2 = Files.readAllLines(Paths.get("data\\login data.txt")).get(1);
                     readers.close();


                     BufferedReader reader = new BufferedReader(new FileReader("data\\data.txt"));
					 int totalLines = 0;
					 while (reader.readLine() != null)
					 totalLines++;
					 reader.close();


                         for (int i = 0; i <= totalLines; i++) 
                         {

						 String data1 = Files.readAllLines(Paths.get("data\\data.txt")).get(i);

                         BufferedWriter writer = new BufferedWriter(new FileWriter("data\\new data.txt",true));
                         writer.write(data1+"\n");
                        
        
                             if(data1.equals(line1))
                             {
                             String data2 = Files.readAllLines(Paths.get("data\\data.txt")).get(i+1);

                                 if(data2.equals(line2))
                                 {
                                 writer.write("Password  :  "+pa3.getText()+"\n");
                                 writer.close();
                                 i=i+1;
                                 }
                        
                            }
                         writer.close();
   
                         }

                        
                    } 
                    catch(Exception e){}

             JOptionPane.showMessageDialog(null," Password changed succesfully ! ");
             JOptionPane.showMessageDialog(null," Please log in again");
        
             Login l = new Login();
             this.setVisible(false);
             l.setVisible(true);


             File file1 = new File("data\\data.txt");
             file1.delete();




             File file2 = new File("data\\new data.txt");
             File file3 = new File("data\\data.txt");
             file2.renameTo(file3);

             

            


            }

          


        }

    else if(c1.isSelected()){
		pa1.setEchoChar((char)0);
        pa2.setEchoChar((char)0);
        pa3.setEchoChar((char)0);
      
	 }
	else{
	pa1.setEchoChar('*');
    pa2.setEchoChar('*');
    pa3.setEchoChar('*');
   
	}
        
    }



    public static void main(String [] args)
	{
		passwordChange pc = new passwordChange();
		
	}

}

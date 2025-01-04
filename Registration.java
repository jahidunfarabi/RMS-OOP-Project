//package RMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Registration extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	   
	JTextField t1,t2,t3;
	   
	JButton b1,b2;
	   
	JPasswordField pa1,pa2;
	   
	JComboBox c1;

	JCheckBox ch1;
	   
	JPanel P1,P2;

	
	

    public Registration ()
    {
        super(" registration ");
		this.setSize(750,510);
		setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    //creating two panel
        P1 = new JPanel();
        P1.setBounds(0,0,330,500);
        P1.setLayout(null);


		P2 = new JPanel();
        P2.setBounds(330,0,390,500);
        P2.setBackground(new Color(240,240,240));
        P2.setLayout(null);


    //lebels
        l1 = new JLabel("Already have an account?");
		l1.setFont(new Font("Serif",Font.PLAIN,14));
		l1.setForeground(Color.black);
		l1.setBounds(530,10,150,15);
		P2.add(l1);

        l2 = new JLabel("Create your free account");
		l2.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,22));
		l2.setForeground(Color.red);
		l2.setBounds(430,35,500,28);
		P2.add(l2);

      


    //fullname
        l3 = new JLabel("Full Name :");
		l3.setFont(new Font("Serif",Font.PLAIN,16));
		l3.setForeground(Color.black);
		l3.setBounds(340,90,200,20);
		P2.add(l3);
			
		t1 = new JTextField();
		t1.setFont(new Font("Serif",Font.PLAIN,17));
		t1.setBounds(470,90,235,25);
		t1.addActionListener(this);
		P2.add(t1);



    //mobile number
	
        l4 = new JLabel("Mobile Number :");
        l4.setFont(new Font("Serif",Font.PLAIN,16));
        l4.setForeground(Color.black);
        l4.setBounds(340,140,250,25);
        P2.add(l4);
    
		
        t2 = new JTextField();
		t2.setFont(new Font("Serif",Font.PLAIN,16));
        t2.setBounds(470,140,235,25);
		t2.addActionListener(this);
        P2.add(t2);
        


    //email
       l5 = new JLabel("Email :");
	   l5.setFont(new Font("Serif",Font.PLAIN,16));
	   l5.setForeground(Color.black);
	   l5.setBounds(340,190,250,25);
	   P2.add(l5);
			
	   t3 = new JTextField();
	   t3.setFont(new Font("Serif",Font.PLAIN,16));
	   t3.setBounds(470,190,235,25);
	   t3.addActionListener(this);
	   P2.add(t3);



    //gender
       l6 = new JLabel("Gender :");
	   l6.setFont(new Font("Serif",Font.PLAIN,16));
	   l6.setForeground(Color.black);
	   l6.setBounds(340,240,250,22);
	   P2.add(l6);
			
	   String gender[]={"Male","Female"};
	   c1 = new JComboBox(gender);
	   c1.setFont(new Font("Serif",Font.PLAIN,16));
	   c1.setBounds(470,240,235,25);
	   P2.add(c1);


    
    //password
       l7 = new JLabel("Password : ");
	   l7.setFont(new Font("Serif",Font.PLAIN,16));
	   l7.setForeground(Color.black);
	   l7.setBounds(340,290,250,25);
	   P2.add(l7);
			
	   pa1 = new JPasswordField();
	   pa1.setFont(new Font("Serif",Font.PLAIN,16));
	   pa1.setBounds(470,290,235,25);
	   pa1.setEchoChar('*');
	   pa1.addActionListener(this);
	   P2.add(pa1);



    //retype password
       l8 = new JLabel("Retype Password : ");
       l8.setFont(new Font("Serif",Font.PLAIN,16));
       l8.setForeground(Color.black);
       l8.setBounds(340,340,250,25);
       P2.add(l8);
    
       pa2 = new JPasswordField();
	   pa2.setFont(new Font("Serif",Font.PLAIN,16));
       pa2.setBounds(470,340,235,25);
	   pa2.setEchoChar('*');
	   pa2.addActionListener(this);
       P2.add(pa2);




    //button
	   b1 = new JButton("Login");
	   b1.setFont(new Font("Serif",Font.BOLD,14));
	   b1.setForeground(Color.red);
	   b1.setBackground(new Color(240,240,240));
	   b1.setBorder(null);
	   b1.setBounds(685,6,38,20);
	   b1.addActionListener(this);
	   b1.setFocusable(false);
	   b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b1);


	   b2 = new JButton("Create Account");
	   b2.setFont(new Font("Serif",Font.PLAIN,25));
	   b2.setForeground(Color.white);
	   b2.setBackground(new Color(102,140,208));
	   b2.setBounds(400,410,270,38); 
	   b2.addActionListener(this);
	   b2.setFocusable(false);
	   b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b2);


	   ch1 = new JCheckBox("Show password");
	   ch1.setFont(new Font("Serif",Font.PLAIN,14));
	   ch1.setForeground(Color.black);
	   ch1.setBackground(new Color(240,240,240));
	   ch1.setBounds(465,370,270,20);
	   ch1.addActionListener(this); 
	   ch1.setFocusable(false);
	   ch1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(ch1);



    //image
	   l9 = new JLabel(new ImageIcon(getClass().getResource("/image/rimage.png")));
	   l9.setBounds(0,0,350,500);
	   P1.add(l9);


       this.add(P1);
	   this.add(P2);
       setVisible(true);

    }





	public void actionPerformed(ActionEvent ae)
	{
     //login button
		if(ae.getSource()==b1)
		{
			Login L = new Login();
			this.setVisible(false);
		    L.setVisible(true);
		}

      //checking if all info is provied or not
		else if(ae.getSource()==b2){

			if(t1.getText().length() <=0 || t2.getText().length() <=0 || t3.getText().length() <=0 || pa1.getText().length() <=0 || pa2.getText().length() <=0 ){
				JOptionPane.showMessageDialog(this,"Fill all information");
			}


			else if(!(pa1.getText()).equals(pa2.getText())){
				JOptionPane.showMessageDialog(this," Password doesn't match ");
			}


		// making file for data

			else{
				JOptionPane.showMessageDialog(this," Account created successfully !! ");
   

				try{
					BufferedWriter writer = new BufferedWriter(new FileWriter("data\\data.txt", true));
					writer.write("Name        :  "+t1.getText());
					writer.write("\nPassword  :  "+pa1.getText());
					writer.write("\nMobile       :  "+t2.getText());
					writer.write("\nEmail         :  "+t3.getText());
					writer.write("\nGender      :  "+c1.getSelectedItem()+"\n\n=================\n");
					writer.close();

				}
				catch(IOException e){
				    System.out.println("excepton handled");
				}


		// clearing the textfields 

				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				pa1.setText(null);
				pa2.setText(null);
			}

			}


			
		else if(ch1.isSelected()){
		 pa1.setEchoChar((char)0);
		 pa2.setEchoChar((char)0);

		}

		else{
		pa1.setEchoChar('*');
		pa2.setEchoChar('*');
	
	    }

		}

		public static void main(String [] args)
	{
		Registration r = new Registration();
		
	}

}




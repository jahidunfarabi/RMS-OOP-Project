//package RMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class payment extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	   
	JButton b1,b2;

    JRadioButton b3,b4,b5;

    JPanel P1,P2;

    JTextField t1;

    JPasswordField p1;

    JCheckBox c1;



    public payment()
    {
        super("payment");
        this.setSize(750,510);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    // panels
       
        P1 = new JPanel();
        P1.setBounds(0,0,750,50);
        P1.setBackground(new Color(118,113,113));
        P1.setBorder(BorderFactory.createLineBorder(Color.black));
        P1.setLayout(null);

        P2 = new JPanel();
        P2.setBounds(0,50,750,460);
        P2.setBackground(new Color(218,227,243));
        P2.setBorder(BorderFactory.createLineBorder(Color.black));
        P2.setLayout(null);

       

    //panel 1 component

       l1 = new JLabel("RMS");
       l1.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,36));
       l1.setForeground(Color.ORANGE);
       l1.setBounds(20,8,180,35);
       P1.add(l1);

       l2 = new JLabel(". . . Enjoy your food");
       l2.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,12));
       l2.setForeground(Color.orange);
       l2.setBounds(190,27,150,15);
       P1.add(l2);


      
    
    //panel 2 component

       b1 = new JButton("Back");
	   b1.setFont(new Font("Serif",Font.PLAIN,22));
	   b1.setForeground(Color.black);
	   b1.setBackground(new Color(255,230,153));
	   b1.setBounds(40,410,90,35);
	   b1.addActionListener(this);
	   b1.setFocusable(false);
       b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b1);


       b2 = new JButton("Confirm");
	   b2.setFont(new Font("Serif",Font.PLAIN,24));
	   b2.setForeground(Color.black);
	   b2.setBackground(new Color(146,208,80));
	   b2.setBounds(585,410,120,40);
	   b2.addActionListener(this);
	   b2.setFocusable(false);
       b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b2);


       
     //label
       
       l3 = new JLabel("Complete your payment");
       l3.setFont(new Font("Serif",Font.BOLD,32));
       l3.setOpaque(true);
       l3.setBackground(new Color(218,227,243));
       l3.setBounds(210,60,380,40);
       P2.add(l3);

       l4 = new JLabel("We accept : ");
       l4.setFont(new Font("Serif",Font.BOLD,20));
       l4.setOpaque(true);
       l4.setBackground(new Color(218,227,243));
       l4.setBounds(50,140,110,30);
       P2.add(l4);


    //radio button

      //bkash
       b3 = new JRadioButton();
       b3.setBounds(180, 150, 20, 20);
       b3.setBackground(new Color(218,227,243));
       b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       b3.setFocusable(false);
       P2.add(b3);
     
       l5= new JLabel(new ImageIcon(getClass().getResource("/image/bkash.jpg")));
       l5.setOpaque(true);
       l5.setBackground(Color.red);
       l5.setBounds(200, 130, 110, 70);
       P2.add(l5);



       
      //rocket
       b4 = new JRadioButton();
       b4.setBounds(340, 150, 20, 20);
       b4.setBackground(new Color(218,227,243));
       b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       b4.setFocusable(false);
       P2.add(b4);
     
       l6= new JLabel(new ImageIcon(getClass().getResource("/image/rocket.png")));
       l6.setOpaque(true);
       l6.setBackground(Color.red);
       l6.setBounds(365, 130, 110, 70);
       P2.add(l6);


     //nogod
       b5 = new JRadioButton();
       b5.setBounds(500, 150, 20, 20);
       b5.setBackground(new Color(218,227,243));
       b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       b5.setFocusable(false);
       P2.add(b5);
      

       l7= new JLabel(new ImageIcon(getClass().getResource("/image/nogod.jpg")));
       l7.setOpaque(true);
       l7.setBackground(Color.red);
       l7.setBounds(525, 130, 110, 70);
       P2.add(l7);

       ButtonGroup group = new ButtonGroup();
       group.add(b3);
       group.add(b4);
       group.add(b5);


    //mobile number
       l8 = new JLabel("Mobile number : ");
       l8.setFont(new Font("Serif",Font.BOLD,21));
       l8.setOpaque(true);
       l8.setBackground(new Color(218,227,243));
       l8.setBounds(150,270,160,30);
       P2.add(l8);

       t1 = new JTextField();
       t1.setFont(new Font("Serif",Font.PLAIN,21));
       t1.setBounds(320,275,220,28);
       P2.add(t1);


       
    //password
       l9 = new JLabel("Password : ");
       l9.setFont(new Font("Serif",Font.BOLD,21));
       l9.setOpaque(true);
       l9.setBackground(new Color(218,227,243));
       l9.setBounds(150,320,160,30);
       P2.add(l9);

       p1 = new JPasswordField();
       p1.setFont(new Font("Serif",Font.PLAIN,17));
       p1.setEchoChar('*');
       p1.setBounds(320,325,220,28);
       P2.add(p1);




    //checkbox
       c1 = new JCheckBox("Show password");
	   c1.setFont(new Font("Serif",Font.PLAIN,16));
	   c1.setForeground(Color.black);
	   c1.setBackground(new Color(218,227,243));
	   c1.setBounds(315,355,270,38);
	   c1.addActionListener(this); 
	   c1.setFocusable(false);
	   c1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(c1);



        
        this.add(P1);
        this.add(P2);
        
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        
    //for back button
        if(ae.getSource()==b1)
		{
			buyfood bf = new buyfood();
			this.setVisible(false);
		    bf.setVisible(true);
		}


    //checking  if payment method is selected or not  &&   textfield are filled or not

		else if(ae.getSource()==b2)
		{
            if(!(b3.isSelected() || b4.isSelected() || b5.isSelected()))
            {

                JOptionPane.showMessageDialog(this," Please select a payment method");

            }

            else if(t1.getText().length() <=0 || p1.getText().length() <=0){
                JOptionPane.showMessageDialog(this,"Fill all information");
            }

            else{

                JOptionPane.showMessageDialog(this," PAYMENT COMPLETE !!");

                JOptionPane.showMessageDialog(this,"Enjoy your food..");

            food f = new food();
			this.setVisible(false);
		    f.setVisible(true);

            }
	
		}

    // showing password
		else if(c1.isSelected()){
			p1.setEchoChar((char)0);
		  }
		else{
			p1.setEchoChar('*');

		}

       
    }

    

    public static void main(String [] args)
	{
		payment p = new payment();
		
	}

}

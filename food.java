//package RMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class food extends JFrame implements ActionListener {
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	   
	JButton b1,b2,b3,b4,b5,b6;

    JPanel P1,P2,P3;
	    public food()
    {
        super("COLLECTION OF FOOD ");
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
        P2.setBounds(0,40,750,50);
        P2.setBackground(new Color(219,219,219));
        P2.setBorder(BorderFactory.createLineBorder(Color.black));
        P2.setLayout(null);

        P3 = new JPanel();
        P3.setBounds(0,100,750,400);
        P3.setBackground(new Color(216,228,250));
        P3.setLayout(null);
		
		
		 //panel 1 component

       l1 = new JLabel("RMS");
       l1.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,36));
       l1.setForeground(Color.ORANGE);
       l1.setBounds(20,6,180,35);
       P1.add(l1);

       l2 = new JLabel("----Hello Food Lovers! Enjoy Your Food----");
       l2.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,12));
       l2.setForeground(Color.orange);
       l2.setBounds(190,27,150,15);
       P1.add(l2);


       b1 = new JButton(new ImageIcon(getClass().getResource("/image/logo.png")));
	   b1.setBorder(null);
	   b1.setBounds(685,9,34,32);
	   b1.addActionListener(this);
	   b1.setFocusable(false);
       b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(b1);   
	
	//panel 2 component

       b2 = new JButton("FOODS");
	   b2.setFont(new Font("Serif",Font.BOLD,18));
	   b2.setForeground(Color.red);
	   b2.setBackground(new Color(209,209,209));
	   b2.setBorder(null);
	   b2.setBounds(25,12,150,35);
	   b2.addActionListener(this);
	   b2.setFocusable(false);
       b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b2);
	   
	    b3 = new JButton("Menu");
	   b3.setFont(new Font("Serif",Font.PLAIN,18));
	   b3.setForeground(Color.black);
	   b3.setBackground(new Color(219,219,219));
	   b3.setBorder(null);
	   b3.setBounds(230,18,75,25);
	   b3.addActionListener(this);
	   b3.setFocusable(false);
       b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b3);
    
	   
	    b4 = new JButton("Food Price");
	   b4.setFont(new Font("Serif",Font.PLAIN,18));
	   b4.setForeground(Color.black);
	   b4.setBackground(new Color(219,219,219));
	   b4.setBorder(null);
	   b4.setBounds(405,18,100,25);
	   b4.addActionListener(this);
	   b4.setFocusable(false);
       b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b4);
	   
	    b5 = new JButton("Location");
	   b5.setFont(new Font("Serif",Font.PLAIN,18));
	   b5.setForeground(Color.black);
	   b5.setBackground(new Color(219,219,219));
	   b5.setBorder(null);
	   b5.setBounds(600,18,80,25);
	   b5.addActionListener(this);
	   b5.setFocusable(false);
       b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b5);
	   
	   
	    //panel 3 component
       
       l2 = new JLabel("UPCOMMINGS..");
       l2.setFont(new Font("Serif",Font.BOLD | Font.ITALIC ,22));
       l2.setForeground(Color.black);
       l2.setBounds(20,104,200,28);
       P3.add(l2); 

       b6 = new JButton("ORDER NOW!");
	   b6.setFont(new Font("Serif",Font.PLAIN,25));
	   b6.setForeground(Color.white);
	   b6.setBackground(new Color(192,0,0));
	   b6.setBounds(250,415,250,38);
	   b6.addActionListener(this);
	   b6.setFocusable(false);
       b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P3.add(b6);
	   
	   
	    //panel 3 Food image
       l3 = new JLabel(new ImageIcon(getClass().getResource("/image/bom.png")));
	   l3.setBounds(20,150,155,210);
	   P3.add(l3);

       l4 = new JLabel(new ImageIcon(getClass().getResource("/image/oreo.png")));
	   l4.setBounds(200,150,155,210);
	   P3.add(l4);

       l5 = new JLabel(new ImageIcon(getClass().getResource("/image/pasta.png")));
	   l5.setBounds(380,150,155,210);
	   P3.add(l5);

       l6 = new JLabel(new ImageIcon(getClass().getResource("/image/juice.png")));
	   l6.setBounds(560,150,155,210);
	   P3.add(l6);
	   
	   
	   
	   
	   
	   
	    //panel 3 food name
       l7 = new JLabel("Chocolate Bom");
       l7.setFont(new Font("Serif",Font.BOLD,14));
       l7.setForeground(Color.black);
       l7.setBounds(18,365,200,20);
       P3.add(l7); 

       l8 = new JLabel("Oreo Cake");
       l8.setFont(new Font("Serif",Font.BOLD,14));
       l8.setForeground(Color.black);
       l8.setBounds(200,365,200,20);
       P3.add(l8); 

       l9 = new JLabel("Italia Pasta");
       l9.setFont(new Font("Serif",Font.BOLD,14));
       l9.setForeground(Color.black);
       l9.setBounds(390,365,200,20);
       P3.add(l9); 

       l10 = new JLabel("Cranberry Juice");
       l10.setFont(new Font("Serif",Font.BOLD,14));
       l10.setForeground(Color.black);
       l10.setBounds(570,365,200,20);
       P3.add(l10);

       
	   
	   
	   
	    this.add(P1);
        this.add(P2);
        this.add(P3);
        setVisible(true);
	   
	
	
	}
	 public void actionPerformed(ActionEvent ae){

       if(ae.getSource()==b1)
		{
			userinfo u = new userinfo();
			this.setVisible(false);
		    u.setVisible(true);
		}

		else if(ae.getSource()==b3)
		{
			Menu m = new Menu();
			this.setVisible(false);
		    m.setVisible(true);
		}


        else if(ae.getSource()==b4)
		{
			FoodPrice fp = new FoodPrice();
			this.setVisible(false);
		    fp.setVisible(true);
		}


        else if(ae.getSource()==b5)
		{
			location l = new location();
			this.setVisible(false);
		    l.setVisible(true);
		}


        else if(ae.getSource()==b6)
		{
		 buyfood bf = new buyfood();
			this.setVisible(false);
		    bf.setVisible(true);
		}
    }

    



    public static void main(String [] args)
	{
		food f = new food();
		
	}


	
}
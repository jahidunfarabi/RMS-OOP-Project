//package RMS;

import javax.swing.*;  //Light weight GUI widget toolkit and several package
import org.w3c.dom.events.MouseEvent;
import java.awt.*;
import java.awt.event.*;

public class Homepage extends JFrame implements ActionListener{

    JLabel l1;
	   
	JButton b1,b2;
	   
	JPanel P1;

	ImageIcon i1;
	

    public Homepage ()
    {
        super(" homepage ");
		this.setSize(750,510);
		setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    // panel
        P1 = new JPanel();
        P1.setBounds(0,0,750,500);
        P1.setLayout(null);


    //button
	   b1 = new JButton("Exit");
	   b1.setFont(new Font("Serif",Font.BOLD,23));
	   b1.setForeground(Color.white);
	   b1.setBackground( Color.red);
	   b1.setBorder(null);
	   b1.setBounds(25,400,88,36);
	   b1.addActionListener(this);
	   b1.setFocusable(false);
	   b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(b1);


	   b2 =  new JButton ("Get started");
	   b2.setFont(new Font("Serif",Font.BOLD,23));
	   b2.setForeground(Color.white);
	   b2.setBackground(new Color(102,140,208));
	   b2.setBounds(450,390,220,40);
	   b2.addActionListener(this); 
	   b2.setFocusable(false);
	   b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(b2);



    //image
	   l1 = new JLabel(new ImageIcon(getClass().getResource("/image/himage.png")));
	   l1.setBounds(0,0,750,500);
	   P1.add(l1);


       this.add(P1);
       setVisible(true);
 

    }


	public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1)
		{
			this.dispose();
		}

		else if(ae.getSource()==b2)
		{
			Login L = new Login();
			this.setVisible(false);
		    L.setVisible(true);
		}
	}
	  
}
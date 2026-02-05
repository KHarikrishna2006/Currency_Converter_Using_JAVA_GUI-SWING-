package javaprograms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Project extends JFrame implements ItemListener,ActionListener{
	
	static JComboBox c1;
	static JLabel l1;
	static JLabel l5;
	static JComboBox c2;
	static JLabel l2;
	static JTextField t;
	static JButton b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("Currency Converter");
	        frame.getContentPane().setBackground(Color.white);
	       JLabel l=new JLabel("Convert Currency to different Currency Values");
	       l.setHorizontalAlignment(SwingConstants.CENTER);
	       l.setVerticalAlignment(SwingConstants.TOP);
	      l.setBounds(100,50,400,20);
	      frame.add(l);
	      Project p=new Project();
	     
	      
             l1 = new JLabel("USD");
             String c[] = {"USD", "EUR", "JPY", "RUB","INR"};
	         c1 = new JComboBox(c);
	         frame.add(c1);
	         frame.add(l1);
	         c1.setBounds(80,150 ,200,50);
	         l1.setForeground(Color.blue);
	         l1.setBackground(Color.YELLOW);
	         l1.setBounds(20,100,400,20);
	         c1.addItemListener(p);
		       l1.setHorizontalAlignment(SwingConstants.CENTER);
		       
		       
	        JLabel l3=new JLabel("TO");
	        l3.setHorizontalAlignment(SwingConstants.CENTER);
	        l3.setBounds(100,100,400,20);
	        frame.add(l3);
		       l2 = new JLabel("INR");
		       String cc[] = { "INR","USD","EUR","JPY", "RUB"};
		         c2 = new JComboBox(cc);
		         frame.add(c2);
		         frame.add(l2);
		         c2.setBounds(320,150 ,200,50);
		         l2.setForeground(Color.blue);
		         l2.setBackground(Color.YELLOW);
		         l2.setBounds(180,100,400,20);
		         c2.addItemListener(p);
			       l2.setHorizontalAlignment(SwingConstants.CENTER);
		          
			       JLabel l4=new JLabel("ENTER AMOUNT :");
			       l4.setHorizontalAlignment(SwingConstants.CENTER);
			       l4.setBounds(200,200,200,100);
			       frame.add(l4);
			       b = new JButton("submit");
			       l5=new JLabel();
			       l5.setHorizontalAlignment(SwingConstants.CENTER);
			       l5.setBounds(150,400,300,100);
			       frame.add(b);
			       frame.add(l5);
			     
			       b.addActionListener(p);
			       b.setBounds(250, 320, 100, 30);
			       t = new JTextField(16);
			       t.setBounds(200, 280, 200, 30);
			       t.setHorizontalAlignment(SwingConstants.CENTER);
			       frame.add(t);
	        frame.setSize(600,600);

	      
	        frame.setLayout(null);

	        
	        frame.setVisible(true);

	}
	 public void itemStateChanged(ItemEvent e)
	    {
	        // if the state combobox is changed
	        if (e.getSource() == c1) {

	            l1.setText(c1.getSelectedItem() + "");
	        }
	        if (e.getSource() == c2) {

	            l2.setText(c2.getSelectedItem()+"");
	        }
	    }
	 public void actionPerformed(ActionEvent e)
	 {
	     String s = t.getText();
	     int c = 0;
	     
	     for (int i = 0; i < s.length(); i++) {
	         if (Character.isDigit(s.charAt(i))) {
	             c = 1;
	         } else {
	             c = 0;
	             break;
	         }
	     }

	     if (c == 1) {
	    	 double result;
	    	 int amount= Integer.parseInt(s);
	    	 if ((c1.getSelectedItem() + "").equals("INR") && (c2.getSelectedItem() + "").equals("USD")) {
	    		    result = amount * 0.012;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("INR") && (c2.getSelectedItem() + "").equals("EUR")) {
	    		    result = amount * 0.011;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("INR") && (c2.getSelectedItem() + "").equals("JPY")) {
	    		    result = amount * 1.77;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("INR") && (c2.getSelectedItem() + "").equals("RUB")) {
	    		    result = amount * 1.11;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("USD") && (c2.getSelectedItem() + "").equals("INR")) {
	    		    result = amount * 83.20;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("USD") && (c2.getSelectedItem() + "").equals("EUR")) {
	    		    result = amount * 0.92;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("USD") && (c2.getSelectedItem() + "").equals("JPY")) {
	    		    result = amount * 148.90;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("USD") && (c2.getSelectedItem() + "").equals("RUB")) {
	    		    result = amount * 92.40;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("EUR") && (c2.getSelectedItem() + "").equals("INR")) {
	    		    result = amount * 90.50;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("EUR") && (c2.getSelectedItem() + "").equals("USD")) {
	    		    result = amount * 1.09;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("EUR") && (c2.getSelectedItem() + "").equals("JPY")) {
	    		    result = amount * 162.00;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("EUR") && (c2.getSelectedItem() + "").equals("RUB")) {
	    		    result = amount * 100.40;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("JPY") && (c2.getSelectedItem() + "").equals("INR")) {
	    		    result = amount * 0.56;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("JPY") && (c2.getSelectedItem() + "").equals("USD")) {
	    		    result = amount * 0.0067;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("JPY") && (c2.getSelectedItem() + "").equals("EUR")) {
	    		    result = amount * 0.0062;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("JPY") && (c2.getSelectedItem() + "").equals("RUB")) {
	    		    result = amount * 0.62;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("RUB") && (c2.getSelectedItem() + "").equals("INR")) {
	    		    result = amount * 0.90;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("RUB") && (c2.getSelectedItem() + "").equals("USD")) {
	    		    result = amount * 0.011;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("RUB") && (c2.getSelectedItem() + "").equals("EUR")) {
	    		    result = amount * 0.010;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals("RUB") && (c2.getSelectedItem() + "").equals("JPY")) {
	    		    result = amount * 1.61;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else if ((c1.getSelectedItem() + "").equals(c2.getSelectedItem() + "")) {
	    		    result = amount;
	    		    l5.setText("Value After Conversion to "+c2.getSelectedItem() + " = "+result);
	    		} else {
	    		    // Invalid pair
	    		    System.out.println("Invalid conversion pair");
	    		}

	           
	         
	     } else {
	         l5.setText("Invalid Format !!");
	     }

	     t.setText("");  
	 }

	    }
	

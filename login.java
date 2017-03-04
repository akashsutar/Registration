import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login1 extends JFrame implements ActionListener{
	JTextField t1;
	JLabel l1,l2;
	JPasswordField pw;
	JButton b1,b2;
	public Login1()
	{
	setLayout(new FlowLayout());
	JPanel p=new JPanel();
	p.setLayout(new GridLayout(3,2));
	l1=new JLabel("Username");
	l2=new JLabel("Password");
	t1=new JTextField(10);
	pw=new JPasswordField();
	b1=new JButton("Login");
	b2=new JButton("clear");
	p.add(l1);
	p.add(t1);
	p.add(l2);
	p.add(pw);
	p.add(b1);
	p.add(b2);	
	add(p);
									
	}

	public static void main(String[] args) {
		Login1 l=new Login1();
		l.setSize(300,150);
		l.setVisible(true);

	}

	
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}

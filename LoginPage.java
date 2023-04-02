package com.example.LoginPage;
//import java.util.*;

//import java.awt.Image;
import javax.swing.*;
//import java.awt.event*;
public class LoginPage extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lab1,lab2,lab3,lab4;
	JTextField txt1,txt2;
	JButton bt1,bt2;
	JPasswordField psw1;
	JMenu menu,Con,submenu;
	JMenuItem i1,i2,i3,i4,i5;
	JMenuBar mb;
	//Constructor
//	Image img1;
	LoginPage()
	{
		setLayout(null);
		 JMenuBar mb=new JMenuBar();  
         menu=new JMenu("Home");  
         submenu=new JMenu("About US");  
         i1=new JMenuItem("");  
         i2=new JMenuItem("Forgot Password");  
         i3=new JMenuItem("");  
         i4=new JMenuItem("");  
         i5=new JMenuItem("Contact us");  
         menu.add(i1); menu.add(i2); menu.add(i3);  
         submenu.add(i4); submenu.add(i5);  
         menu.add(submenu);  
         mb.add(menu);  
         setJMenuBar(mb);
		
		
		lab1=new JLabel("Welcome To Login Page");
		
		add(lab1);
		lab1.setBounds(700,100,250,30);
		
	
		
		lab2=new JLabel("User Name");
		//img1=new ImageIcon(this.getClass().getResource("img/img3.jpeg")).getImage();
		//lab2.setIcon(new ImageIcon(img1));
		//add(lab2);
		add(lab2);
		lab2.setBounds(650,200,150,30);
		//
		txt1 = new JTextField(15);
		add(txt1);
		txt1.setBounds(720,200,150,30);
		
		//
		lab3=new JLabel("Password");
		add(lab3);
		lab3.setBounds(650,250,150,30);
		//
		
		psw1 = new JPasswordField(15);
		add(psw1);
		psw1.setBounds(720,250,150,30);
		
		//
		bt1 = new JButton("Login");
		add(bt1);
		bt1.setBounds(650,300,100,30);
		
		bt2 = new JButton("Register");
		add(bt2);
		bt2.setBounds(800,300,100,30);
		
		lab4 = new JLabel("New User ? Click On Register");
		add(lab4);
		lab4.setBounds(800,350,200,30);
		
		
		
		
		
		
		
		setTitle("Login Page");
		setVisible(true);
		setSize(2000,820);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginPage();
	}

}

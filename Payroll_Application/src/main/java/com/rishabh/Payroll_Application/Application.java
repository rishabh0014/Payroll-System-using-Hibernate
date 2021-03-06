package com.rishabh.Payroll_Application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Application {

	public JFrame frm;
	public JTextField tf_name, tf_age, tf_id, tf_salary, tf_BName, tf_BNo, tf_income;
	public JLabel lb_name, lb_id, lb_head, lb_BName, lb_BNo, lb_salary, lb_age, lb_income;
	public JButton btn_cal,btn_clr,btn_ext;
	public JTextArea txt_rcpt;
	App a;


	public Application() {
		initialize();
	}
	
	public void clear() {
		tf_name.setText("");tf_age.setText("");tf_id.setText("");tf_salary.setText("");tf_BNo.setText("");tf_BName.setText("");tf_income.setText("");
	}
	
	public void initialize() {
		frm = new JFrame();
		frm.setTitle("Application");
		frm.setBounds(100, 100, 950, 500);
		frm.getContentPane().setForeground(Color.PINK);
		frm.getContentPane().setBackground(new Color(144,238,144));
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setResizable(false);
		frm.getContentPane().setLayout(null);
		
		lb_head = new JLabel("Employee Payroll System");
		lb_head.setHorizontalAlignment(SwingConstants.CENTER);
		lb_head.setForeground(new Color(139, 0, 139));
		lb_head.setFont(new Font("Elephant", Font.BOLD, 43));
		lb_head.setBounds(0, 10, 940, 54);
		frm.getContentPane().add(lb_head);
		
		lb_name = new JLabel("Name Of Employee");
		lb_name.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_name.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lb_name.setBounds(0, 95, 170, 30);
		frm.getContentPane().add(lb_name);
		
		tf_name = new JTextField();
		tf_name.setBackground(new Color(144,200,144));
		tf_name.setForeground(new Color(128, 0, 0));
		tf_name.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		tf_name.setBounds(180, 95, 180, 30);
		frm.getContentPane().add(tf_name);
		tf_name.setColumns(10);
		
		
		lb_id = new JLabel("Employee ID");
		lb_id.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_id.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lb_id.setBounds(360, 95, 170, 30);
		frm.getContentPane().add(lb_id);
		
		tf_id = new JTextField();
		tf_id.setBackground(new Color(144,200,144));
		tf_id.setForeground(new Color(128, 0, 0));
		tf_id.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		tf_id.setBounds(540, 95, 180, 30);
		frm.getContentPane().add(tf_id);
		tf_id.setColumns(10);
		
		lb_age = new JLabel("Age");
		lb_age.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_age.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lb_age.setBounds(635, 95, 170, 30);
		frm.getContentPane().add(lb_age);
		
		tf_age = new JTextField();
		tf_age.setBackground(new Color(144,200,144));
		tf_age.setForeground(new Color(128, 0, 0));
		tf_age.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		tf_age.setBounds(815, 95, 65, 30);
		frm.getContentPane().add(tf_age);
		tf_age.setColumns(10);
		
		lb_BName = new JLabel("Bank Name");
		lb_BName.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_BName.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lb_BName.setBounds(-50, 160, 170, 30);
		frm.getContentPane().add(lb_BName);
		
		tf_BName = new JTextField();
		tf_BName.setBackground(new Color(144,200,144));
		tf_BName.setForeground(new Color(128, 0, 0));
		tf_BName.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		tf_BName.setBounds(130, 160, 180, 30);
		frm.getContentPane().add(tf_BName);
		tf_BName.setColumns(10);
		
		lb_BNo = new JLabel("Bank Account No.");
		lb_BNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_BNo.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lb_BNo.setBounds(330, 160, 160, 30);
		frm.getContentPane().add(lb_BNo);
		
		tf_BNo = new JTextField();
		tf_BNo.setBackground(new Color(144,200,144));
		tf_BNo.setForeground(new Color(128, 0, 0));
		tf_BNo.setBounds(500, 160, 180, 30);
		tf_BNo.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		frm.getContentPane().add(tf_BNo);
		tf_BNo.setColumns(10);
		
		lb_income = new JLabel("Income");
		lb_income.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_income.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lb_income.setBounds(610, 160, 160, 30);
		frm.getContentPane().add(lb_income);
		
		tf_income = new JTextField();
		tf_income.setBackground(new Color(144, 200, 144));
		tf_income.setForeground(new Color(128, 0, 0));
		tf_income.setBounds(780, 160, 149, 30);
		tf_income.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		frm.getContentPane().add(tf_income);
		tf_income.setColumns(10);
		
		lb_salary = new JLabel("Amount Credited to Your Bank Account");
		lb_salary.setHorizontalAlignment(SwingConstants.CENTER);
		lb_salary.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lb_salary.setBounds(550, 270, 370, 30);
		frm.getContentPane().add(lb_salary);
		
		tf_salary = new JTextField();
		tf_salary.setEditable(false);
		tf_salary.setBackground(new Color(144,200,144));
		tf_salary.setForeground(new Color(128, 0, 0));
		tf_salary.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		tf_salary.setBounds(645, 310,180, 30);
		frm.getContentPane().add(tf_salary);
		tf_salary.setColumns(10);
		
		txt_rcpt = new JTextArea();
		txt_rcpt.setForeground(new Color(128,0,0));
		txt_rcpt.setBackground(new Color(144, 200, 144));
		txt_rcpt.setLineWrap(true);
		txt_rcpt.setFont(new Font("Monospaced", Font.BOLD, 16));
		txt_rcpt.setBounds(35, 250, 455, 165);
		frm.getContentPane().add(txt_rcpt);
		
		btn_cal = new JButton("Calculate Salary");
		btn_cal.setForeground(new Color(255, 255, 255));
		btn_cal.setBackground(new Color(193, 154, 107));
		btn_cal.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_cal.setBounds(660, 224, 150, 40);
		frm.getContentPane().add(btn_cal);
		
		btn_clr = new JButton("Clear");
		btn_clr.setForeground(new Color(255, 255, 255));
		btn_clr.setBackground(new Color(193, 154, 107));
		btn_clr.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btn_clr.setBounds(640, 400, 95, 30);
		frm.getContentPane().add(btn_clr);
		btn_clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_rcpt.setText("");	
				clear();
			}
		});
		
		btn_ext = new JButton("Exit");
		btn_ext.setForeground(new Color(255, 255, 255));
		btn_ext.setBackground(new Color(193, 154, 107));
		btn_ext.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btn_ext.setBounds(745, 400, 95, 30);
		frm.getContentPane().add(btn_ext);
		btn_ext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm.dispose();
			}
		});	
	}
}

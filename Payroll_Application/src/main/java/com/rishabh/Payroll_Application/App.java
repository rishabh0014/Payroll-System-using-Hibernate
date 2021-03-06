package com.rishabh.Payroll_Application;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{	
    public static void main(String [] args){
    	
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				final Application design = new Application();
					design.frm.setVisible(true);
			
		design.btn_cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
    	String name = design.tf_name.getText();
    	String id = design.tf_id.getText();
    	String age = design.tf_age.getText();
    	String bName = design.tf_BName.getText();
    	String bNo = design.tf_BNo.getText();
    	String income = design.tf_income.getText();

    	int salary = Integer.parseInt(income) * 12;
    	int tax, net_income;
    	float net_salary;
    	
    	int age_compare =Integer.parseInt(design.tf_age.getText());
    	if(age_compare>80) {
			if(salary >= 1000000) {
				tax = 100000 + ((salary-1000000) * 30 / 100);
				net_income = salary - tax;
				net_salary = net_income/12;
			}else if(salary >= 500000) {
				tax = ((salary-500000) * 20 / 100);
				net_income = salary - tax;
				net_salary = net_income/12;	
			}else {
				tax = 0;
				net_income = salary;
				net_salary = net_income/12;
			}	
		}else if(age_compare>60) {
			if(salary >= 1000000) {
				tax = 110000 + ((salary-1000000) * 30 / 100);
				net_income = salary - tax;
				net_salary = net_income/12;
			}else if(salary >= 500000) {
				tax = 10000 + ((salary-500000) * 20 / 100);
				net_income = salary - tax;
				net_salary = net_income/12;
			}else if(salary > 300000) {
				tax = ((salary-300000) * 5 / 100);
				net_income = salary - tax;
				net_salary = net_income/12;
			}else {
				tax = 0;
				net_income = salary;
				net_salary = net_income/12;
			}
		}else {
			if(salary >= 1000000) {
				tax = 112500 + ((salary-1000000) * 30 / 100);
				net_income = salary - tax;
				net_salary = net_income/12;
			}else if(salary >= 500000) {
				tax = 25000 + ((salary-500000) * 20 / 100);
				net_income = salary - tax;
				net_salary = net_income/12;
			}else if(salary > 250000) {
				tax = ((salary-250000) * 5 / 100);
				net_income = salary - tax;
				net_salary = net_income/12;
			}else {
				tax = 0;
				net_income = salary;
				net_salary = net_income/12;
			}
		}
    
    	GeteSet emp = new GeteSet();
    	emp.setName(name);
    	emp.setId(id);
    	emp.setAge(age);
    	emp.setBank_Name(bName);
    	emp.setBank_Account_No(bNo);
    	emp.setIncome(income);
    	emp.setSalary(Float.toString(net_salary));
    	
    	design.tf_salary.setText(Float.toString(net_salary));
    	float t_tax =Integer.parseInt(income) - net_salary;
    	design.txt_rcpt.setText("\n=>Before deduction of Tax -> Salary: "+ income +"\n=>Tax: "+ t_tax+"\n=>After deduction of Tax -> Salary: "+ net_salary+"\n=>"+net_salary+" paid to Mr."+name+" in account No. "+bNo+" successfully");

    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(GeteSet.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();        
        SessionFactory sf = con.buildSessionFactory(reg);        
        Session session = sf.openSession();         
        Transaction tx = session.beginTransaction();
    	session.save(emp);
       	tx.commit();
			}
		});
			}
		});
    }
}

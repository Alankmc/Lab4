package alunos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/* An error Message Class that appears only to notify
 * the user that there are obligatory entries to be filled.
 */

public class Error extends JFrame
{
	
	/*
	 * Summons a JFrame whose only warns the user that not all required fields were filled in.
	 * Has a single button that closes the window.
	 */
	
	public JPanel errorPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Error frame = new Error();					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// Summons super class to close the window
	public void CloseFrame(){
	    super.dispose();
	}
	
	
	
	public Error() 
	{
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	errorPane = new JPanel();
	errorPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(errorPane);
	errorPane.setLayout(null);
	
	JLabel lblMessage = new JLabel("Please fill in all required entries!");
	lblMessage.setFont(new Font("Dialog", Font.PLAIN, 20));
	lblMessage.setBounds(70, 12, 500, 200);
	errorPane.add(lblMessage);
	
	JButton btnExit = new JButton("OK");
	btnExit.setBounds(160, 150, 117, 25);
	errorPane.add(btnExit);
	btnExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			CloseFrame();
		}
	});
	}
	
	
}

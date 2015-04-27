package alunos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form extends JFrame {

	/* Class that came from template.
	 * Builds a JFrame that prints all information that was 
	 * gathered from the print class
	 * */
	
	public JPanel contentPane;
	public JTextField textfirstName;
	public JTextField textlastName;
	public JTextField textDoB;
	public JTextField textEmail;
	public JTextField textPhone;
	public JTextField textCPF;
	public JTextField textAddress1;
	public JTextField textAddress2;
	public JTextField textCEP;
	public JTextField textCity;
	public JTextField textState;
	public JTextField textCountry;
	
	private String temp;	// Temporary String that certifies that the requirements were met
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textfirstName = new JTextField();
		textfirstName.setBounds(110, 58, 114, 19);
		contentPane.add(textfirstName);
		textfirstName.setColumns(10);
		
		textlastName = new JTextField();
		textlastName.setBounds(110, 89, 114, 19);
		contentPane.add(textlastName);
		textlastName.setColumns(10);
		
		textDoB = new JTextField();
		textDoB.setBounds(110, 120, 114, 19);
		contentPane.add(textDoB);
		textDoB.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(110, 151, 114, 19);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textCPF = new JTextField();
		textCPF.setBounds(110, 182, 114, 19);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setBounds(110, 213, 114, 19);
		contentPane.add(textPhone);
		textPhone.setColumns(10);
		
		textAddress1 = new JTextField();
		textAddress1.setBounds(110, 244, 114, 19);
		contentPane.add(textAddress1);
		textAddress1.setColumns(10);
		
		textAddress2 = new JTextField();
		textAddress2.setBounds(110, 275, 114, 19);
		contentPane.add(textAddress2);
		textAddress2.setColumns(10);
		
		textCEP = new JTextField();
		textCEP.setBounds(110, 306, 114, 19);
		contentPane.add(textCEP);
		textCEP.setColumns(10);
		
		textCity = new JTextField();
		textCity.setBounds(110, 339, 114, 19);
		contentPane.add(textCity);
		textCity.setColumns(10);
		
		textState = new JTextField();
		textState.setBounds(110, 370, 114, 19);
		contentPane.add(textState);
		textState.setColumns(10);
		
		textCountry = new JTextField();
		textCountry.setBounds(110, 401, 114, 19);
		contentPane.add(textCountry);
		textCountry.setColumns(10);
		
		
		/* Labels */
		
		final JComboBox comboTitle = new JComboBox();
		comboTitle.setModel(new DefaultComboBoxModel(new String[] {"Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		comboTitle.setToolTipText("");
		comboTitle.setBounds(58, 12, 81, 24);
		contentPane.add(comboTitle);
		
		JLabel lblRequirement = new JLabel("*required");
		lblRequirement.setBounds(90, 431, 74, 25);
		contentPane.add(lblRequirement);
		
		JLabel lblFirstName = new JLabel("First Name*:");
		lblFirstName.setBounds(12, 60, 90, 15);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name*:");
		lblLastName.setBounds(12, 91, 90, 15);
		contentPane.add(lblLastName);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(12, 17, 90, 15);
		contentPane.add(lblTitle);
		
		/* New Content */
		JLabel lblDoB = new JLabel("Date of Birth*:");
		lblDoB.setBounds(12, 122, 90, 15);
		contentPane.add(lblDoB);
		
		JLabel lblDoBFormat = new JLabel("(DD/MM/YYYY)");
		lblDoBFormat.setBounds(230, 122, 200, 15);
		contentPane.add(lblDoBFormat);

		JLabel lblEmail = new JLabel("Email*:");
		lblEmail.setBounds(12, 153, 90, 15);
		contentPane.add(lblEmail);
		
		JLabel lblCPF = new JLabel("CPF*:");
		lblCPF.setBounds(12, 184, 90, 15);
		contentPane.add(lblCPF);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(12, 215, 90, 15);
		contentPane.add(lblPhone);
		
		JLabel lblPhoneFormat = new JLabel("(+ International Code and DDD)");
		lblPhoneFormat.setBounds(230, 215, 200, 15);
		contentPane.add(lblPhoneFormat);
		
		JLabel lblAddress1 = new JLabel("Address 1:");
		lblAddress1.setBounds(12, 246, 90, 15);
		contentPane.add(lblAddress1);
		
		JLabel lblAddress2 = new JLabel("Address 2:");
		lblAddress2.setBounds(12, 277, 90, 15);
		contentPane.add(lblAddress2);
		
		JLabel lblAddress2Format = new JLabel("(Apt, floor, suite, etc.)");
		lblAddress2Format.setBounds(230, 277, 200, 15);
		contentPane.add(lblAddress2Format);
		
		JLabel lblCEP = new JLabel("CEP:");
		lblCEP.setBounds(12, 308, 90, 15);
		contentPane.add(lblCEP);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(12, 339, 90, 15);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(12, 370, 90, 15);
		contentPane.add(lblState);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(12, 401, 90, 15);
		contentPane.add(lblCountry);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {		
				//contentPane.setVisible(false);
				print printForm = new print();
				Error errorMsg = new Error();
				
				
				// This flag will check whether the required fields were filled in
				int flag = 0;
				
				printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
				
				// If the string is empty, flag goes up
				temp = textfirstName.getText();
				if (temp.equals(""))
					flag = 1;
				else
					printForm.firstNameLabel.setText(temp);
				
				temp = textlastName.getText();
				if (temp.equals(""))
					flag = 1;
				else
					printForm.lastNameLabel.setText(temp);
				
				temp = textDoB.getText();
				if (temp.equals(""))
					flag = 1;
				else
					printForm.DoBLabel.setText(temp);
				
				temp = textEmail.getText();
				if (temp.equals(""))
					flag = 1;
				else
					printForm.emailLabel.setText(temp);
				
				temp = textCPF.getText();
				if (temp.equals(""))
					flag = 1;
				else
					printForm.CPFLabel.setText(temp);
				
				
				// The other fields are not strict requirements, and will be ignored in case it is empty
				printForm.CPFLabel.setText(textCPF.getText());
				printForm.phoneLabel.setText(textPhone.getText());
				printForm.address1Label.setText(textAddress1.getText());
				printForm.address2Label.setText(textAddress2.getText());
				printForm.CEPLabel.setText(textCEP.getText());
				printForm.cityLabel.setText(textCity.getText());
				printForm.stateLabel.setText(textState.getText());
				printForm.countryLabel.setText(textCountry.getText());


				//printForm.contentPane.setVisible(true);				
				if (flag == 0)
					printForm.show();
				else
					errorMsg.show();
			}
		});
		btnPrint.setBounds(12, 431, 74, 25);
		contentPane.add(btnPrint);
	}
}










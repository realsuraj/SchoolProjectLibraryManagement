package collector;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField userTextfield;
	private JTextField emailTextField;
	private JTextField passwordTextfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setBounds(78, 46, 76, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("email");
		lblNewLabel_1.setBounds(78, 88, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		userTextfield = new JTextField();
		userTextfield.setBounds(166, 43, 116, 22);
		contentPane.add(userTextfield);
		userTextfield.setColumns(10);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(166, 85, 116, 22);
		contentPane.add(emailTextField);
		emailTextField.setColumns(10);
		
		passwordTextfield = new JTextField();
		passwordTextfield.setBounds(166, 120, 116, 22);
		contentPane.add(passwordTextfield);
		passwordTextfield.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setBounds(78, 117, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{

				String usernameString = userTextfield.getText();
				String passwordString = passwordTextfield.getText();
				String emailString = emailTextField.getText();
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoollibrarymanagement","root","");
					PreparedStatement pStatement = connection.prepareStatement("insert into login(username,useremail,password) values(?,?,?);");
					pStatement.setString(1, usernameString);
					pStatement.setString(2, emailString);
					pStatement.setString(3, passwordString);
					
					int x = pStatement.executeUpdate();
					if(x>0)
					{
						System.out.println("system updated");
					}
					else 
					{
						System.out.println("system updated fail");
					}
					
				} catch (Exception e1) {
					System.out.println("error" + e1);
				}
			}
		});
		btnNewButton.setBounds(131, 167, 97, 25);
		contentPane.add(btnNewButton);
	}
}

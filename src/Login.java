import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class Login {

	private JFrame frame;
	private JTextField usernameTextField;
	private JTextField passwordTextFeild;
	private JTextField emailTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel usernameText = new JLabel("username");
		usernameText.setBounds(111, 84, 74, 24);
		frame.getContentPane().add(usernameText);
		
		JLabel passwordText = new JLabel("password");
		passwordText.setBounds(111, 120, 56, 16);
		frame.getContentPane().add(passwordText);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(192, 85, 116, 22);
		frame.getContentPane().add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordTextFeild = new JTextField();
		passwordTextFeild.setBounds(192, 120, 116, 22);
		frame.getContentPane().add(passwordTextFeild);
		passwordTextFeild.setColumns(10);
		
		JButton btnLogin = new JButton("register");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String usernameString = usernameTextField.getText();
				String passwordString = passwordTextFeild.getText();
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
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, "error"+ e);
				}
			}
		});
		btnLogin.setBounds(140, 190, 97, 25);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("email");
		lblNewLabel.setBounds(111, 150, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(192, 155, 116, 22);
		frame.getContentPane().add(emailTextField);
		emailTextField.setColumns(10);
	}
}

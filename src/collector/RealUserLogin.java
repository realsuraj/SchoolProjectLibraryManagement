package collector;
import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class RealUserLogin {

	private JFrame frame;
	private JTextField usernameTextField;
	private JTextField passwordTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealUserLogin window = new RealUserLogin();
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
	public RealUserLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("usename");
		
		JLabel lblNewLabel_1 = new JLabel("password");
		
		
		JButton btnNewButton = new JButton("signIn");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoollibrarymanagement","root","");
					Statement statement = connection.createStatement();
					String sqlString = "SELECT * FROM `login` WHERE username= '" + usernameTextField.getText() + "' and password = '" + passwordTextField.getText().toString() + "'";
					ResultSet rSet = statement.executeQuery(sqlString);
					if(rSet.next())
					{
						MainMenu mainMenu = new MainMenu();
						mainMenu.setVisible(true);
						System.out.println("login successfully");
						
					}
					else {
						{
							System.out.println("fail ");
							connection.close();
						}
					}
				} 
				
				catch (Exception e2) 
				
				{
					System.out.println(e2);
				}
			}
		});
		
		usernameTextField = new JTextField();
		usernameTextField.setColumns(10);
		
		passwordTextField = new JTextField();
		passwordTextField.setColumns(10);
		
		JButton signUp = new JButton("signUp");
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				SignUp signUp = new SignUp();
				signUp.setVisible(true);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(usernameTextField, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
					.addGap(156))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
					.addGap(28)
					.addComponent(passwordTextField, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
					.addGap(146))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(137)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
					.addGap(20)
					.addComponent(signUp, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
					.addGap(81))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(74)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED, 3, Short.MAX_VALUE))
						.addComponent(usernameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1))
						.addComponent(passwordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton)
						.addComponent(signUp))
					.addGap(65))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}

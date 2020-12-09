package collector;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.mysql.jdbc.PreparedStatement;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;





public class MainMenu extends JFrame {

	private JPanel contentPane;
	private JTextField BookIdtextField;
	private JTextField BookNametextField;
	private JTextField PublishertextField;
	private JTextField EditiontextField;
	private JTextField PricetextField;
	private JTextField PagetextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	
	
	public MainMenu() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 517);
		setUndecorated(true);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(279, 31, 648, 461);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		final JPanel LayerPanelAddBook = new JPanel();
		layeredPane.add(LayerPanelAddBook, "name_441987407832800");
		LayerPanelAddBook.setLayout(null);
		
		JLabel lblBookid = new JLabel("Book Id");
		lblBookid.setBounds(108, 51, 56, 16);
		LayerPanelAddBook.add(lblBookid);
		
		JLabel lblNewLabel_1 = new JLabel("Book Name");
		lblNewLabel_1.setBounds(108, 95, 79, 16);
		LayerPanelAddBook.add(lblNewLabel_1);
		
		JLabel lblNewLabel_7 = new JLabel("Publisher");
		lblNewLabel_7.setBounds(108, 138, 56, 16);
		LayerPanelAddBook.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Edition");
		lblNewLabel_8.setBounds(108, 186, 56, 16);
		LayerPanelAddBook.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Price");
		lblNewLabel_9.setBounds(108, 238, 56, 16);
		LayerPanelAddBook.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Page");
		lblNewLabel_10.setBounds(108, 289, 56, 16);
		LayerPanelAddBook.add(lblNewLabel_10);
		
		BookIdtextField = new JTextField();
		BookIdtextField.setBounds(213, 48, 116, 22);
		LayerPanelAddBook.add(BookIdtextField);
		BookIdtextField.setColumns(10);
		
		BookNametextField = new JTextField();
		BookNametextField.setBounds(213, 92, 116, 22);
		LayerPanelAddBook.add(BookNametextField);
		BookNametextField.setColumns(10);
		
		PublishertextField = new JTextField();
		PublishertextField.setBounds(213, 135, 116, 22);
		LayerPanelAddBook.add(PublishertextField);
		PublishertextField.setColumns(10);
		
		EditiontextField = new JTextField();
		EditiontextField.setBounds(213, 183, 116, 22);
		LayerPanelAddBook.add(EditiontextField);
		EditiontextField.setColumns(10);
		
		PricetextField = new JTextField();
		PricetextField.setBounds(213, 235, 116, 22);
		LayerPanelAddBook.add(PricetextField);
		PricetextField.setColumns(10);
		
		PagetextField = new JTextField();
		PagetextField.setBounds(213, 286, 116, 22);
		LayerPanelAddBook.add(PagetextField);
		PagetextField.setColumns(10);
		
		JButton btnNewButton = new JButton("back");
		btnNewButton.setBounds(90, 360, 97, 25);
		LayerPanelAddBook.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoollibrarymanagement","root","");
					java.sql.PreparedStatement pStatement = connection.prepareStatement("insert into addbook(BookId, BookName, Publisher, Edition, Price, Page) values(?,?,?,?,?,?);");
					pStatement.setString(1, BookIdtextField.getText());
					pStatement.setString(2, BookNametextField.getText());
					pStatement.setString(3, PublishertextField.getText());
					pStatement.setString(4, EditiontextField.getText());
					pStatement.setString(5, PricetextField.getText());
					pStatement.setString(6, PagetextField.getText());
					
					int x = pStatement.executeUpdate();
					if(x>0)
					{
						System.out.println("updated");
					}
					else {
						{
							System.out.println("fail");
						}
					}
					
				}
				catch (Exception e1) 
				{
					System.out.println("fail error" + e1);
				}
			}
			
		});
		btnNewButton_1.setBounds(232, 360, 97, 25);
		LayerPanelAddBook.add(btnNewButton_1);
		
		final JPanel LayerPanelStatistics = new JPanel();
		layeredPane.add(LayerPanelStatistics, "name_442039687065600");
		LayerPanelStatistics.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Statistic");
		lblNewLabel_2.setBounds(263, 191, 56, 16);
		LayerPanelStatistics.add(lblNewLabel_2);
		
		final JPanel LayerPanelAddStudent = new JPanel();
		layeredPane.add(LayerPanelAddStudent, "name_442041253215400");
		LayerPanelAddStudent.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Add Student");
		lblNewLabel_3.setBounds(302, 219, 56, 16);
		LayerPanelAddStudent.add(lblNewLabel_3);
		
		final JPanel LayerPanelIssueBook = new JPanel();
		layeredPane.add(LayerPanelIssueBook, "name_442043332269000");
		LayerPanelIssueBook.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("IssueBook");
		lblNewLabel_4.setBounds(327, 208, 56, 16);
		LayerPanelIssueBook.add(lblNewLabel_4);
		
		final JPanel LayerPanelReturnBook = new JPanel();
		layeredPane.add(LayerPanelReturnBook, "name_442049741730700");
		LayerPanelReturnBook.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Return Book");
		lblNewLabel_5.setBounds(329, 189, 56, 16);
		LayerPanelReturnBook.add(lblNewLabel_5);
		
		final JPanel LayerPanelHelp = new JPanel();
		layeredPane.add(LayerPanelHelp, "name_442051093065000");
		LayerPanelHelp.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Help");
		lblNewLabel_6.setBounds(279, 207, 56, 16);
		LayerPanelHelp.add(lblNewLabel_6);
		
		JPanel paneMenu = new JPanel();
		paneMenu.setBackground(Color.BLUE);
		paneMenu.setForeground(Color.WHITE);
		paneMenu.setBounds(0, 0, 260, 517);
		contentPane.add(paneMenu);
		paneMenu.setLayout(null);
		
		JPanel panelAddBook = new JPanel();
		panelAddBook.addMouseListener(new PanelButtonMouseAdapter(panelAddBook)
				{
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(LayerPanelAddBook);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
				});
		panelAddBook.setBackground(Color.BLUE);
		panelAddBook.setBounds(12, 61, 236, 43);
		paneMenu.add(panelAddBook);
		panelAddBook.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Book");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(86, 13, 77, 18);
		panelAddBook.add(lblNewLabel);
		
		JPanel panelStatistics = new JPanel();
		panelStatistics.addMouseListener(new PanelButtonMouseAdapter(panelStatistics)
				{
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(LayerPanelStatistics);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
				});
		panelStatistics.setBackground(Color.BLUE);
		panelStatistics.setBounds(12, 117, 236, 43);
		paneMenu.add(panelStatistics);
		panelStatistics.setLayout(null);
		
		JLabel lblStatistic = new JLabel("Statistic");
		lblStatistic.setBounds(80, 13, 76, 21);
		lblStatistic.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistic.setForeground(Color.WHITE);
		lblStatistic.setFont(new Font("Dialog", Font.BOLD, 16));
		panelStatistics.add(lblStatistic);
		
		JPanel panelAddStudent = new JPanel();
		panelAddStudent.addMouseListener(new PanelButtonMouseAdapter(panelAddStudent)
				{
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(LayerPanelAddStudent);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
				});
		panelAddStudent.setBackground(Color.BLUE);
		panelAddStudent.setBounds(12, 173, 236, 43);
		paneMenu.add(panelAddStudent);
		panelAddStudent.setLayout(null);
		
		JLabel lblAddStudent = new JLabel("Add Student");
		lblAddStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddStudent.setForeground(Color.WHITE);
		lblAddStudent.setFont(new Font("Dialog", Font.BOLD, 16));
		lblAddStudent.setBounds(66, 13, 112, 21);
		panelAddStudent.add(lblAddStudent);
		
		JPanel panelIssueBook = new JPanel();
		panelIssueBook.addMouseListener(new PanelButtonMouseAdapter(panelIssueBook)
				{
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(LayerPanelIssueBook);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
				});
		panelIssueBook.setBackground(Color.BLUE);
		panelIssueBook.setBounds(12, 229, 236, 43);
		paneMenu.add(panelIssueBook);
		panelIssueBook.setLayout(null);
		
		JLabel lblIssueBook = new JLabel("Issue Book");
		lblIssueBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssueBook.setForeground(Color.WHITE);
		lblIssueBook.setFont(new Font("Dialog", Font.BOLD, 16));
		lblIssueBook.setBounds(77, 13, 98, 21);
		panelIssueBook.add(lblIssueBook);
		
		JPanel panelReturnBook = new JPanel();
		panelReturnBook.addMouseListener(new PanelButtonMouseAdapter(panelReturnBook)
				{
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(LayerPanelReturnBook);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
				});
		panelReturnBook.setBackground(Color.BLUE);
		panelReturnBook.setBounds(12, 285, 236, 43);
		paneMenu.add(panelReturnBook);
		panelReturnBook.setLayout(null);
		
		JLabel lblReturnBook = new JLabel("Return Book");
		lblReturnBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblReturnBook.setForeground(Color.WHITE);
		lblReturnBook.setFont(new Font("Dialog", Font.BOLD, 16));
		lblReturnBook.setBounds(72, 13, 98, 21);
		panelReturnBook.add(lblReturnBook);
		
		JPanel panelHelp = new JPanel();
		panelHelp.addMouseListener(new PanelButtonMouseAdapter(panelHelp)
				{
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(LayerPanelHelp);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
				});
		panelHelp.setBackground(Color.BLUE);
		panelHelp.setBounds(12, 341, 236, 43);
		paneMenu.add(panelHelp);
		panelHelp.setLayout(null);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelp.setForeground(Color.WHITE);
		lblHelp.setFont(new Font("Dialog", Font.BOLD, 16));
		lblHelp.setBounds(72, 13, 98, 21);
		panelHelp.add(lblHelp);
		
		
		
		
	}
}
class PanelButtonMouseAdapter extends MouseAdapter{
	JPanel panel;
	public PanelButtonMouseAdapter(JPanel panel)
	{
		this.panel = panel;
	}
	@Override
	public void mouseEntered(MouseEvent e) 
	{
		panel.setBackground(SystemColor.textHighlight);
	}
	@Override
	public void mousePressed(MouseEvent e)
	{
		panel.setBackground(SystemColor.textHighlight);
	}
	@Override
	public void mouseReleased(MouseEvent e)
	{
		panel.setBackground(SystemColor.textHighlight);
	}
	@Override
	public void mouseExited(MouseEvent e)
	{
		panel.setBackground(SystemColor.blue);
	}
}

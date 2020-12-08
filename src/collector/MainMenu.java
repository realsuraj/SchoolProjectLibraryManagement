package collector;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PUBLIC_MEMBER;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;





public class MainMenu extends JFrame {

	private JPanel contentPane;

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
		
		JLabel lblNewLabel_1 = new JLabel("add Book");
		lblNewLabel_1.setBounds(280, 190, 56, 16);
		LayerPanelAddBook.add(lblNewLabel_1);
		
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
		panelAddBook.addMouseListener(new PanelButtonMouseAdapter(panelAddBook));
		panelAddBook.setBackground(Color.BLUE);
		panelAddBook.setBounds(12, 61, 236, 43);
		paneMenu.add(panelAddBook);
		panelAddBook.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Book");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(LayerPanelAddBook);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(86, 13, 77, 18);
		panelAddBook.add(lblNewLabel);
		
		JPanel panelStatistics = new JPanel();
		panelStatistics.addMouseListener(new PanelButtonMouseAdapter(panelStatistics));
		panelStatistics.setBackground(Color.BLUE);
		panelStatistics.setBounds(12, 117, 236, 43);
		paneMenu.add(panelStatistics);
		panelStatistics.setLayout(null);
		
		JLabel lblStatistic = new JLabel("Statistic");
		lblStatistic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(LayerPanelStatistics);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		lblStatistic.setBounds(80, 13, 76, 21);
		lblStatistic.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistic.setForeground(Color.WHITE);
		lblStatistic.setFont(new Font("Dialog", Font.BOLD, 16));
		panelStatistics.add(lblStatistic);
		
		JPanel panelAddStudent = new JPanel();
		panelAddStudent.addMouseListener(new PanelButtonMouseAdapter(panelAddStudent));
		panelAddStudent.setBackground(Color.BLUE);
		panelAddStudent.setBounds(12, 173, 236, 43);
		paneMenu.add(panelAddStudent);
		panelAddStudent.setLayout(null);
		
		JLabel lblAddStudent = new JLabel("Add Student");
		lblAddStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(LayerPanelAddStudent);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		lblAddStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddStudent.setForeground(Color.WHITE);
		lblAddStudent.setFont(new Font("Dialog", Font.BOLD, 16));
		lblAddStudent.setBounds(66, 13, 112, 21);
		panelAddStudent.add(lblAddStudent);
		
		JPanel panelIssueBook = new JPanel();
		panelIssueBook.addMouseListener(new PanelButtonMouseAdapter(panelIssueBook));
		panelIssueBook.setBackground(Color.BLUE);
		panelIssueBook.setBounds(12, 229, 236, 43);
		paneMenu.add(panelIssueBook);
		panelIssueBook.setLayout(null);
		
		JLabel lblIssueBook = new JLabel("Issue Book");
		lblIssueBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(LayerPanelIssueBook);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		lblIssueBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssueBook.setForeground(Color.WHITE);
		lblIssueBook.setFont(new Font("Dialog", Font.BOLD, 16));
		lblIssueBook.setBounds(77, 13, 98, 21);
		panelIssueBook.add(lblIssueBook);
		
		JPanel panelReturnBook = new JPanel();
		panelReturnBook.addMouseListener(new PanelButtonMouseAdapter(panelReturnBook));
		panelReturnBook.setBackground(Color.BLUE);
		panelReturnBook.setBounds(12, 285, 236, 43);
		paneMenu.add(panelReturnBook);
		panelReturnBook.setLayout(null);
		
		JLabel lblReturnBook = new JLabel("Return Book");
		lblReturnBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(LayerPanelReturnBook);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		lblReturnBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblReturnBook.setForeground(Color.WHITE);
		lblReturnBook.setFont(new Font("Dialog", Font.BOLD, 16));
		lblReturnBook.setBounds(72, 13, 98, 21);
		panelReturnBook.add(lblReturnBook);
		
		JPanel panelHelp = new JPanel();
		panelHelp.addMouseListener(new PanelButtonMouseAdapter(panelHelp));
		panelHelp.setBackground(Color.BLUE);
		panelHelp.setBounds(12, 341, 236, 43);
		paneMenu.add(panelHelp);
		panelHelp.setLayout(null);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(LayerPanelHelp);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
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
		panel.setBackground(SystemColor.BLUE);
	}
	@Override
	public void mouseReleased(MouseEvent e)
	{
		panel.setBackground(SystemColor.textHighlight);
	}
	@Override
	public void mouseExited(MouseEvent e)
	{
		panel.setBackground(Color.textHighlight);
	}
}

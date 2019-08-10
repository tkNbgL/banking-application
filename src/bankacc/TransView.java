package bankacc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;

public class TransView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnManMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TransView frame = new TransView();
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
	public TransView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 659);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTransactonHstory = new JLabel("TRANSACTION HISTORY");
		lblTransactonHstory.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblTransactonHstory.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransactonHstory.setBounds(329, 70, 340, 60);
		contentPane.add(lblTransactonHstory);
		
		table = new JTable();
		table.setBackground(new Color(211, 211, 211));
		table.setBounds(167, 178, 664, 303);
		contentPane.add(table);
		
		btnManMenu = new JButton("MAIN MENU");
		btnManMenu.setBackground(new Color(204, 204, 204));
		btnManMenu.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnManMenu.setBounds(751, 528, 200, 50);
		contentPane.add(btnManMenu);
	}
}

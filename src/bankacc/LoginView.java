package bankacc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Usernamer;
	private JPasswordField txt_passwordField;
	private JButton btn_S�gnIn;
	private JButton btn_S�gnUp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 643);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 153));
		contentPane.setForeground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("USER NAME:");
		lblUserName.setFont(new Font("Calibri", Font.BOLD, 31));
		lblUserName.setBounds(179, 144, 186, 65);
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setForeground(Color.BLACK);
		lblUserName.setBackground(Color.BLUE);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Calibri", Font.BOLD, 31));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(179, 220, 186, 65);
		contentPane.add(lblPassword);
		
		txt_Usernamer = new JTextField();
		txt_Usernamer.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_Usernamer.setBackground(new Color(204, 204, 204));
		txt_Usernamer.setHorizontalAlignment(SwingConstants.LEFT);
		txt_Usernamer.setBounds(418, 152, 200, 50);
		contentPane.add(txt_Usernamer);
		txt_Usernamer.setColumns(10);
		
		btn_S�gnIn = new JButton("SIGN IN");
		btn_S�gnIn.setForeground(SystemColor.windowBorder);
		btn_S�gnIn.setBackground(SystemColor.desktop);
		btn_S�gnIn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_S�gnIn.setBounds(184, 348, 242, 65);
		contentPane.add(btn_S�gnIn);
		
		btn_S�gnUp = new JButton("S\u0130GN UP!");
		btn_S�gnUp.setForeground(SystemColor.windowBorder);
		btn_S�gnUp.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_S�gnUp.setBackground(SystemColor.desktop);
		btn_S�gnUp.setBounds(488, 348, 242, 65);
		contentPane.add(btn_S�gnUp);
		
		JLabel lblLogn = new JLabel("LOG IN");
		lblLogn.setForeground(new Color(51, 51, 153));
		lblLogn.setBackground(new Color(51, 51, 153));
		lblLogn.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblLogn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogn.setBounds(388, 46, 178, 50);
		contentPane.add(lblLogn);
		
		txt_passwordField = new JPasswordField();
		txt_passwordField.setBackground(new Color(204, 204, 204));
		txt_passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		txt_passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_passwordField.setBounds(418, 220, 200, 50);
		contentPane.add(txt_passwordField);
		
		
	}

	public String getTxt_Usernamer() {
		return txt_Usernamer.getText();
	}

	public String getTxt_passwordField() {
		return txt_passwordField.getText();
	}
	
	void s�gn�nListener(ActionListener listenerForS�gn�nButton){
		btn_S�gnIn.addActionListener(listenerForS�gn�nButton);
	}
	
	void s�gnupListener(ActionListener listenerForS�gnupButton){
		btn_S�gnUp.addActionListener(listenerForS�gnupButton);
	}
}

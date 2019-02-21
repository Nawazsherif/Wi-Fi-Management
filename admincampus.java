package contents;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class admincampus extends JFrame {

	private JPanel contentPane;

	public admincampus() {
		setBackground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Admin inside a campus", TitledBorder.LEADING, TitledBorder.TOP, null, Color.PINK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(79, 74, 72, 19);
		contentPane.add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(79, 109, 72, 14);
		contentPane.add(lblPassword);
		
		final JPasswordField editorPane = new JPasswordField();
		editorPane.setBounds(188, 103, 106, 20);
		contentPane.add(editorPane);
		
		final JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(188, 74, 106, 20);
		contentPane.add(editorPane_1);
		
		final JLabel lblInvalidAdminUsername = new JLabel("Invalid Admin Username or Password");
		lblInvalidAdminUsername.setForeground(Color.RED);
		lblInvalidAdminUsername.setVisible(false);
		lblInvalidAdminUsername.setBounds(79, 208, 237, 14);
		contentPane.add(lblInvalidAdminUsername);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(262, 155, 89, 23);
		contentPane.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(editorPane_1.getText().equals("Admin") && editorPane.getText().equals("123"))
				{
				dispose();
				campusadmin frame =new campusadmin();
					frame.setVisible(true);
				}
				else
				{
					lblInvalidAdminUsername.setVisible(true);
				}
				
			}
		});
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Insidecampus frame=new Insidecampus();
				frame.setVisible(true);
			}
		});
		button.setBounds(79, 155, 89, 23);
		contentPane.add(button);
		}
}


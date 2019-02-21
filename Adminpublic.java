package contents;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JPasswordField;

public class Adminpublic extends JFrame{

	private JPanel contentPane;
	public Adminpublic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new TitledBorder(null, "Admin inside a Public", TitledBorder.LEADING, TitledBorder.TOP, null, Color.MAGENTA));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(124, 72, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(124, 110, 46, 14);
		contentPane.add(lblPassword);
		
		final JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(226, 66, 106, 20);
		contentPane.add(editorPane);
		
		final JPasswordField editorPane_1 = new JPasswordField();
		editorPane_1.setBounds(226, 104, 106, 20);
		contentPane.add(editorPane_1);
		
		final JLabel lblNewLabel = new JLabel("Invalid Username or Password");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(109, 196, 223, 14);
		contentPane.add(lblNewLabel);
		lblNewLabel.setVisible(false);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(248, 149, 89, 23);
		contentPane.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(editorPane.getText().equals("Admin") && editorPane_1.getText().equals("123"))
				{
				dispose();
				Publicadmin frame = null;
				try {
					frame = new Publicadmin();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.setVisible(true);
				
				} 
				else
				{
					lblNewLabel.setVisible(true);
				}
				
			}
		});
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Insidepublic frame=new Insidepublic();
				frame.setVisible(true);
				}
		});
		button.setBounds(123, 149, 89, 23);
		contentPane.add(button);
		
	}
}

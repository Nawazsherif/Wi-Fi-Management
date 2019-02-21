package contents;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class Insidepublic extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args)
	{
		Insidepublic frame=new Insidepublic();
		frame.setVisible(true);
	}

	public Insidepublic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new TitledBorder(null, "Inside a public Place", TitledBorder.LEADING, TitledBorder.TOP, null, Color.PINK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JCheckBox admin = new JCheckBox("Admin");
		admin.setBounds(160, 66, 97, 23);
		contentPane.add(admin);
		
		final JCheckBox chckbxUser = new JCheckBox("User");
		chckbxUser.setBounds(160, 92, 97, 23);
		contentPane.add(chckbxUser);
		final JLabel lblCheckAnyOne = new JLabel("Check any one of the boxes");
		lblCheckAnyOne.setForeground(Color.RED);
		lblCheckAnyOne.setBounds(113, 157, 197, 14);
		lblCheckAnyOne.setVisible(false);
		contentPane.add(lblCheckAnyOne);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(235, 123, 75, 23);
		contentPane.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((admin.isSelected()&&chckbxUser.isSelected())||(!admin.isSelected()&&!chckbxUser.isSelected()))
				{
					lblCheckAnyOne.setVisible(true);
				}
				else if(chckbxUser.isSelected())
				{	
					dispose();
					userpublic frame = new userpublic();
					frame.setVisible(true);
				}
				else if(admin.isSelected())
				{	
					dispose();
					Adminpublic frame = new Adminpublic();
					frame.setVisible(true);
				}
				
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.RED);
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(102, 122, 75, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login frame=new Login();
				frame.setVisible(true);
			}
		});
		contentPane.add(btnBack);
		}
}
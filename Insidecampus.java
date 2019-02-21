package contents;

import java.awt.BorderLayout;
import java.io.IOException;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;

public class Insidecampus extends JFrame {

	private JPanel contentPane;

	public Insidecampus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Inside a Campus", TitledBorder.LEFT, TitledBorder.TOP, null, Color.PINK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JCheckBox chckbxAdmin = new JCheckBox("Admin");
		chckbxAdmin.setBounds(108, 81, 97, 23);
		contentPane.add(chckbxAdmin);
		
		final JCheckBox chckbxUser = new JCheckBox("User");
		chckbxUser.setBounds(108, 111, 97, 23);
		contentPane.add(chckbxUser);
		final JLabel lblCheckAnyoneOf = new JLabel("Check anyone of the boxes");
		lblCheckAnyoneOf.setForeground(Color.PINK);
		lblCheckAnyoneOf.setBounds(67, 191, 192, 23);
		lblCheckAnyoneOf.setVisible(false);
		contentPane.add(lblCheckAnyoneOf);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(176, 157, 75, 23);
		contentPane.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((chckbxAdmin.isSelected()&&chckbxUser.isSelected())||(!chckbxAdmin.isSelected()&&!chckbxUser.isSelected()))
				{
					lblCheckAnyoneOf.setVisible(true);
				}
				else if(chckbxUser.isSelected())
				{	
					dispose();
					usercampus frame = null;
					try {
						frame = new usercampus();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					frame.setVisible(true);
				}
				else if(chckbxAdmin.isSelected())
				{	
					dispose();
					admincampus frame = new admincampus();
					frame.setVisible(true);
				}
				
			}
		});
		JButton btnBack = new
		JButton("Back");
		btnBack.setForeground(Color.RED);
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(57, 157, 75, 23);
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
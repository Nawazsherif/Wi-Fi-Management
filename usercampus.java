package contents;
import java.net.InetAddress;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.UnknownHostException;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class usercampus extends JFrame {

	private JPanel contentPane;
	
	public usercampus()throws IOException{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new TitledBorder(null, "User Inside a Campus", TitledBorder.LEADING, TitledBorder.TOP, null, Color.MAGENTA));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(93, 77, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(93, 119, 97, 14);
		contentPane.add(lblPhoneNumber);
		
		final JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(216, 77, 106, 20);
		contentPane.add(editorPane);
		
		final JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(216, 119, 106, 20);
		contentPane.add(editorPane_1);
		
		JLabel lblEnterNameAnd = new JLabel("Invalid Name/Phone Number");
		lblEnterNameAnd.setForeground(Color.RED);
		lblEnterNameAnd.setBounds(86, 198, 229, 14);
		contentPane.add(lblEnterNameAnd);
		lblEnterNameAnd.setVisible(false);
		
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(226, 156, 89, 23);
		contentPane.add(btnConnect);
		btnConnect.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{	
					if(editorPane.getText().equals("") || !editorPane_1.getText().chars().allMatch(Character::isDigit))
					{
						lblEnterNameAnd.setVisible(true);
					}
					else
					{
					String s1=editorPane.getText();
					String s2=editorPane_1.getText();
					String s3 = null;
					try {
						s3 = InetAddress.getLocalHost().getHostAddress();
					} catch (UnknownHostException e3) {
						e3.printStackTrace();
					}
					try {
						FileWriter f=new FileWriter("C:\\Users\\Nawaz\\Music\\users.txt",true);
						BufferedWriter b=new BufferedWriter(f);
						b.append(s1+"\t");
						if(s1.length()<=8)
						{
							b.append("\t");
						}
						b.append(s2+"\t");
						b.append(s3+"\t");
					
						b.close();
						dispose();
						campususer frame=new campususer();
						frame.setVisible(true);
					} catch (IOException e1) {
						e1.printStackTrace();
					} 
					
					catch (InterruptedException e2) {
						e2.printStackTrace();
					}}
				}
				});
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(82, 156, 89, 23);
		contentPane.add(btnBack);
		
		
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Insidecampus frame=new Insidecampus();
				frame.setVisible(true);
			}
		});
		
	}
}

package contents;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class campusadmin extends JFrame {

	private JPanel contentPane;

	public campusadmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new TitledBorder(null, "AdminPage for Campus", TitledBorder.LEADING, TitledBorder.TOP, null, Color.PINK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(418, 122, -397, 104);
		contentPane.add(scrollPane);
		
		JLabel lblMaximumNoofUsers = new JLabel("Maximum no.of Users");
		lblMaximumNoofUsers.setBounds(27, 41, 177, 20);
		contentPane.add(lblMaximumNoofUsers);
		
		final JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(225, 41, 58, 20);
		contentPane.add(editorPane);
		
		JLabel lblTimeLimit = new JLabel("Time Limit");
		lblTimeLimit.setBounds(27, 72, 103, 20);
		contentPane.add(lblTimeLimit);
		
		final JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(225, 72, 58, 20);
		contentPane.add(editorPane_1);
		
		final JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setBounds(29, 141, 533, 158);
		contentPane.add(editorPane_3);
		
		final JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBounds(225, 99, 58, 20);
		contentPane.add(editorPane_2);
		JButton btnViewUsers = new JButton("View Users");
		btnViewUsers.setBounds(418, 71, 125, 23);
		contentPane.add(btnViewUsers);
		btnViewUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String s1=editorPane_1.getText();
				String s2=editorPane_2.getText();
				try {
			
					FileWriter f=new FileWriter("C:\\Users\\Nawaz\\Music\\admin.txt");
					BufferedWriter b=new BufferedWriter(f);
					b.append("\n"+s1+" ");
					b.append(s2+" ");
					Integer.parseInt(s2);
					b.close();
					String content=new String(Files.readAllBytes(Paths.get("C:\\Users\\Nawaz\\Music\\users.txt")));
					editorPane_3.setText(content);
					
				} catch (IOException e1) {
			
					e1.printStackTrace();
				}
			}
			});
		
		JLabel lblDataSpeed = new JLabel("Data Speed");
		lblDataSpeed.setBounds(27, 105, 103, 14);
		contentPane.add(lblDataSpeed);
		
		JLabel lblInSeconds = new JLabel("In Seconds");
		lblInSeconds.setBounds(301, 75, 86, 17);
		contentPane.add(lblInSeconds);
		
		JLabel lblMbsec = new JLabel("Mb/sec");
		lblMbsec.setBounds(299, 99, 88, 20);
		contentPane.add(lblMbsec);
		}
}
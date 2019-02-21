package contents;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JEditorPane;

public class Publicadmin extends JFrame {

	private JPanel contentPane;
	
	public Publicadmin() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminAccess = new JLabel("Admin access");
		lblAdminAccess.setBounds(15, 16, 111, 14);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(42, 42, 84, 20);
		
		JLabel lblDataLimit = new JLabel("Data limit");
		lblDataLimit.setBounds(42, 120, 84, 20);
		
		JLabel lblNumberOfDevice = new JLabel("Number of device");
		lblNumberOfDevice.setBounds(42, 97, 106, 17);
		
		JLabel lblRange = new JLabel("Range");
		lblRange.setBounds(42, 144, 84, 20);
		
		JLabel lblTimeLimit = new JLabel("Time limit");
		lblTimeLimit.setBounds(42, 68, 84, 14);
		
		JLabel lblMeters = new JLabel("Meters");
		lblMeters.setBounds(291, 146, 64, 17);
		
		final JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(180, 42, 106, 20);
		
		final JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(180, 68, 106, 20);
		
		final JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBounds(180, 94, 106, 20);
		
		final JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setBounds(180, 120, 106, 20);
		
		JEditorPane editorPane_4 = new JEditorPane();
		editorPane_4.setBounds(180, 146, 106, 20);
		
		contentPane.setLayout(null);
		contentPane.add(lblMeters);
		contentPane.add(editorPane);
		contentPane.add(editorPane_1);
		contentPane.add(editorPane_2);
		contentPane.add(editorPane_3);
		contentPane.add(editorPane_4);
		contentPane.add(lblAdminAccess);
		contentPane.add(lblPrice);
		contentPane.add(lblNumberOfDevice);
		contentPane.add(lblDataLimit);
		contentPane.add(lblRange);
		contentPane.add(lblTimeLimit);
		
		JButton btnProceed = new JButton("Proceed");
		btnProceed.setBounds(154, 192, 89, 23);
		contentPane.add(btnProceed);
		
		JLabel lblInSeconds = new JLabel("In seconds");
		lblInSeconds.setBounds(292, 68, 84, 20);
		contentPane.add(lblInSeconds);
		
		JLabel lblMbssec = new JLabel("Mbs/sec");
		lblMbssec.setBounds(295, 123, 81, 17);
		contentPane.add(lblMbssec);
				btnProceed.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{	
					String s1=editorPane.getText();
					String s2=editorPane_1.getText();
					String s3=editorPane_3.getText();
					FileWriter f;
					try {
						f = new FileWriter("C:\\Users\\Nawaz\\Music\\timelimit.txt",true);
						BufferedWriter b=new BufferedWriter(f);
						b.append(s1+" "+s2+" "+s3+" ");
						b.close();
						dispose();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					dispose();
				}
				});
	}
}

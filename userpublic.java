package contents;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class userpublic extends JFrame {

	private JPanel contentPane;
	
		public userpublic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new TitledBorder(null, "User Inside a PUblic", TitledBorder.LEADING, TitledBorder.TOP, null, Color.PINK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.CYAN);
		lblName.setBounds(109, 85, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(Color.CYAN);
		lblPhoneNumber.setBounds(109, 128, 100, 14);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblCode = new JLabel("Price");
		lblCode.setForeground(Color.CYAN);
		lblCode.setBounds(109, 167, 46, 14);
		contentPane.add(lblCode);
		
		final JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(212, 85, 106, 20);
		contentPane.add(editorPane);
		
		final JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(212, 122, 106, 20);
		contentPane.add(editorPane_1);
		
		final JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBounds(212, 161, 106, 20);
		contentPane.add(editorPane_2);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(160, 208, 89, 23);
		contentPane.add(btnConnect);
		
		final JLabel lblInvalidNamephoneNumber = new JLabel("Invalid Name/Phone Number");
		lblInvalidNamephoneNumber.setForeground(Color.RED);
		lblInvalidNamephoneNumber.setBounds(224, 36, 179, 14);
		contentPane.add(lblInvalidNamephoneNumber);
		lblInvalidNamephoneNumber.setVisible(false);
		btnConnect.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	
				if(editorPane.getText().equals("") || !editorPane_1.getText().chars().allMatch(Character::isDigit))
				{
					lblInvalidNamephoneNumber.setVisible(true);
				}
				else
				{
				try
				{
				Scanner scanner = new Scanner(new File("C:\\Users\\Nawaz\\Music\\timelimit.txt"));
				int [] tall = new int [100];
				int i=0;
				while(scanner.hasNextInt())
				{
					tall[i++]=scanner.nextInt();
				}
				i=0;
				int j=Integer.parseInt(editorPane_2.getText());
				while(i<tall.length)
				{
					if((tall[i]==j) ||(tall[i]==(int)(Math.ceil(j/1000.0))*1000))
					{
						FileWriter f=new FileWriter("C:\\Users\\Nawaz\\Music\\publictime.txt");
						BufferedWriter b=new BufferedWriter(f);
						b.write(tall[i+1]+" "+tall[i+2]);
						b.close();
					}
					i=i+3;
				}
				}
				catch(FileNotFoundException e1)
				{
					e1.printStackTrace();
				}
				catch(IOException e2)
				{
					e2.printStackTrace();	
				}
				dispose();
				Publicuser frame = null;
				try {
					frame = new Publicuser();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				frame.setVisible(true);
			}
			}
		});
	}
}

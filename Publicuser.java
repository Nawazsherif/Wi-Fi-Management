package contents;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Publicuser extends JFrame {

	private JPanel contentPane;

	public Publicuser() throws FileNotFoundException, InterruptedException{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTime = new JLabel("Time Remaining :");
		lblTime.setForeground(Color.RED);
		lblTime.setBackground(Color.WHITE);
		lblTime.setBounds(224, 11, 120, 20);
		contentPane.add(lblTime);
		
		
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		 Date date = calendar.getTime();
		JLabel lblNewLabel = new JLabel("Connected at timings");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(80, 40, 264, 14);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText("Connected at "+date);
		
		Scanner scanner = new Scanner(new File("C:\\Users\\Nawaz\\Music\\publictime.txt"));
		final int [] tall = new int [100];
			tall[0] = scanner.nextInt();
		     tall[1] = scanner.nextInt(); 
		     
		     final JEditorPane editorPane = new JEditorPane();
				editorPane.setBounds(360, 11, 42, 20);
				contentPane.add(editorPane);
				editorPane.setEditable(false);
				
				Timer t=new Timer();
				TimerTask t1=new TimerTask() {
					int sec=tall[0];
					public void run()
					{
						editorPane.setText(String.valueOf(sec));
						sec--;
						if(sec==0)
						{
							dispose();
							JOptionPane.showMessageDialog(null,"The data is expired","Disconnected",2);
						}
					}
				};
				 t.scheduleAtFixedRate(t1,1000,1000); 
		JLabel lblSearchWebsites = new JLabel("Search Websites");
		lblSearchWebsites.setForeground(Color.CYAN);
		lblSearchWebsites.setBounds(32, 71, 103, 14);
		contentPane.add(lblSearchWebsites);
		
		final JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(145, 65, 199, 20);
		contentPane.add(editorPane_1);
		
		
		JButton btnGo = new JButton("Go");
		btnGo.setBounds(360, 65, 51, 20);
		contentPane.add(btnGo);
		btnGo.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e)
				{
					try {
						java.awt.Desktop.getDesktop().browse(new java.net.URI(editorPane_1.getText()));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				});
		
		JLabel lblMbsec = new JLabel("Mb/sec");
		lblMbsec.setForeground(Color.MAGENTA);
		lblMbsec.setBounds(34, 14, 138, 14);
		contentPane.add(lblMbsec);
		lblMbsec.setText(String.valueOf(tall[1]+" Mbs/second"));
	}
}

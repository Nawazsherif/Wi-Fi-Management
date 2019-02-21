package contents;




import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel p;


	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login(); 
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		p = new JPanel();
		p.setForeground(Color.CYAN);
		p.setBackground(Color.BLUE);
		p.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Wi-Fi Management", TitledBorder.LEADING, TitledBorder.BELOW_TOP, null, Color.PINK));
		setContentPane(p);
		p.setLayout(null);
		
		JButton btnNewButton = new JButton("Inside a Campus");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Insidecampus frame1 = new Insidecampus();
				frame1.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(107, 71, 165, 23);
		p.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Inside a public");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Insidepublic frame1 = new Insidepublic();
				frame1.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(107, 122, 165, 23);
		p.add(btnNewButton_1);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Employeemanagement {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employeemanagement window = new Employeemanagement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Employeemanagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1539, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(128, 255, 128));
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel.setBounds(0, 48, 890, 65);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Click Here To Login");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPage p = new LoginPage();
				p.setVisible(true);
				frame.dispose();
			}
		});

		btnNewButton.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(637, 746, 201, 37);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Spark\\java\\project\\image\\IMAGE\\zzz.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1525, 793);
		frame.getContentPane().add(lblNewLabel_1);
	}
}

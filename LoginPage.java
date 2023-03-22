import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;
import com.mysql.cj.xdevapi.Result;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class LoginPage {

	private JFrame frmLoginPage;
	private JTextField textusername;
	private JPasswordField textpassword;
	private JLabel lblerror;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmLoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginPage = new JFrame();
		frmLoginPage.setFont(new Font("Arial", Font.BOLD, 20));
		frmLoginPage.setForeground(new Color(0, 128, 255));
		frmLoginPage.setTitle("Login Page");
		frmLoginPage.setBounds(0, 0, 1539, 800);
		frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginPage.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("User Name:-");
		lblNewLabel.setBounds(566, 220, 142, 26);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		frmLoginPage.getContentPane().add(lblNewLabel);

		textusername = new JTextField();
		textusername.setBounds(754, 224, 192, 26);
		frmLoginPage.getContentPane().add(textusername);
		textusername.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Password:-");
		lblNewLabel_1.setBounds(573, 354, 135, 23);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		frmLoginPage.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setBounds(551, 490, 149, 34);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
					java.sql.Statement st;
					st = con.createStatement();
					String Username = textusername.getText();
					String Password = textpassword.getText();
					ResultSet rs = ((java.sql.Statement) st).executeQuery(
							"select * from loginpage where Username='" + Username + "' && Password='" + Password + "'");
					if (rs.next()) {
						if (Username.equals(Username) && Password.equals(Password)) {
						
							
							JOptionPane.showMessageDialog(btnNewButton, "Login Successfully","Show",JOptionPane.DEFAULT_OPTION);
							frmLoginPage.dispose();
							Home u1 = new Home();
							u1.setVisible(true);
							new Home();

						}
						
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Username or Password","Show",JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e1) {
					
					System.out.println(e1);

				}
			}

		});

		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		frmLoginPage.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(832, 490, 149, 34);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textusername.setText(null);
				textpassword.setText(null);
			}
		});
		btnNewButton_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 18));
		frmLoginPage.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("Welcome");
		lblNewLabel_2.setBounds(563, 25, 357, 87);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
		frmLoginPage.getContentPane().add(lblNewLabel_2);

		textpassword = new JPasswordField();
		textpassword.setBounds(754, 356, 192, 26);
		frmLoginPage.getContentPane().add(textpassword);
		
//		JButton btnNewButton_2 = new JButton("Sign Up");
//		btnNewButton_2.setBounds(657, 597, 149, 34);
//		btnNewButton_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					
//					Class.forName("com.mysql.jdbc.Driver");
//					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark1","root","");
//					
//					PreparedStatement stmt= con.prepareStatement("insert into student values(?,?,?,?,?)");
//					
//					stmt.setInt(1, 4);
//					stmt.setString(2,"Harsh");
//					stmt.setInt(3,22);
//					stmt.setString(4,"Omerga");
//					stmt.setString(5,"harsh@gmail.com");
//					int i=stmt.executeUpdate();
//					System.out.println(i+"Record Inserted");
//					
//				
//
//				}
//				catch(Exception e1)
//				{
//					System.out.println(e1);
//				}
//				
//			}
//			
//		});
//		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 18));
//		frmLoginPage.getContentPane().add(btnNewButton_2);
//		
//		 lblerror = new JLabel("");
//		lblerror.setFont(new Font("Arial", Font.BOLD, 18));
//		lblerror.setBounds(604, 427, 342, 26);
//		frmLoginPage.getContentPane().add(lblerror);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 1539, 800);
		lblNewLabel_3
				.setIcon(new ImageIcon("C:\\Spark\\java\\project\\image\\IMAGE\\pexels-andrea-piacquadio-840996.jpg"));
		frmLoginPage.getContentPane().add(lblNewLabel_3);
		
		
	}

	public void setVisible(boolean b) {
		frmLoginPage.setVisible(true);

	}
}

import java.awt.Choice;

import java.awt.EventQueue;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.SwingConstants;
import net.proteanit.sql.DbUtils;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.ImageIcon;

public class RemoveEmp extends JFrame implements ActionListener{

	private static final String ItemListener = null;
	private JFrame frame;
	Choice cempid; 
	JButton btnNewButton,btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveEmp window = new RemoveEmp();
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
	public RemoveEmp() {
		initialize();
	} 

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(1, 1, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Remove Employee");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(97, 100, 183, 23);
		frame.getContentPane().add(lblNewLabel);
		JLabel emp_id = new JLabel("Employee Id:-");
		emp_id.setBounds(64, 99, 126, 21);
		emp_id.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		getContentPane().add(emp_id);

		cempid = new Choice();
		cempid.setBounds(312, 97, 183, 23);
		cempid.setFont(new Font("Arial", Font.BOLD, 18));
		frame.getContentPane().add(cempid);

		JLabel lblNewLabel_1 = new JLabel("Name:-");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(170, 157, 138, 21);
		frame.getContentPane().add(lblNewLabel_1);
		JLabel textField_name = new JLabel();
		textField_name.setForeground(Color.WHITE);
		textField_name.setFont(new Font("Arial", Font.BOLD, 22));
		textField_name.setBounds(305, 155, 285, 23);
		frame.getContentPane().add(textField_name);

		JLabel lblNewLabel_3_1_1 = new JLabel("Designation:-");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_1_1.setBounds(170, 305, 132, 25);
		frame.getContentPane().add(lblNewLabel_3_1_1);

		JLabel textField_desig = new JLabel();
		textField_desig.setForeground(Color.WHITE);
		textField_desig.setFont(new Font("Arial", Font.BOLD, 22));

		textField_desig.setBounds(312, 305, 210, 25);
		frame.getContentPane().add(textField_desig);

		JLabel lblNewLabel_2_1_1 = new JLabel("Aadhar Number:-");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_1_1.setBounds(120, 224, 160, 21);
		frame.getContentPane().add(lblNewLabel_2_1_1);

		JLabel textField_aadhar = new JLabel();
		textField_aadhar.setForeground(Color.WHITE);
		textField_aadhar.setFont(new Font("Arial", Font.BOLD, 22));

		textField_aadhar.setBounds(312, 224, 203, 25);
		frame.getContentPane().add(textField_aadhar);

		JLabel lblNewLabel_3_1_1_2 = new JLabel("Email:-");
		lblNewLabel_3_1_1_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_1_1_2.setBounds(216, 363, 86, 25);
		frame.getContentPane().add(lblNewLabel_3_1_1_2);

		JLabel textField_emai = new JLabel();
		textField_emai.setForeground(Color.WHITE);
		textField_emai.setFont(new Font("Tahoma", Font.PLAIN, 22));

		textField_emai.setBounds(312, 365, 285, 26);
		frame.getContentPane().add(textField_emai);

		JLabel lblNewLabel_2_1_3 = new JLabel("Phone Number:-");
		lblNewLabel_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_1_3.setBounds(146, 428, 149, 21);
		frame.getContentPane().add(lblNewLabel_2_1_3);

		JLabel textField_phone = new JLabel();
		textField_phone.setForeground(Color.WHITE);
		textField_phone.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_phone.setBounds(312, 428, 210, 25);
		frame.getContentPane().add(textField_phone);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String a = "select * from employeeinformation ";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
			java.sql.Statement st;
			st = con.createStatement();
			ResultSet rs = st.executeQuery(a);
			while (rs.next()) {
				cempid.add(rs.getString("empid"));

			}
		} catch (Exception e4) {
			System.out.println(e4);
		}

		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String r = "delete from employeeinformation where empid ='" + cempid.getSelectedItem() + "'";
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
					java.sql.Statement st;
					st = con.createStatement();
					int rs = st.executeUpdate(r);
					JOptionPane.showMessageDialog(null, "Record Delete Successfully...", "Show",
							JOptionPane.DEFAULT_OPTION);
					dispose();
					Home b = new Home();
					b.setVisible(true);
				} catch (Exception e5) {
					System.out.println(e5);
				}
			}
		});

		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(159, 596, 149, 38);
		frame.getContentPane().add(btnNewButton);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Home b = new Home();
				b.setVisible(true);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 18));
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(483, 596, 149, 38);
		frame.getContentPane().add(btnBack);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Spark\\java\\project\\image\\IMAGE\\remove1.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(lblNewLabel_2);

		cempid.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String a = "select * from employeeinformation where empid ='" + cempid.getSelectedItem() + "'";
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
					java.sql.Statement st;
					st = con.createStatement();
					ResultSet rs = st.executeQuery(a);
					while (rs.next()) {
						textField_name.setText(rs.getString("Name"));
						textField_aadhar.setText(rs.getString("AadharNumber"));
						textField_desig.setText(rs.getString("Designation"));
						textField_emai.setText(rs.getString("Email"));
						textField_phone.setText(rs.getString("PhoneNumber"));

					}
				} catch (Exception e4) {
					System.out.println(e4);
				}

			}
		});
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	}


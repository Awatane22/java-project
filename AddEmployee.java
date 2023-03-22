import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import com.toedter.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Window;
import java.util.Random;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

import com.toedter.calendar.IDateEditor;
import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;

public class AddEmployee extends JFrame {

	private JTextField textField_name;
	private JTextField textField_salary;
	private JTextField textField_m_name;
	private JTextField textField_aadhar;
	private JTextField textField_desig;
	private JTextField textField_add;
	private JTextField textField_hob;
	private JTextField textField_emai;
	private JTextField textField_phone;
	private JTextField empid;
	private JComboBox qualification;
	private JComboBox textField_gender;
	private JDateChooser datech;
	private JLabel lblempid;
	private JButton btn_Add;
	private JButton btn_Back;
	private JLabel lblNewLabel_1;
	private JTextArea textArea;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee window = new AddEmployee();
					window.setVisible(true);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
	}

	public AddEmployee() {

		initialize();
	}

	private void initialize() {

		new JFrame();
		setBounds(100, 100, 1910, 1070);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Add Employee Details");
		lblNewLabel.setBounds(567, 10, 346, 44);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);

		Random num = new Random();
		int number = num.nextInt(9999);

		JLabel emp_id = new JLabel("Employee Id:-");
		emp_id.setBounds(238, 99, 126, 21);
		emp_id.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		getContentPane().add(emp_id);

		lblempid = new JLabel("" + number);
		lblempid.setBounds(461, 98, 67, 21);
		lblempid.setFont(new Font("Arial", Font.BOLD, 20));
		lblempid.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblempid);

//		textField_id = new JTextField();
//		textField_id.setBounds(199, 95, 210, 25);
//		textField_id.setFont(new Font("Arial", Font.BOLD, 18));
//		textField_id.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_id.setColumns(10);
//		add(textField_id);
//		

		JLabel lbl_name = new JLabel("Name:-");
		lbl_name.setBounds(273, 159, 91, 21);
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_name);

		textField_name = new JTextField();
		textField_name.setBounds(408, 157, 210, 25);
		textField_name.setFont(new Font("Arial", Font.BOLD, 16));
		getContentPane().add(textField_name);
		textField_name.setColumns(10);

		JLabel lbl_date = new JLabel("Date of Birth:-");
		lbl_date.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_date.setFont(new Font("Arial", Font.BOLD, 18));
		lbl_date.setBounds(748, 159, 138, 21);
		getContentPane().add(lbl_date);

		datech = new JDateChooser();
		datech.setFont(new Font("Arial", Font.BOLD, 18));
		datech.setBounds(935, 155, 210, 25);
		getContentPane().add(datech);

//		JLabel lblNewLabel_2 = new JLabel("Photo");
//		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
//		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel_2.setBounds(474, 139, 138, 21);
//		frame.getContentPane().add(lblNewLabel_2);
//		JButton btnNewButton = new JButton("Upload Photo");
//		btnNewButton.setBounds(674, 82, 149, 137);
//		frame.getContentPane().add(btnNewButton);

		JLabel lbl_salary = new JLabel("Salary:-");
		lbl_salary.setBounds(278, 227, 72, 25);
		lbl_salary.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_salary);

		textField_salary = new JTextField();
		textField_salary.setBounds(408, 227, 210, 25);
		textField_salary.setFont(new Font("Arial", Font.BOLD, 16));
		textField_salary.setColumns(10);
		getContentPane().add(textField_salary);

		JLabel lbl_Hobbies = new JLabel("Hobbies:-");
		lbl_Hobbies.setBounds(264, 315, 86, 25);
		lbl_Hobbies.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_Hobbies);

		textField_hob = new JTextField();
		textField_hob.setBounds(408, 315, 210, 25);
		textField_hob.setFont(new Font("Arial", Font.BOLD, 16));
		textField_hob.setColumns(10);
		getContentPane().add(textField_hob);

		JLabel lbl_aadhar = new JLabel("Aadhar Number:-");
		lbl_aadhar.setBounds(726, 317, 160, 21);
		lbl_aadhar.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_aadhar.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_aadhar);

		textField_aadhar = new JTextField();
		textField_aadhar.setBounds(935, 315, 210, 25);
		textField_aadhar.setFont(new Font("Arial", Font.BOLD, 16));
		textField_aadhar.setColumns(10);
		getContentPane().add(textField_aadhar);

		JLabel lbl_Qualification = new JLabel("Higher Qualification:-");
		lbl_Qualification.setBounds(693, 404, 193, 21);
		lbl_Qualification.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Qualification.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_Qualification);

		String courses[] = { "----Select------", "B.com", "B.A", "B.sc", "M.ca", "MA", "M.sc", "BCA", "B.E", "B.Tech",
				"B.BA" };

		qualification = new JComboBox(courses);
		qualification.setBounds(935, 402, 210, 25);
		qualification.setFont(new Font("Arial", Font.BOLD, 18));
		qualification.setBackground(Color.white);
		getContentPane().add(qualification);

		JLabel lbl_desig = new JLabel("Designation:-");
		lbl_desig.setBounds(238, 402, 126, 25);
		lbl_desig.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_desig);

		textField_desig = new JTextField();
		textField_desig.setBounds(408, 402, 210, 25);
		textField_desig.setFont(new Font("Arial", Font.BOLD, 16));
		textField_desig.setColumns(10);
		getContentPane().add(textField_desig);

		JLabel lbl_address = new JLabel("Address:-");
		lbl_address.setBounds(256, 466, 108, 30);
		lbl_address.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_address.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_address);

//		textField_add = new JTextField();
//		textField_add.setHorizontalAlignment(SwingConstants.LEFT);
//		textField_add.setToolTipText("");
//		textField_add.setBounds(405, 464, 290, 71);
//		textField_add.setFont(new Font("Arial", Font.BOLD, 18));
//		getContentPane().add(textField_add);
//		textField_add.setColumns(10);

		textArea = new JTextArea();
		textArea.setBounds(407, 464, 290, 71);
		getContentPane().add(textArea);

		JLabel lbl_gender = new JLabel("Gender:-");
		lbl_gender.setBounds(791, 487, 108, 25);
		lbl_gender.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_gender);

		String Gender1[] = { "----Select------", "Male", "Female" };

		textField_gender = new JComboBox(Gender1);
		textField_gender.setBounds(935, 487, 210, 25);
		textField_gender.setFont(new Font("Arial", Font.BOLD, 18));
		textField_gender.setBackground(Color.WHITE);
		getContentPane().add(textField_gender);

		JLabel lbl_Email = new JLabel("Email:-");
		lbl_Email.setBounds(295, 586, 86, 25);
		lbl_Email.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_Email);

		textField_emai = new JTextField();
		textField_emai.setBounds(408, 585, 256, 26);
		textField_emai.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		textField_emai.setColumns(10);
		getContentPane().add(textField_emai);

		JLabel lbl_Phoneno = new JLabel("Phone Number:-");
		lbl_Phoneno.setBounds(737, 588, 149, 21);
		lbl_Phoneno.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Phoneno.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_Phoneno);

		textField_phone = new JTextField();
		textField_phone.setBounds(935, 585, 210, 25);
		textField_phone.setFont(new Font("Arial", Font.BOLD, 18));
		textField_phone.setColumns(10);
		getContentPane().add(textField_phone);

		JLabel lbl_M_name = new JLabel("Mother Name:-");
		lbl_M_name.setBounds(748, 229, 138, 21);
		lbl_M_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_M_name.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_M_name);

		textField_m_name = new JTextField();
		textField_m_name.setBounds(935, 227, 210, 25);
		textField_m_name.setFont(new Font("Arial", Font.BOLD, 16));
		textField_m_name.setColumns(10);
		getContentPane().add(textField_m_name);

		btn_Add = new JButton("Save Details");
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String empid = lblempid.getText();
				String Name = textField_name.getText();
				String dob = ((JTextField) datech.getDateEditor().getUiComponent()).getText();
				String salary = textField_salary.getText();
				String mother = textField_m_name.getText();
				String hobbi = textField_hob.getText();
				String aadhar = textField_aadhar.getText();
				String designa = textField_desig.getText();
				String hqualification = (String) qualification.getSelectedItem();
				String addr = textArea.getText();
				String gen = (String) textField_gender.getSelectedItem();
				String email = textField_emai.getText();
				String phone = textField_phone.getText();

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");

					PreparedStatement pst = con.prepareStatement("insert into employeeinformation values('" + empid
							+ "','" + Name + "','" + dob + "','" + salary + "','" + mother + "','" + hobbi + "','"
							+ aadhar + "','" + designa + "','" + hqualification + "','" + addr + "','" + gen + "','"
							+ email + "','" + phone + "')");
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Inserted Successfully...", "Show",
							JOptionPane.DEFAULT_OPTION);

					Home b = new Home();
					b.setVisible(true);
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btn_Add.setBounds(419, 751, 224, 38);

		btn_Add.setBackground(new Color(255, 255, 255));
		btn_Add.setFont(new Font("Arial", Font.BOLD, 26));
		getContentPane().add(btn_Add);

		btn_Back = new JButton("Back");
		btn_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Home b = new Home();
				b.setVisible(true);
			}
		});
		btn_Back.setBounds(837, 751, 224, 38);
		btn_Back.setBackground(new Color(240, 240, 240));
		btn_Back.setFont(new Font("Arial", Font.BOLD, 26));
		getContentPane().add(btn_Back);

		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1
				.setIcon(new ImageIcon("C:\\Spark\\java\\project\\image\\IMAGE\\pexels-christina-morillo-1181304.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1540, 845);
		getContentPane().add(lblNewLabel_1);

	}
}

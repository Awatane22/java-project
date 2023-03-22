import java.awt.Choice;
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

import com.toedter.calendar.IDateEditor;
import com.toedter.calendar.JDateChooser;

import net.proteanit.sql.DbUtils;
import javax.swing.ImageIcon;

public class Employee_Update extends JFrame {

	private JButton btn_Add;
	private JButton btn_Back;

	private String empid;
	private JLabel lblempid;
	private JTextField textField_salary;
	private JTextField textField_hob;
	private JTextField qualification;
	private JTextField textField_desig;
	private JTextField textField_add;
	private JTextField textField_emai;
	private JTextField textField_phone;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_Update window = new Employee_Update("");
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public Employee_Update(String empid) {
		this.empid = empid;
		initialize();
	}

	private void initialize() {

		new JFrame();
		setBounds(0, 0, 1539, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);

		JLabel lblNewLabel = new JLabel("Update Employee Details");
		lblNewLabel.setBounds(481, 36, 346, 44);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);

		JLabel emp_id = new JLabel("Employee Id:-");
		emp_id.setBounds(238, 102, 126, 21);
		emp_id.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		getContentPane().add(emp_id);

		lblempid = new JLabel();
		lblempid.setBounds(468, 102, 67, 21);
		lblempid.setFont(new Font("Arial", Font.BOLD, 20));
		lblempid.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblempid);

		JLabel lbl_name = new JLabel("Name:-");
		lbl_name.setBounds(273, 157, 91, 21);
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_name);

		JLabel lablename = new JLabel();
		lablename.setBounds(432, 153, 210, 25);
		lablename.setFont(new Font("Arial", Font.BOLD, 16));
		getContentPane().add(lablename);

		JLabel lbl_date = new JLabel("Date of Birth:-");
		lbl_date.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_date.setFont(new Font("Arial", Font.BOLD, 18));
		lbl_date.setBounds(748, 157, 138, 21);
		getContentPane().add(lbl_date);

		JLabel Jdate = new JLabel();
		Jdate.setFont(new Font("Arial", Font.BOLD, 18));
		Jdate.setBounds(940, 157, 210, 21);
		getContentPane().add(Jdate);

		JLabel lbl_salary = new JLabel("Salary:-");
		lbl_salary.setBounds(287, 227, 72, 25);
		lbl_salary.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_salary);

		textField_salary = new JTextField();
		textField_salary.setBounds(437, 227, 210, 25);
		textField_salary.setFont(new Font("Arial", Font.BOLD, 16));
		textField_salary.setColumns(10);
		getContentPane().add(textField_salary);

		JLabel lbl_M_name = new JLabel("Mother Name:-");
		lbl_M_name.setBounds(748, 229, 138, 21);
		lbl_M_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_M_name.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_M_name);

		JLabel lblmname = new JLabel();
		lblmname.setBounds(940, 227, 210, 25);
		lblmname.setFont(new Font("Arial", Font.BOLD, 16));
		getContentPane().add(lblmname);

		JLabel lbl_Hobbies = new JLabel("Hobbies:-");
		lbl_Hobbies.setBounds(278, 313, 86, 25);
		lbl_Hobbies.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_Hobbies);

		textField_hob = new JTextField();
		textField_hob.setBounds(437, 313, 210, 25);
		textField_hob.setFont(new Font("Arial", Font.BOLD, 16));
		textField_hob.setColumns(10);
		getContentPane().add(textField_hob);

		JLabel lbl_aadhar = new JLabel("Aadhar Number:-");
		lbl_aadhar.setBounds(726, 315, 160, 21);
		lbl_aadhar.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_aadhar.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_aadhar);

		JLabel J_aadhar = new JLabel();
		J_aadhar.setBounds(940, 313, 210, 25);
		J_aadhar.setFont(new Font("Arial", Font.BOLD, 16));

		getContentPane().add(J_aadhar);

		JLabel lbl_Qualification = new JLabel("Higher Qualification:-");
		lbl_Qualification.setBounds(704, 403, 193, 21);
		lbl_Qualification.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Qualification.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_Qualification);

		qualification = new JTextField();
		qualification.setBounds(940, 400, 210, 25);
		qualification.setFont(new Font("Arial", Font.BOLD, 18));
		qualification.setBackground(Color.white);
		getContentPane().add(qualification);

		JLabel lbl_desig = new JLabel("Designation:-");
		lbl_desig.setBounds(238, 401, 126, 25);
		lbl_desig.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_desig);

		textField_desig = new JTextField();
		textField_desig.setBounds(437, 401, 210, 25);
		textField_desig.setFont(new Font("Arial", Font.BOLD, 16));
		textField_desig.setColumns(10);
		getContentPane().add(textField_desig);

		JLabel lbl_address = new JLabel("Address:-");
		lbl_address.setBounds(256, 484, 108, 30);
		lbl_address.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_address.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_address);

		textField_add = new JTextField();
		textField_add.setBounds(402, 464, 290, 71);
		textField_add.setFont(new Font("Arial", Font.BOLD, 16));
		getContentPane().add(textField_add);
		textField_add.setColumns(10);

		JLabel lbl_gender = new JLabel("Gender:-");
		lbl_gender.setBounds(801, 487, 108, 25);
		lbl_gender.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_gender);

		JLabel t_gender = new JLabel();
		t_gender.setBounds(940, 484, 210, 25);
		t_gender.setFont(new Font("Arial", Font.BOLD, 18));
		t_gender.setBackground(Color.WHITE);
		getContentPane().add(t_gender);

		JLabel lbl_Email = new JLabel("Email:-");
		lbl_Email.setBounds(278, 583, 86, 25);
		lbl_Email.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_Email);

		textField_emai = new JTextField();
		textField_emai.setBounds(437, 584, 210, 25);
		textField_emai.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		textField_emai.setColumns(10);
		getContentPane().add(textField_emai);

		JLabel lbl_Phoneno = new JLabel("Phone Number:-");
		lbl_Phoneno.setBounds(748, 585, 149, 21);
		lbl_Phoneno.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Phoneno.setFont(new Font("Arial", Font.BOLD, 18));
		getContentPane().add(lbl_Phoneno);

		textField_phone = new JTextField();
		textField_phone.setBounds(940, 582, 210, 25);
		textField_phone.setFont(new Font("Arial", Font.BOLD, 18));
		textField_phone.setColumns(10);
		getContentPane().add(textField_phone);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String q = "select *from employeeinformation where empid='" + empid + "'";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
			java.sql.Statement st;
			st = con.createStatement();
			ResultSet rs = st.executeQuery(q);
			while (rs.next()) {
				lblempid.setText(rs.getString("empid"));
				lablename.setText(rs.getString("Name"));
				Jdate.setText(rs.getString("Dateofbirth"));
				textField_salary.setText(rs.getString("Salary"));
				lblmname.setText(rs.getString("MotherName"));
				textField_hob.setText(rs.getString("Hobbies"));
				J_aadhar.setText(rs.getString("AadharNumber"));
				textField_desig.setText(rs.getString("Designation"));
				qualification.setText(rs.getString("HigherQualification"));
				textField_add.setText(rs.getString("Address"));
				t_gender.setText(rs.getString("Gender"));
				textField_emai.setText(rs.getString("Email"));
				textField_phone.setText(rs.getString("PhoneNumber"));
			}

		} catch (Exception e1) {
			System.out.println(e1);
		}

		btn_Add = new JButton("Update Details");
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String salary = textField_salary.getText();
				String hobbi = textField_hob.getText();
				String designa = textField_desig.getText();
				String hqualification = qualification.getText();
				String addr = textField_add.getText();
				String email = textField_emai.getText();
				String phone = textField_phone.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
					PreparedStatement pst = con.prepareStatement("update employeeinformation set Salary= '" + salary
							+ "', Hobbies='" + hobbi + "', Designation='" + designa + "', HigherQualification	='"
							+ hqualification + "', Address='" + addr + "', Email='" + email + "', PhoneNumber='" + phone
							+ "' where empid='" + empid + "'");
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Updated Successfully...", "Show",
							JOptionPane.DEFAULT_OPTION);
					Home b = new Home();
					b.setVisible(true);

				} catch (Exception e1) {
					System.out.println(e1);
				}

			}
		});

		btn_Add.setBounds(455, 698, 224, 38);
		btn_Add.setBackground(new Color(255, 255, 255));
		btn_Add.setFont(new Font("Arial", Font.BOLD, 26));
		getContentPane().add(btn_Add);

		btn_Back = new JButton("Back");
		btn_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				View_emp b = new View_emp();
				b.setVisible(true);
			}
		});
		btn_Back.setBounds(863, 698, 224, 38);
		btn_Back.setBackground(new Color(240, 240, 240));
		btn_Back.setFont(new Font("Arial", Font.BOLD, 26));
		getContentPane().add(btn_Back);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Spark\\java\\project\\image\\IMAGE\\pexels-christina-morillo-1181304.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1539, 800);
		getContentPane().add(lblNewLabel_1);

	}
}

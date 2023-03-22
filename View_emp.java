import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;
import javax.swing.ImageIcon;

public class View_emp extends JFrame  {


	public JTable table;
	public Choice cemployeeId;
	JButton btn_search,btn_print,btn_Update,btn_Back;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_emp window = new View_emp();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View_emp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 
		 	new JFrame();
			setBounds(0, 0, 1539, 800);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			table =new JTable();
			getContentPane().setLayout(null);
			
			JLabel lablsearch = new JLabel("Search By Employee Id");
			lablsearch.setBounds(64, 65, 208, 22);
			lablsearch.setFont(new Font("Arial", Font.BOLD, 18));
			getContentPane().add(lablsearch);

			cemployeeId = new Choice();
			cemployeeId.setBounds(278, 65, 152, 26);
			cemployeeId.setFont(new Font("Arial", Font.BOLD, 18));
			getContentPane().add(cemployeeId);
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
				java.sql.Statement st;
				st = con.createStatement();
				ResultSet rs = st.executeQuery("select *from employeeinformation ");
				
				
				while (rs.next()) 
				{
					cemployeeId.add(rs.getString("empid"));
				}
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
				java.sql.Statement st;
				st = con.createStatement();
				ResultSet rs = st.executeQuery("select *from employeeinformation ");
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			
			JScrollPane jsp = new JScrollPane(table);
			jsp.setBounds(10, 184, 1500, 550);
			getContentPane().add(jsp);

			btn_search = new JButton("Search");
			btn_search.setBounds(43, 144, 106, 21);
			btn_search.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						String q="select *from employeeinformation where empid='"+cemployeeId.getSelectedItem()+"'";
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
						java.sql.Statement st;
						st = con.createStatement();
						ResultSet rs = st.executeQuery(q);
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
					}
					catch (Exception e1)
					{
						System.out.println(e1);
					}	
					
				}
			});
			btn_search.setFont(new Font("Arial", Font.BOLD, 18));
//			btn_search.addActionListener(this);
			getContentPane().add(btn_search);

			btn_print = new JButton("Print");
			btn_print.setBounds(228, 144, 106, 21);
			btn_print.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						table.print();
					}
					catch (Exception e1)
					{
						System.out.println(e1);
					}
				}
			});
			btn_print.setFont(new Font("Arial", Font.BOLD, 18));
//			btn_print.addActionListener(this);
			getContentPane().add(btn_print);

			btn_Update = new JButton("Update");
			btn_Update.setBounds(398, 144, 106, 21);
			btn_Update.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						
						new Employee_Update(cemployeeId.getSelectedItem());
						setVisible(true);
						dispose();
					}
					catch (Exception e1)
					{
						System.out.println(e1);
					}
					
				}
			});
			btn_Update.setFont(new Font("Arial", Font.BOLD, 18));
//			btn_Update.addActionListener(this);
			getContentPane().add(btn_Update);

			btn_Back = new JButton("Back");
			btn_Back.setBounds(575, 144, 106, 21);
			btn_Back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					 Home b=new Home();
					b.setVisible(true);
				}
			});
			btn_Back.setFont(new Font("Arial", Font.BOLD, 18));
//			btn_Back.addActionListener(this);
			getContentPane().add(btn_Back);
			
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Spark\\java\\project\\image\\IMAGE\\pexels-pixabay-260689.jpg"));
			lblNewLabel.setBounds(0, 0, 1524, 763);
			getContentPane().add(lblNewLabel);
			setSize(1400, 800);
			setVisible(true);
			

	}
	

}

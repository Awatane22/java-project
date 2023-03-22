import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

    public class Home {
	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window =new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Home() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0,1539, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("View Employees");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				View_emp p=new View_emp();
				p.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(301, 136, 203, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton Add = new JButton("Add Employee");
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					frame.dispose();
					AddEmployee p=new AddEmployee();
					p.setVisible(true);
			}
	});
		Add.setFont(new Font("Arial", Font.BOLD, 18));
		Add.setBounds(23, 136, 203, 37);
		frame.getContentPane().add(Add);
		
		JButton Remove = new JButton("Remove Employee");
		Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
						frame.dispose();
						RemoveEmp r=new RemoveEmp();
						r.setVisible(true);
			}
		});
		Remove.setFont(new Font("Arial", Font.BOLD, 18));
		Remove.setBounds(33, 239, 203, 37);
		frame.getContentPane().add(Remove);
		
		JButton update = new JButton("Update Employee");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				View_emp p=new View_emp();
				p.setVisible(true);
				
			}
		});
		update.setFont(new Font("Arial", Font.BOLD, 18));
		update.setBounds(301, 239, 203, 37);
		frame.getContentPane().add(update);
		
		JLabel lblNewLabel = new JLabel("Employee Management System");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 55, 536, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Spark\\java\\project\\image\\IMAGE\\chairs-g84e996c80_1920.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1525, 763);
		frame.getContentPane().add(lblNewLabel_1);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
	}
}

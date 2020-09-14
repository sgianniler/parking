
package sgian.parking.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import sgian.parking.dao.ParkingDao;

public class LogInScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPassword;

	public LogInScreen() {
		initPanel();
		createTitle();
		addUserName();
		addPassword();
		lblUserName();
		lblPassword();
		lblLogin();
		btnLogin();
		addImage();

		this.setVisible(true);
	}

	private void initPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 506);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(102, 153, 204));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	}

	private void createTitle() {
		JLabel lblNewLabel = new JLabel("PARKING App");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(10, 11, 187, 30);
		contentPane.add(lblNewLabel);
	}

	private void addUserName() {
		txtName = new JTextField();
		txtName.setToolTipText("username");
		txtName.setBounds(292, 134, 120, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
	}

	private void addPassword() {
		txtPassword = new JTextField();
		txtPassword.setBounds(292, 196, 120, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
	}

	private void lblUserName() {
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBackground(new Color(255, 51, 102));
		lblNewLabel_2.setBounds(194, 137, 88, 14);
		contentPane.add(lblNewLabel_2);
	}

	private void lblPassword() {

		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBackground(new Color(153, 0, 51));
		lblNewLabel_2_1.setBounds(194, 180, 88, 36);
		contentPane.add(lblNewLabel_2_1);

	}

	private void lblLogin() {
		JLabel lblNewLabel_1 = new JLabel("Log in");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(302, 74, 95, 23);
		contentPane.add(lblNewLabel_1);

	}

	private void btnLogin() {

		JButton btnApply = new JButton("Apply");
		btnApply.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ParkingDao connect = new ParkingDao();
				String userName = txtName.getText();
				String password = txtPassword.getText();
				System.out.println(userName);
				connect.connectToDataBase(userName, password);

				// Menu Path
				//Menu loginMenu = new Menu();
				//loginMenu.setVisible(true);
			}

		});
		btnApply.setBounds(311, 254, 86, 23);
		contentPane.add(btnApply);

	}

	private void addImage() {

		ImageIcon imageplateia = new ImageIcon("plateia.jpg");

		JLabel lblImage = new JLabel("");
		lblImage.setBounds(479, 53, 269, 184);
		lblImage.setIcon(imageplateia);
		contentPane.add(lblImage);

	}

}

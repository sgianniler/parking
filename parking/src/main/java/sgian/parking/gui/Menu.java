package sgian.parking.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frame;

	public Menu() {
		initialise();
		creatorLbl();
		btnCashdesk();
		regularCust();
		userManagement();
		entranceExit();
		this.setVisible(true);
	}

	private void initialise() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 153, 204));
		frame.setBounds(100, 100, 808, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

	}

	private void creatorLbl() {
		JLabel lblNewLabel = new JLabel("Made by Sgianniler");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 462, 296, 24);
		lblNewLabel.setForeground(Color.RED);
		frame.getContentPane().add(lblNewLabel);
	}

	private void btnCashdesk() {
		JButton btnT = new JButton("Cash Desk");
		btnT.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnT.setForeground(new Color(0, 0, 0));
		btnT.setBackground(new Color(51, 255, 255));
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnT.setBounds(276, 71, 200, 60);
		frame.getContentPane().add(btnT);

	}

	private void regularCust() {

		JButton btnNewButton_1_1 = new JButton("Regular Customers\r\n");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1_1.setBounds(382, 174, 200, 60);
		frame.getContentPane().add(btnNewButton_1_1);
	}

	private void userManagement() {
		JButton btnNewButton_1_2 = new JButton("User Management");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2.setBackground(new Color(0, 255, 255));
		btnNewButton_1_2.setForeground(Color.DARK_GRAY);
		btnNewButton_1_2.setBounds(159, 174, 200, 60);
		frame.getContentPane().add(btnNewButton_1_2);
	}

	private void entranceExit() {
		JButton btnNewButton_1_2_1 = new JButton("Entrance/Exit");
		btnNewButton_1_2_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2_1.setBackground(Color.CYAN);
		btnNewButton_1_2_1.setBounds(159, 263, 200, 60);
		frame.getContentPane().add(btnNewButton_1_2_1);
	}

}
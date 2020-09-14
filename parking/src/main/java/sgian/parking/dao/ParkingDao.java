package sgian.parking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import sgian.parking.gui.Menu;

public class ParkingDao {
	public ParkingDao() {

	}

	public void connectToDataBase(String userName, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parking", "root",
					"21019932101993");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(
					"SELECT * FROM users WHERE username='" + userName + "'" + "&& password='" + password + "'");

			if (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
				Menu loginMenu = new Menu();
				loginMenu.setVisible(true);
			} else {
				// JOptionPane popup=new JOptionPane();
				JOptionPane.showMessageDialog(null, "Result not Found");

				// System.out.println("No result found");
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package sgian.parking.main;

import java.awt.EventQueue;

import sgian.parking.gui.LogInScreen;

public class Main {
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInScreen window = new LogInScreen();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

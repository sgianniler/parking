package sgian.parking.model;

public class Users {

	String username;
	String email;
	int password;

	public Users(String username, int password) {
		this.username = username;
		this.password = password;

	}

	public String getUsername() {
		return username;
	}

	public void setUesername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

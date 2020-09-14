package sgian.parking.model;

public class Customer {

	private  String plate;
	private String name;
	private String type;

	public Customer(String plate, String type) {
		this.plate = plate;
		this.type = type;
	}

	// Java bin convention (setters-getters)
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {

		this.plate = plate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

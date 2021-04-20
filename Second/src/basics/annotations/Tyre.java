package basics.annotations;

public class Tyre {
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}

	private String brand;
	

}

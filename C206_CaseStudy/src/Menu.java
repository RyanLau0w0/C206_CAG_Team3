
public class Menu {

	public String name;
	public int price;
	public int quantity;
	public String preference_type;
	public String vendorName;
	
	public Menu(String name, int price, int quantity, String preference_type, String vendorName) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.preference_type = preference_type;
		this.vendorName = vendorName;
	}



	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	public int getQuantity() {
		return quantity;
	}





	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}





	public String getPreference_type() {
		return preference_type;
	}





	public void setPreference_type(String preference_type) {
		this.preference_type = preference_type;
	}





	public String getVendorName() {
		return vendorName;
	}





	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}





	@Override
	public String toString() {
		return "Menu [name=" + name + ", preference_type=" + preference_type + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	

}
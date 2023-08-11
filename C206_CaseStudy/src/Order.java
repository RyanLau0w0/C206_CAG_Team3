
public class Order{

	
	public int order_number;
	public String userName;
	public String vendorName;
	public String order_item;
	public int order_quantity;
	public int price;


	public Order(int order_number, String userName, String vendorName, String order_item, int order_quantity, int price) {
		super();
		this.order_number = order_number;
		this.userName = userName;
		this.vendorName = vendorName;
		this.order_item = order_item;
		this.order_quantity = order_quantity;
		this.price = price;
	}

	

	public int getOrder_number() {
		return order_number;
	}



	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getVendorName() {
		return vendorName;
	}



	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}



	public String getOrder_item() {
		return order_item;
	}



	public void setOrder_item(String order_item) {
		this.order_item = order_item;
	}



	public int getOrder_quantity() {
		return order_quantity;
	}



	public void setOrder_quantity(int order_quantity) {
		this.order_quantity = order_quantity;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Order [order_number=" + order_number + ", order_quantity=" + order_quantity + "]";
	}
	
	
	
	
}

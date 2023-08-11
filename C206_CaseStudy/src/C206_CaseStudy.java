import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize ArrayList
		ArrayList<Users> userList = new ArrayList<Users>();
		ArrayList<Vendors> vendorList = new ArrayList<Vendors>();
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		ArrayList<Order> orderList = new ArrayList<Order>();
		ArrayList<Schools> schoolList = new ArrayList<Schools>();
		ArrayList<Payment> paymentList = new ArrayList<Payment>();

		//Add records into ArrayList
		vendorList.add(new Vendors("Remi","RemiPassword"));
		vendorList.add(new Vendors("Rashmin", "RashminPassword"));
		
		userList.add(new Users("Wee Bheng", "WeebhengPassword"));
		userList.add(new Users("Ian", "IanPassword"));
		userList.add(new Users("Ryan", "RyanPassword"));
		
		menuList.add(new Menu("Fried Rice", 4, 20, "Halal", "Remi"));
		menuList.add(new Menu("Nasi-Lemak", 5, 13, "Halal", "Remi"));
		menuList.add(new Menu("Pork rice", 2, 7, "Non-Halal", "Rashmin"));
		
		orderList.add(new Order(1, "Ian", "Remi", "Nasi-Lemak", 2, 10));
		
		schoolList.add(new Schools("Republic Polytechnic"));
		schoolList.add(new Schools("Temasek Polytechnic"));
		schoolList.add(new Schools("Nanyang Polytechnic"));
		
		paymentList.add(new Payment("Debit Card"));
		paymentList.add(new Payment("Credit Card"));
		paymentList.add(new Payment("PayPal"));
		paymentList.add(new Payment("Cash"));
		
		

		//Main Program
		int option = 0;

		while (option != 7) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option: ");

			if (option == 1) {
				
				//If option 1, user is prompted to select whether they want to view all users, delete a user or add a user.
				
				System.out.println("USERS");
				System.out.println("--------------");
				System.out.println("1. Add User");
				System.out.println("2. View all User");
				System.out.println("3. Delete User");
				
				int input = Helper.readInt("Enter option: ");
				
				if (input == 1) {
					Users u = inputUser();
					C206_CaseStudy.addUser(userList , u);
					System.out.println("User added");
				} else if (input == 2) {
					C206_CaseStudy.viewAllUsers(userList);
				} else if (input == 3) {
					C206_CaseStudy.deleteUser(userList);
				} else {
					System.out.println("Invalid option");
				}
				
			} else if (option == 2) {
				
				//If option 2, user is prompted to select whether they want to view all vendors, delete a vendor or add a vendor.
				
				System.out.println("VENDOR");
				System.out.println("--------------");
				System.out.println("1. Add vendor");
				System.out.println("2. View all vendor");
				System.out.println("3. Delete vendor");
				
				int input = Helper.readInt("Enter option: ");
				
				if (input == 1) {
					Vendors v = inputVendor();
					C206_CaseStudy.addVendor(vendorList , v);
					System.out.println("Vendor added");
				} else if (input == 2) {
					C206_CaseStudy.viewAllVendors(vendorList);
				} else if (input == 3) {
					C206_CaseStudy.deleteVendor(vendorList);
				} else {
					System.out.println("Invalid option");
				}

			} else if (option == 3) {
				
				//If option 3, user is prompted to select whether they want to view all schools, delete a schools or add a school.
				
				System.out.println("SCHOOLS");
				System.out.println("--------------");
				System.out.println("1. Add school");
				System.out.println("2. View all school");
				System.out.println("3. Delete school");
				
				int input = Helper.readInt("Enter option: ");
				
				if (input == 1) {
					Schools s = inputSchool();
					C206_CaseStudy.addSchool(schoolList , s);
					System.out.println("School added");
				} else if (input == 2) {
					C206_CaseStudy.viewAllSchools(schoolList);
				} else if (input == 3) {
					C206_CaseStudy.deleteSchools(schoolList);
				} else {
					System.out.println("Invalid option");
				}
				
            } else if (option == 4) {
				
            	//If option 4, user is prompted to select whether they want to view all orders, delete an order or add an order.
            	
            	System.out.println("ORDERS");
				System.out.println("--------------");
				System.out.println("1. Add order");
				System.out.println("2. View all orders");
				System.out.println("3. Delete orders");
				
				int input = Helper.readInt("Enter option: ");
				
				if (input == 1) {
					Order o = inputOrder();
					C206_CaseStudy.addOrder(orderList, o);
					System.out.println("Order added");
				} else if (input == 2) {
					C206_CaseStudy.viewAllOrder(orderList);
				} else if (input == 3) {
					C206_CaseStudy.deleteOrder(orderList);
				} else {
					System.out.println("Invalid option");
				}

			} else if (option == 5) {
				
				//If option 5, user is prompted to select whether they want to view all menu, delete a menu or add a menu.
				
				System.out.println("MENU");
				System.out.println("--------------");
				System.out.println("1. Add menu");
				System.out.println("2. View all menu");
				System.out.println("3. Delete menu");
				
				int input = Helper.readInt("Enter option: ");
				
				if (input == 1) {
					Menu m = inputMenu();
					C206_CaseStudy.addMenu(menuList, m);
					System.out.println("Menu added");
				} else if (input == 2) {
					C206_CaseStudy.viewAllMenu(menuList);
				} else if (input == 3) {
					C206_CaseStudy.deleteMenu(menuList);
				} else {
					System.out.println("Invalid option: ");
				}
				
			} else if (option == 6) {

				//If option 6, user is prompted to select whether they want to view all payment, delete a payment or add a payment.
				
				System.out.println("PAYMENT");
				System.out.println("--------------");
				System.out.println("1. Add payment type");
				System.out.println("2. View all payment types");
				System.out.println("3. Delete payment type");
				
				int input = Helper.readInt("Enter option: ");
				
				if (input == 1) {
					Payment p = inputPayment();
					C206_CaseStudy.addPayment(paymentList, p);
					System.out.println("Payment added");
				} else if (input == 2) {
					C206_CaseStudy.viewAllPayment(paymentList);
				} else if (input == 3) {
					C206_CaseStudy.deletePayment(paymentList);
				} else {
					System.out.println("Invalid option");
				}

			} else if (option == 7) {
				
				System.out.println("Bye!");
				break;
				
			} else {
				
				System.out.println("Invalid option");
				
			}
		}
	}

	//Main Menu
	public static void menu() {
		
		C206_CaseStudy.setHeader("LUNCH BOX APP");
		System.out.println("1. Users");
		System.out.println("2. Vendors");
		System.out.println("3. Schools");
		System.out.println("4. Orders");
		System.out.println("5. Menu Items");
		System.out.println("6. Payment");
		System.out.println("7. Log out");
		Helper.line(80, "-");
		
	}

	//Set Header
	public static void setHeader(String header) {
		
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
		
	}

	//Retrieve and view all user.
	public static String retrieveAllUsers(ArrayList<Users> userList) {
		
		String output = "";

		for (int i = 0; i < userList.size(); i++) {
			output += String.format("%-10s\n", userList.get(i).getUser_name());
		}
		
		return output;
	}

	public static void viewAllUsers(ArrayList<Users> userList) {
		
		C206_CaseStudy.setHeader("USER LIST");
		String output = String.format("%-10s\n", "USER NAMES");
		output += retrieveAllUsers(userList);
		System.out.println(output);
		
	}

	//Delete users
		public static void deleteUser(ArrayList<Users> userList) {
			
			C206_CaseStudy.viewAllUsers(userList);
			
			String username = Helper.readString("Enter username of user account to delete: ");
			
			for (int i = 0; i < userList.size(); i++) {
				if (username.equals(userList.get(i).getUser_name())) {
					userList.remove(i);
				}
			}
			
			System.out.println("User has been deleted");
			
		}
		
    //Add User
	public static Users inputUser() {
		String username = Helper.readString("Enter user's username: ");
		String password = Helper.readString("Enter user's password: ");

		Users u= new Users(username , password);
		return u;
		
	}
	public static void addUser(ArrayList<Users> userList , Users u) {
			Users item;
			for (int i = 0; i < userList.size(); i++) {
				item = userList.get(i);
				if (item.getUser_name().equalsIgnoreCase(u.getUser_name())) {
					System.out.println("Existing user with the same username found");
					return;
				}
			}
			if (u.getUser_name().isEmpty() || u.getPassword().isEmpty()) {
				return;
			}
			userList.add(u);
			
		}
		
	//Retrieve and view all vendors.
	public static String retrieveAllVendors(ArrayList<Vendors> vendorList) {
		
		String output = "";
		
		for (int i = 0; i < vendorList.size(); i++) {
			output += String.format("%-10s\n", vendorList.get(i).getVendor_name());
		}
		
		return output;
		
	}
	
	public static void viewAllVendors(ArrayList<Vendors> vendorList) {

		C206_CaseStudy.setHeader("VENDOR LIST");
		String output = String.format("%-10s\n", "VENDOR NAME");
		output += retrieveAllVendors(vendorList);
		System.out.println(output);
		
	}

	//Delete vendors
	public static void deleteVendor(ArrayList<Vendors> vendorList) {
		
		C206_CaseStudy.viewAllVendors(vendorList);
		
		String username = Helper.readString("Enter username of vendor account to delete");
		
		for (int i = 0; i < vendorList.size(); i++) {
			if (username.equals(vendorList.get(i).getVendor_name())) {
				vendorList.remove(i);
			}
		}
		
		System.out.println("Vendor has been deleted");
		
	}	
	
	
	//Add vendor.
	public static Vendors inputVendor() {
		String username1 = Helper.readString("Enter vendor username");
		String password1 = Helper.readString("Enter vendor password");

		Vendors v= new Vendors(username1 , password1);
		return v;
		
	}
	public static void addVendor(ArrayList<Vendors> vendorList , Vendors v) {
		Vendors item;
		for (int i = 0; i < vendorList.size(); i++) {
			item = vendorList.get(i);
			if (item.getVendor_name().equalsIgnoreCase(v.getVendor_name())) {
				System.out.println("Existing vendor with the same username found");
				return;
			}
		}
		if (v.getVendor_name().isEmpty() || v.getPassword().isEmpty()) {
			return;
		}
		vendorList.add(v);
		
	}
	
	//Retrieve and view all menu.
	public static String retrieveAllMenu(ArrayList<Menu> menuList) {
		
		String output = "";

		for (int i = 0; i < menuList.size(); i++) {
			output += String.format("%-10s %-10d %-10d %-10s %-10s\n", menuList.get(i).getName(), menuList.get(i).getPrice(), menuList.get(i).getQuantity(), menuList.get(i).getPreference_type(), menuList.get(i).getVendorName());
		}
		
		return output;
		
	}
	
	public static void viewAllMenu(ArrayList<Menu> menuList) {
		
		C206_CaseStudy.setHeader("MENU LIST");
		String output = String.format("%-10s %-10s %-10s %-10s %-10s\n", "ITEM NAME", "PRICE", "QUANTITY", "PREFERENCE", "VENDOR");
		output += retrieveAllMenu(menuList);
		System.out.println(output);
		
	}
	
    //Delete menu.
	public static void deleteMenu(ArrayList<Menu> menuList) {
		
		C206_CaseStudy.viewAllMenu(menuList);
		
		String menuItem = Helper.readString("Enter menu item to be deleted: ");
		
		for (int i = 0; i < menuList.size(); i++) {
			if (menuItem.equals(menuList.get(i).getName())) {
				System.out.println("Menu item " + menuList.get(i).getName() + " has been deleted");
				menuList.remove(i);
			}
		}
		

		
	}
	
	//Add menu.
	public static Menu inputMenu() {
		String name = Helper.readString("Enter menu name: ");
		int price = Helper.readInt("Enter menu price: ");
		int qty = Helper.readInt("Enter menu quantity: ");
		String preferenceType = Helper.readString("Enter preference type: ");
		String vendorName = Helper.readString("Enter vendor name: ");

 

		Menu m= new Menu(name , price, qty, preferenceType, vendorName);
		return m;
	}
	
    public static void addMenu (ArrayList<Menu> menuList, Menu m) {

    	Menu item;
    	for (int i = 0; i < menuList.size(); i++) {
			item = menuList.get(i);
			if (item.getName().equalsIgnoreCase(m.getName())) {
				System.out.println("Existing menu with the same name found");
				return;
			}
		}
		if (m.getName().isEmpty()) {
			return;
		}
		menuList.add(m);
	}
	
	//Retrieve and view all payment.
	public static String retrieveAllPayment(ArrayList<Payment> paymentList) {
		
		String output = "";
		
		for (int i = 0; i < paymentList.size(); i++) {
			output += String.format("%-10s\n", paymentList.get(i).getName());
		}
		
		return output;
	}
	

	public static void viewAllPayment(ArrayList<Payment> paymentList) {
		
		C206_CaseStudy.setHeader("Payment LIST");
		String output = String.format("%-10s/n", "PAYMENT TYPE");
		output += retrieveAllPayment(paymentList);
		System.out.println(output);
		
	}
	
	//Delete payment.
	public static void deletePayment(ArrayList<Payment> paymentList) {
		
		C206_CaseStudy.viewAllPayment(paymentList);
		String paymentName = Helper.readString("Enter payment type to be deleted: ");
		
		for (int i = 0; i < paymentList.size(); i++) {
			if (paymentName.equals(paymentList.get(i).getName())) {
				System.out.println("Payment Method " + paymentList.get(i).getName() + " has been deleted");
				paymentList.remove(i);
			}
		}
		
	}
	
	//Add Payment.
	public static Payment inputPayment() {
		String paymentType = Helper.readString("Enter payment method: ");

 

		Payment p= new Payment(paymentType);
		return p;
}

	//Add Payment.
    public static void addPayment(ArrayList<Payment> paymentList, Payment p) {
		Payment item;
		for (int i = 0; i < paymentList.size(); i++) {
			item = paymentList.get(i);
			if (item.getName().equalsIgnoreCase(p.getName())) {
				System.out.println("Existing vendor with the same payment type found");
				return;
			}
		}
		if (p.getName().isEmpty()) {
			return;
		}
		paymentList.add(p);
	}
	
	//Retrieve and view all orders.
	public static String retrieveAllOrder(ArrayList<Order> orderList) {
		
		String output = "";
		
		for (int i = 0; i < orderList.size(); i++) {
			output += String.format("%-10d %-10s %-10s %-10s %-10d %-10d\n", orderList.get(i).getOrder_number(), orderList.get(i).getUserName(), orderList.get(i).getVendorName(), orderList.get(i).getOrder_item(), orderList.get(i).getOrder_quantity(), orderList.get(i).getPrice());
		}
		
		return output;
	}
	
	public static void viewAllOrder(ArrayList<Order> orderList) {
		
		C206_CaseStudy.setHeader("ORDER LIST");
		String output = String.format("%-10s %-10s %-10s %-10s %-10s %-10s\n", "ORDER ID", "ORDER RECEPIENT", "ORDER VENDOR", "ORDER ITEM", "ORDER QUANTITY", "ORDER PRICE");
		output += retrieveAllOrder(orderList);
		System.out.println(output);
		
	}
	
	//Delete Order
	public static void deleteOrder(ArrayList<Order> orderList) {
		
		C206_CaseStudy.viewAllOrder(orderList);
		
		int orderNumber = Helper.readInt("Enter order number to be deleted: ");
		
		for (int i = 0; i < orderList.size(); i++) {
			if (orderNumber == orderList.get(i).getOrder_number()) {
				System.out.println("Order ID number " + orderList.get(i).getOrder_number() + " has been deleted");
				orderList.remove(i);
			}
		}
		
	}
	
	//Add Orders.
	public static Order inputOrder() {
		int orderNumber = Helper.readInt("Enter order number: ");
		String username = Helper.readString("Enter order name: ");
		String vendorName = Helper.readString("Enter vendor name: ");
		String orderItem = Helper.readString("Enter order item: ");
		int orderQty = Helper.readInt("Enter order quantity: ");
		int price = Helper.readInt("Enter order price: ");

 

		Order o= new Order(orderNumber , username, vendorName, orderItem, orderQty, price);
		return o;

 

}

	//Add Orders.
    public static void addOrder (ArrayList<Order> orderList, Order o) {
		Order item;
		for (int i = 0; i < orderList.size(); i++) {
			item = orderList.get(i);
			if (item.getOrder_item().equalsIgnoreCase(o.getOrder_item())) {
				System.out.println("Existing order with the same order item found");
				return;
			}
		}
		if (o.getOrder_item().isEmpty()) {
			return;
		}
		orderList.add(o);
	}
	
	//Retrieve and view all schools.
	public static String retrieveAllSchools(ArrayList<Schools> schoolList) {
		
		String output = "";
		
		for (int i = 0; i < schoolList.size(); i++) {
			output += String.format("%-10s\n", schoolList.get(i).getSchool());
		}
		
		return output;
		
	}
	
	public static void viewAllSchools(ArrayList<Schools> schoolList) {
		
		C206_CaseStudy.setHeader("SCHOOL LIST");
		String output = String.format("%-10s\n", "SCHOOL");
		output += retrieveAllSchools(schoolList);
		System.out.println(output);
		
	}
	
	//Delete schools.
	public static void deleteSchools(ArrayList<Schools> schoolList) {
		
		C206_CaseStudy.viewAllSchools(schoolList);
		String schoolName = Helper.readString("Enter name of school to be deleted: ");
		
		for (int i = 0; i < schoolList.size(); i++) {
			if (schoolName.equalsIgnoreCase(schoolList.get(i).getSchool())) {
				System.out.println("School " + schoolList.get(i).getSchool() + " has been deleted");
				schoolList.remove(i);
			}
		}
		
	}
	
	//Add Schools.
	public static Schools inputSchool() {
		
		String schoolName = Helper.readString("Enter name of school to add: ");

		Schools s= new Schools(schoolName);
		return s;
		
	}
	    public static void addSchool(ArrayList<Schools> schoolList , Schools s) {
			Schools item;
			    for (int i = 0; i < schoolList.size(); i++) {
		    	item = schoolList.get(i);	
	  			if (item.getSchool().equalsIgnoreCase(s.getSchool())) {
	  				System.out.println("Existing school with the same name found");
	  				return;
	  				
	  			}
	  		}
			if (s.getSchool().isEmpty()) {
				return;
			}
			schoolList.add(s);
		}
	    
	    
    
}

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	private Users u1;
	private Users u2;
	private Vendors v1;
	private Vendors v2;
	private Schools s1;
	private Schools s2;
	private Order o1;
	private Order o2;
	private Menu m1;
	private Menu m2;
	private Payment p1;
	private Payment p2;
	
	private ArrayList<Users> userList;
	private ArrayList<Vendors> vendorList;
	private ArrayList<Schools> schoolList;
	private ArrayList<Order> orderList;
	private ArrayList<Menu> menuList;
	private ArrayList<Payment> paymentList;
	
	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		u1 = new Users("Bruh", "BruhPassword");
		u2 = new Users("Remy", "RemyPassword");
		v1 = new Vendors("Gmod","GmodPassword");
		v2 = new Vendors("Tonya","TonyaPassword");
		s1 = new Schools("Chua Chu Kang Primary School");
		s2 = new Schools("School of Infocomm");
		o1 = new Order(1, "Ryan", "Rashmin", "Chicken Rice", 5, 6);
		o2 = new Order(1, "James", "Charles", "Wonton Noodles", 7, 11);
		m1 = new Menu("Hok Mee", 6, 50, "non - Halal", "Ryan");
		m2 = new Menu("Smokey BBQ Pork", 9, 25, "Halal", "Rashmin");
		p1 = new Payment("DBS");
		p2 = new Payment("Paylah");
		
		userList = new ArrayList<Users>();
		vendorList = new ArrayList<Vendors>();
		schoolList = new ArrayList<Schools>();
		orderList = new ArrayList<Order>(); 
		menuList = new ArrayList<Menu>();
		paymentList = new ArrayList<Payment>();
		
	}
	
	//========================================TEST ADD CODE============================================================================
	@Test
	public void testAddUser() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid user arraylist to add to", userList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addUser(userList , u1);
		assertEquals("Check that User arraylist size is 1", 1, userList.size());
		assertSame("Check that User is added", u1 , userList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addUser(userList, u2);
		assertEquals("Check that User arraylist size is 2", 2, userList.size());
		assertSame("Check that User is added", u2, userList.get(1));
	}
	
	@Test
	public void testAddVendors() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid vendor arraylist to add to", vendorList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addVendor(vendorList , v1);
		assertEquals("Check that Vendor arraylist size is 1", 1, vendorList.size());
		assertSame("Check that Vendor is added", v1 , vendorList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addVendor(vendorList, v2);
		assertEquals("Check that Vendor arraylist size is 2", 2, vendorList.size());
		assertSame("Check that Vendor is added", v2, vendorList.get(1));
	}
	
	@Test
	public void testAddSchools() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid school arraylist to add to", schoolList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addSchool(schoolList , s1);
		assertEquals("Check that School arraylist size is 1", 1, schoolList.size());
		assertSame("Check that School is added", s1 , schoolList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addSchool(schoolList, s2);
		assertEquals("Check that School arraylist size is 2", 2, schoolList.size());
		assertSame("Check that School is added", s2, schoolList.get(1));
	}
	
	@Test
	public void testAddOrder() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid order arraylist to add to", orderList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addOrder(orderList , o1);
		assertEquals("Check that Order arraylist size is 1", 1, orderList.size());
		assertSame("Check that Order is added", o1 , orderList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addOrder(orderList, o2);
		assertEquals("Check that Order arraylist size is 2", 2, orderList.size());
		assertSame("Check that Order is added", o2, orderList.get(1));
	}
	
	@Test
	public void testAddMenu() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid menu arraylist to add to", menuList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addMenu(menuList , m1);
		assertEquals("Check that Menu arraylist size is 1", 1, menuList.size());
		assertSame("Check that Menu is added", m1 , menuList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addMenu(menuList , m2);
		assertEquals("Check that Menu arraylist size is 2", 2, menuList.size());
		assertSame("Check that Menu is added", m2, menuList.get(1));
	}
	
	@Test
	public void testAddPayment() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid payment arraylist to add to", paymentList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addPayment(paymentList , p1);
		assertEquals("Check that Payment arraylist size is 1", 1, paymentList.size());
		assertSame("Check that Payment is added", p1 , paymentList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addPayment(paymentList, p2);
		assertEquals("Check that Payment arraylist size is 2", 2, paymentList.size());
		assertSame("Check that Payment is added", p2, paymentList.get(1));
	}
	//=============================================================================================================================
	
	
	
	//===================================RETRIEVE TEST=============================================================================
	@Test
	public void testRetrieveAllUsers() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid user arraylist to retrieve item", userList);
		
		//test if the list of User retrieved from the SourceCentre is empty - boundary
		String allUsers = C206_CaseStudy.retrieveAllUsers(userList);
		String testOutput = "";
		assertEquals("Check that ViewAlluserlist", testOutput, allUsers );
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addUser(userList, u1);
		C206_CaseStudy.addUser(userList, u2);
		assertEquals("Test that User arraylist size is 2", 2, userList.size());
		
	}
	
	@Test
	public void testRetrieveAllVendors() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Camcorder arraylist to retrieve item", vendorList);
		
		//test if the list of User retrieved from the SourceCentre is empty - boundary
		String allUsers = C206_CaseStudy.retrieveAllVendors(vendorList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allUsers );
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addVendor(vendorList, v1);
		C206_CaseStudy.addVendor(vendorList, v2);
		assertEquals("Test that Camcorder arraylist size is 2", 2, vendorList.size());
		
	}
	
	@Test
	public void testRetrieveAllSchools() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Camcorder arraylist to retrieve item", schoolList);
		
		//test if the list of User retrieved from the SourceCentre is empty - boundary
		String allUsers = C206_CaseStudy.retrieveAllSchools(schoolList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allUsers );
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addSchool(schoolList, s1);
		C206_CaseStudy.addSchool(schoolList, s2);
		assertEquals("Test that Camcorder arraylist size is 2", 2, schoolList.size());
		
	}
	
	@Test
	public void testRetrieveAllOrder() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Camcorder arraylist to retrieve item", orderList);
		
		//test if the list of User retrieved from the SourceCentre is empty - boundary
		String allUsers = C206_CaseStudy.retrieveAllOrder(orderList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allUsers );
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addOrder(orderList, o1);
		C206_CaseStudy.addOrder(orderList, o2);
		assertEquals("Test that Camcorder arraylist size is 2", 2, orderList.size());
		
	}
	
	@Test
	public void testRetrieveAllMenu() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Camcorder arraylist to retrieve item", menuList);
		
		//test if the list of User retrieved from the SourceCentre is empty - boundary
		String allUsers = C206_CaseStudy.retrieveAllMenu(menuList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allUsers );
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addMenu(menuList, m1);
		C206_CaseStudy.addMenu(menuList, m2);
		assertEquals("Test that Camcorder arraylist size is 2", 2, menuList.size());
		
	}
	
	@Test
	public void testRetrieveAllPayment() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Camcorder arraylist to retrieve item", paymentList);
		
		//test if the list of User retrieved from the SourceCentre is empty - boundary
		String allUsers = C206_CaseStudy.retrieveAllPayment(paymentList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allUsers );
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addPayment(paymentList, p1);
		C206_CaseStudy.addPayment(paymentList, p2);
		assertEquals("Test that Camcorder arraylist size is 2", 2, paymentList.size());
		
	}
	
	
	//=================================================================================================================================
	
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}

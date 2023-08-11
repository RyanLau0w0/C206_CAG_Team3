
public class Vendors extends Password{
	
	public String vendor_name;

	public Vendors(String vendor_name, String password) {
		super(password);
		this.vendor_name = vendor_name;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	@Override
	public String toString() {
		return "Vendors [vendor_name=" + vendor_name + "]";
	}

	
	
}

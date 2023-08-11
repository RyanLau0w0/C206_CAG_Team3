public class Users extends Password{
	
	public String user_name;

	public Users(String user_name, String password) {
		super(password);
		this.user_name = user_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	@Override
	public String toString() {
		return "Users [user_name=" + user_name + "]";
	}
}

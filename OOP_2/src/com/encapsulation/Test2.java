package com.encapsulation;

class AdminCredential{
	// final keyword - When it is assigned we can't change the values
	private final String userName = "admin";
	private final String userPass = "admin";
	
	public String getUserName() {
		return userName;
	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
	
	public String getUserPass() {
		return userPass;
	}
//	public void setUserPass(String userPass) {
//		this.userPass = userPass;
//	}
}

public class Test2 {

	public static void main(String[] args) {
		AdminCredential admin = new AdminCredential();
		System.out.println(admin.getUserName());
//		admin.setUserName("admin123");
		System.out.println(admin.getUserPass());

	}

}

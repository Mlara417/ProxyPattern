package proxyPattern;

public class RealUserData implements UserData {
	
	private String userName;
	private String passWord;
	
	public RealUserData(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
		
		secureData(userName, passWord);
	}
	
	private void secureData(String userName, String passWord) {
		System.out.println("Securing " + userName + "\'s" + " account.");
	}
	
	public void displayMessage() {
		System.out.println("Account secured!");
	}

}

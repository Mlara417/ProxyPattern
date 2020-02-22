package proxyPattern;

public class ProxyUserData implements UserData {
	private RealUserData realUserData;
	private String userName;
	private String passWord;
	
	public ProxyUserData(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public void displayMessage() {
		if(realUserData == null) {
			realUserData = new RealUserData(userName,passWord);
		}
		realUserData.displayMessage();
	}

}

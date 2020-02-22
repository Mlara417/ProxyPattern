package proxyPattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserData userData = new ProxyUserData("Moses", "1234awesome");
		
		userData.displayMessage();
		System.out.println();
		
		userData.displayMessage();
	}

}

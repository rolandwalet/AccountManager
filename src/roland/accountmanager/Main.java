package roland.accountmanager;

public class Main {

	public static void main(String[] args) {
		
		Service service = new Service();
		
		service.addAccount("Roland", "Walet", 1001);
		
		System.out.println("First Name:");
		System.out.println(service.getAccount(1001).getFirstName());
		System.out.println("Last Name:");
		System.out.println(service.getAccount(1001).getLastName());
		System.out.println("Account Number:");
		System.out.println(service.getAccount(1001).getAccountNumber());
		
		service.removeAccount(1001);
		try {System.out.println("First Name:");
		System.out.println(service.getAccount(1001).getFirstName());
		} catch (NullPointerException e) {
			System.out.println("No account at current key");
		}
	}

}

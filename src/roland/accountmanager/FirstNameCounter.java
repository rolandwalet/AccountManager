package roland.accountmanager;

import java.util.Map;

public class FirstNameCounter {

	public int count(String firstName) {
		int count = 0;
		for (Map.Entry<Integer, Account> entry :AccountService.getAccounts().entrySet()) {
			if (entry.getValue().getFirstName().equals(firstName)) {
				count ++;
			}
			
		}
		
		return count;
		
	}

}

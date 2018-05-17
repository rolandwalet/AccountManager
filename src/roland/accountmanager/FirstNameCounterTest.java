package roland.accountmanager;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNameCounterTest {

	@Test
	public void test() {
		AccountService service = new AccountService();
		FirstNameCounter testCounter = new FirstNameCounter();
		assertEquals(0, testCounter.count("Roland"));
		service.addAccount("Roland", "Walet", 1);
		assertEquals(1, testCounter.count("Roland"));
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddStrings {

	@Test
	void test() {
		JUnitTesting j=new JUnitTesting();
		String res=j.addStrings("se", "lab");
		assertEquals("selab",res);
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestTest {

	@Test
	void testCalculateSimpleInterest() {
		//fail("Not yet implemented");
		Interest interestObject = new Interest();
		assertEquals(1937.50,interestObject.calculateSimpleInterest(10000.00, 3.875, 5));
	}

	@Test
	void testCalculateCompoundInterest() {
		//fail("Not yet implemented");
		Interest interestObject = new Interest();
		assertEquals(9096.98367016145,interestObject.calculateCompoundInterest(5000.00, 0.05, 12,10));
	}

}

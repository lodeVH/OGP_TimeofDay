
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeofDayTest {

	@Test
	void test() {
		TimeofDay tijd1 = new TimeofDay(14,30);
		assert tijd1.getUur()==14;
		assert tijd1.getMinuten()==30;
	}

}

package date;

import org.junit.Test;

/**
 * Created by son on 2019-06-14.
 */
public class DaysTest {
	private Days days = new Days();

	@Test
	public void lastWeek() {
		System.out.println(String.format("지난 주: %s", days.lastWeek()));
	}

	@Test
	public void lastMonth() {
		System.out.println(String.format("지난 달: %s", days.lastMonth()));
	}

	@Test
	public void lastYear() {
		System.out.println(String.format("지난 해: %s", days.lastYear()));
	}
}

package date;

import org.junit.Test;

/**
 * Created by son on 2019-06-14.
 */
public class DaysTest {
	private Days days = new Days();

	@Test
	public void lastWeek() {
		System.out.println(days.lastWeek());
	}

	@Test
	public void lastMonth() {
		System.out.println(days.lastMonth());
	}
}

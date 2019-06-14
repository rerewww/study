package date;

import org.junit.Test;

/**
 * Created by son on 2019-06-14.
 */
public class DateCalculatorTest {
	private DateCalculator dateCalculator = new DateCalculator();

	@Test
	public void lastWeek() {
		System.out.println(String.format("지난 주: %s", dateCalculator.lastWeek()));
	}

	@Test
	public void lastMonth() {
		System.out.println(String.format("지난 달: %s", dateCalculator.lastMonth()));
	}

	@Test
	public void lastYear() {
		System.out.println(String.format("지난 해: %s", dateCalculator.lastYear()));
	}

	@Test
	public void thisWeek() {
		System.out.println(String.format("이번 주: %s", dateCalculator.thisWeek()));
	}

	@Test
	public void thisMonth() {
		System.out.println(String.format("이번 달: %s", dateCalculator.thisMonth()));
	}

	@Test
	public void thisYear() {
		System.out.println(String.format("올해: %s", dateCalculator.thisYear()));
	}
}

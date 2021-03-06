package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by son on 2019-06-14.
 */
public class DateCalculator {
	// 월요일 기준으로 화,수,목,금,토,일
	private static final int WEEK_DAYS = 6;
	private static final String DATE_STRING_FORMAT = "%s %s";
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	/**
	 * 지난 주
	 * @return
	 */
	public String lastWeek() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		// DAY_OF_WEEK: 현재 요일에서 1~7 값(일,월,화,수,목,금,토)을 리턴한다.
		// getFirstDayOfWeek: 이번 주의 요일을 반환한다. 1~7 값(일,월,화,수,목,금,토)
		int today = calendar.get(Calendar.DAY_OF_WEEK) - calendar.getFirstDayOfWeek();
		int firstDayOflastWeek = -(today + WEEK_DAYS);

		calendar.add(Calendar.DATE, firstDayOflastWeek);
		String first = dateFormat.format(calendar.getTime());

		calendar.add(Calendar.DATE, WEEK_DAYS);
		String last = dateFormat.format(calendar.getTime());

		return String.format(DATE_STRING_FORMAT, first, last);
	}

	/**
	 * 지난 달
	 */
	public String lastMonth() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		// MONTH: 1월~12월까지 중 이번 달을 반환한다. (0~11)
		int index = calendar.get(Calendar.MONTH) == 0 ? 0 : - 1;

		calendar.add(Calendar.MONTH, index);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		String first = dateFormat.format(calendar.getTime());

		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		String last = dateFormat.format(calendar.getTime());
		return String.format(DATE_STRING_FORMAT, first, last);
	}

	/**
	 * 지난 해
	 */
	public String lastYear() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		int index = calendar.get(Calendar.YEAR) - 1;

		calendar.set(Calendar.YEAR, index);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		String first = dateFormat.format(calendar.getTime());

		calendar.set(Calendar.YEAR, index);
		calendar.set(Calendar.MONTH, 11);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		String last = dateFormat.format(calendar.getTime());
		return String.format(DATE_STRING_FORMAT, first, last);
	}

	/**
	 * 이번 주
	 */
	public String thisWeek() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		// DAY_OF_WEEK: 이번 주의 요일을 셋팅한다.
		int thisDay = calendar.get(Calendar.DAY_OF_WEEK);

		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		String first = dateFormat.format(calendar.getTime());

		calendar.set(Calendar.DAY_OF_WEEK, thisDay);
		String last = dateFormat.format(calendar.getTime());

		return String.format(DATE_STRING_FORMAT, first, last);
	}

	/**
	 * 이번 달
	 */
	public String thisMonth() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		int thisDate = calendar.get(Calendar.DATE);

		calendar.set(Calendar.DATE, 1);
		String first = dateFormat.format(calendar.getTime());
		calendar.set(Calendar.DATE, thisDate);
		String last = dateFormat.format(calendar.getTime());

		return String.format(DATE_STRING_FORMAT, first, last);
	}

	/**
	 * 올해
	 */
	public String thisYear() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		int thisMonth = calendar.get(Calendar.MONTH);
		int thisDate = calendar.get(Calendar.DATE);

		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DATE, 1);
		String first = dateFormat.format(calendar.getTime());

		calendar.set(Calendar.MONTH, thisMonth);
		calendar.set(Calendar.DATE, thisDate);
		String last = dateFormat.format(calendar.getTime());

		return String.format(DATE_STRING_FORMAT, first, last);
	}
}

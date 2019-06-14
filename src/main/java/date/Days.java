package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by son on 2019-06-14.
 */
public class Days {
	// 월요일 기준으로 화,수,목,금,토,일
	private static final int WEEK_DAYS = 6;

	/**
	 * 지난 주
	 * @return
	 */
	public String lastWeek() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		calendar.setTime(date);
		// DAY_OF_WEEK: 현재 요일에서 1~7 값(일,월,화,수,목,금,토)을 리턴한다.
		// getFirstDayOfWeek: 이번 주의 요일을 반환한다. 1~7 값(일,월,화,수,목,금,토)
		int today = calendar.get(Calendar.DAY_OF_WEEK) - calendar.getFirstDayOfWeek();
		int firstDayOflastWeek = -(today + WEEK_DAYS);

		calendar.add(Calendar.DATE, firstDayOflastWeek);
		String first = dateFormat.format(calendar.getTime());

		calendar.add(Calendar.DATE, WEEK_DAYS);
		String last = dateFormat.format(calendar.getTime());

		return String.format("%s %s", first, last);
	}
}

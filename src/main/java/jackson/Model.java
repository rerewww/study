package jackson;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * Created by son on 2019-01-24.
 */
@NoArgsConstructor
public class Model {
	@Getter
	private String code;
	@Getter
	private String message;
	@Getter
	private SubMapModel resultMap;
	@Getter
	private List<SubListModel> resultList;

	private static class SubMapModel {
		@Getter
		List<Map<String, String>> value;
	}

	private static class SubListModel {
		@Getter
		String name;
	}
}

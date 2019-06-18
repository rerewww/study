package file;

import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

/**
 * Created by son on 2019-06-14.
 */
public class FileUtilsTest {
	private static final String TEST_FILE_NAME = "test.docx";

	@Test
	public void getFileName() {
		System.out.println(FilenameUtils.getBaseName(TEST_FILE_NAME));
	}

	@Test
	public void getFileExtension() {
		System.out.println(FilenameUtils.getExtension(TEST_FILE_NAME));
	}
}

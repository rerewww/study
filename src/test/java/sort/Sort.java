package sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by son on 2019-07-10.
 */
public class Sort {

	@Test
	public void bubbleSort() {
		int[] arr = {7, 3, 1, 9, 30, 2, 6, 8, 4, 11};
		int temp ;
		int length = arr.length;

		for (int i = 0; i < length; i++) {
			for (int j = 1; j < length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}

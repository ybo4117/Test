package sec06.ch05;

import java.util.Arrays;

public class MethodMisson9 {

	public static String toString(int[] arr) {
		String str = "";		
		// 형변환 String str = Integer.toString(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			if (i != 0) {
				str += ", ";
			}
			str += arr[i];
			
			
//			if (i == 0) {
//				str += "[" + arr[i] + ", ";
//				continue;
//			} else if (i == arr.length - 1) {
//				str += arr[i] + "]";
//			} else {
//				str += arr[i] + ", ";
//			}
//			return str;
		}

		return String.format("[%s]", str);
	}

	public static void main(String[] args) {
		int[] arr = { 4, 8, 10, 11, 45, 66, 77 };

//		System.out.println(Arrays.toString(arr));
		String result = toString(arr);
		System.out.println(toString(arr));

	}

}
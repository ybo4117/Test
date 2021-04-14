package sec06.ch07;

public class MyArrayList implements MyList {
	private int[] arr; // 기본적으로 = null값이 들어간다.

	public MyArrayList() {
		arr = new int[0];
	}

	@Override
	public void add(int value) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = value;
		arr = temp;
	}

	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public int get(int index) {
		return arr[index];
	}

	@Override
	public int remove() {		
		int[] temp = new int[arr.length - 1];
		
		for(int i = 0 ; i < temp.length ; i++) {
			temp[i] = arr[i];
		}
		int lastVal = arr[temp.length];
		arr = temp;

		return lastVal;
	}

}

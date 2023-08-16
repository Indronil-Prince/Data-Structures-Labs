public class BinarySearch {
	private static int search(int[] arr, int start, int end, int e) {
		if (end < start) return -1;
		else{
			int mid = (start + end)/2;
			if (arr[mid] == e) {
				return mid;
			} else if (e < arr[mid]) {
				return search(arr, start, mid-1, e);
			} else {
				return search(arr, mid+1, end, e);
			}
		}
	}
	
	public static int binarySearch(int[] arr, int e) {
		int result = search(arr, 0, arr.length-1, e);
		return result;
	}
}
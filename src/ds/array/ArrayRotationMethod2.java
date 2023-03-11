package ds.array;

public class ArrayRotationMethod2 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		rotate(arr, 5, 2);
		printArray(arr);

	}

	public static void rotate(int arr[], int n, int d) {
		int arr2[] = new int[d];
		int a = 0;
		/*
		 * for (int i = 0; i < d; i++) {
		 *  arr2[i] = arr[i];
		 *   }
		 * for (int i = d; i < n; i++)
		 * {
		 *  arr[i - d] = arr[i]; 
		 *  }
		 */
		for (int i = 0; i < n; i++) {
			if (i < d)
				arr2[i] = arr[i];
			if (i >= d)
				arr[i - d] = arr[i];
		}
		for (int i = n - d; i < n; i++) {
			arr[i] = arr2[a];
			a++;
		}
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

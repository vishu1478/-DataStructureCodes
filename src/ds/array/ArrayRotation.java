//Program to rotate n size array by d

package ds.array;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		rotate(arr, 5, 2);
		printArray(arr);
	}

	public static void rotate(int arr[], int n, int d) {
		for (int i = 0; i < d; i++) {
			int temp = arr[0];
			for (int j = 1; j <=n-1; j++) {
				arr[j - 1] = arr[j];
			}
			arr[n - 1] = temp;
		}
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

package ds.array;

public class ArrayRotationMethod3 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		rotate(arr, 5, 2);
		printArray(arr);

	}

	public static void rotate(int arr[], int n, int d) {
		int temp;
		int temp2 = 0;
		for (int i = 0; i < n; i++) {
			if (i < d / 2) {
				temp = arr[i];
				arr[i] = arr[d - i - 1];
				arr[d - i - 1]=temp;
			}
			/*if (i >= d / 2 && i < d)
				continue;*/
		//	i=i+d/2;
			else {
				temp = arr[i];
				arr[i] = arr[n - temp2 - 1];
				arr[n - temp2 - 1] = temp;
			}
		}
		for (int i = 0; i < n / 2; i++) {
			temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}

	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

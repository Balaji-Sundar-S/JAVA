import java.util.Scanner;
import java.util.Arrays;
public class Searching_sorting {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ch, n, i;
		
		System.out.println("enter number of elements of array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements of array : ");
		for (i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		while(true) {
			System.out.println("\n1. linear search\n2. binary search\n3. selection sort\n4. insertion sort\n5. exit\nenter your choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
				case 1:
					Searching_sorting o = new Searching_sorting();
					int a = o.Linear_search(arr, n);
					if (a == -1) {
						System.out.println("element not found!");
					}
					else {
						System.out.println("element found at position " +(a+1));
					}
					break;
				case 2:
					Searching_sorting p = new Searching_sorting();
					p.binary_search(arr, n);
					break;
				case 3:
					Searching_sorting q = new Searching_sorting();
					q.selection_sort(arr, n);
					break;
				case 4:
					Searching_sorting r = new Searching_sorting();
					r.insertion_sort(arr, n);
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("enter correct choice...");
			}
		}
	}
	public int Linear_search(int arr[], int n) {
		Scanner sc = new Scanner(System.in);
		int key, i, fg = -1;
		System.out.println("enter searching element : ");
		key = sc.nextInt();
		for (i=0; i<n; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return fg;
	}
	public void binary_search(int arr[], int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter searching element : ");
		int a = sc.nextInt();
		Arrays.sort(arr);
		int low = 0, high = n-1, m = 0;
		while (low <= high) {
			int mid = low + (high - low)/2;
			if (arr[mid] < a) {
				low = mid + 1;
			}
			else if (arr[mid] > a) {
				high = mid - 1;
			}
			else if (arr[mid] == a){
				 m = mid;
				 break;
			}
		}
		System.out.println("element found at position " +(m+1));
	}
	public void selection_sort(int arr[], int n) {
		int i, j, min, temp;
		for (i=0; i < n-1; i++) {
			min = i;
			for (j=i+1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		for (i=0; i < n; i++) {
			System.out.print(+arr[i]+ " ");
		}
	}
	public void insertion_sort(int arr[], int n) {
		int i, j, key = 0, temp;
		for (i = key+1; i<n; i++) {
			for (j = i-1; j>0; j--) {
				if (arr[j+1]<arr[j]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (i=0; i < n; i++) {
			System.out.print(+arr[i]+ " ");
		}
	}
}

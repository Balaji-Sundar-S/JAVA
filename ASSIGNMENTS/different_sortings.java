import java.util.Scanner;
import java.util.Arrays;
public class Sortings {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int ch, n, i, j = 0;
		System.out.println("enter size of array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array elements : ");
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		while(true) {
			System.out.println ("MENU CARD:-\n1. selection sort\n2. bubble sort\n"
					+ "3. insertion sort\n4. merge sort\n5. quick sort\n6. heap sort\n"
					+ "7. counting sort\n8. comb sort\n9. stooge sort\n10. shell sort\n11. exit\n"
					+ "Enter your choice : ");
			ch = sc.nextInt();
			switch (ch) {
				case 1 :
					Sortings obj1 = new Sortings();
					obj1.selection(arr, n, i, j);
					break;
				case 2 :
					Sortings obj2 = new Sortings();
					obj2.bubble(arr, n, i, j);
					break;
				case 3 :
					Sortings obj3 = new Sortings();
					obj3.insert(arr, n, i, j);
					break;
				case 4 :
					Sortings obj4 = new Sortings();
					obj4.ms(arr, 0, n-1);
					obj4.printmerge(arr, n);
					break;
				case 5 :
					Sortings obj5 = new Sortings();
					obj5.quick(arr, 0, n-1);
					obj5.printquick(arr, n);
					break;
				case 6 :
					Sortings obj6 = new Sortings();
					obj6.heap(arr, n);
					obj6.printheap(arr, n);
					break;
				case 7 :
					Sortings obj7 = new Sortings();
					obj7.count(arr, n);
					obj7.printcount(arr, n);
					break;
				case 8 :
					Sortings obj8 = new Sortings();
					obj8.comb(arr, n);
					obj8.printcomb(arr, n);
					break;
				case 9 :
					Sortings obj9 = new Sortings();
					obj9.stooge(arr, 0, n-1);
					obj9.printstooge(arr, n);
					break;
				case 10 :
					Sortings obj10 = new Sortings();
					obj10.shell(arr, n);
					obj10.printshell(arr, n);
					break;
				case 11 :
					System.exit(0);
				default :
					System.out.println("enter correct choice...");
					System.out.println();
			}
		}
	}
	public void selection(int arr[], int n, int i, int j) {
		int temp, min;
		for (i=0; i<n-1; i++) {
			min = i;
			for (j=i+1; j<n; j++) {
				if (arr[j]<arr[min]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println("list after sorting : ");
		for (i=0; i<n-1; i++) {
			System.out.print(arr[i]+ ", ");
		}
		System.out.print(arr[i]);
		System.out.println("\n");
	}
	public void bubble(int arr[], int n, int i, int j) {
		int temp;
		for (i = 0; i<n; i++) {
			for (j = 0; j<n-1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("list after sorting : ");
		for (i=0; i<n-1; i++) {
			System.out.print(arr[i]+ ", ");
		}
		System.out.print(arr[i]);
		System.out.println("\n");
	}
	public void insert(int arr[], int n, int i, int j) {
		int key, temp;
		for (i = 0; i<n-1; i++) {
			key = i + 1;
			for (j = key; j>0; j--) {
				if (arr[j] < arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		System.out.println("list after sorting : ");
		for (i=0; i<n-1; i++) {
			System.out.print(arr[i]+ ", ");
		}
		System.out.print(arr[i]);
		System.out.println("\n");
	}
	public void ms(int arr[], int lb, int ub) {
		int n = arr.length;
		if (lb < ub) {
			int mid = (lb + ub)/2;
			ms(arr, lb, mid);
			ms(arr, mid+1, ub);
			mergesort(arr, lb, mid, ub, n);
		}
	}
	public void mergesort(int arr[], int lb, int mid, int ub, int n) {
		int n1 = mid - lb + 1, n2 = ub - mid, i, j, k;
		int la[] = new int[n1], ra[] = new int[n2];
		for (i=0; i<n1; i++) {
			la[i] = arr[lb + i];
		}
		for (j=0; j<n2; j++) {
			ra[j] = arr[mid + 1 + j];
		}
		i=0; j=0; k=lb;
		while (i<n1 && j<n2) {
			if (la[i] <= ra[j]) {
				arr[k] = la[i];
				i++;
			} else {
				arr[k] = ra[j];
				j++;
			}
			k++;
		}
		while (i<n1) {
			arr[k] = la[i];
			i++; k++;
		}
		while (j<n2) {
			arr[k] = ra[j];
			j++; k++;
		}
	}
	public void printmerge(int arr[], int n) {
		int i;
		System.out.println("list after sorting : ");
		for (i=0; i<n-1; i++) {
			System.out.print(arr[i]+ ", ");
		}
		System.out.print(arr[i]);
		System.out.println("\n");
	}
	public void quick(int arr[], int lb, int ub) {
		if (lb < ub) {
			int a = part(arr, lb, ub);
			quick(arr, lb, a-1);
			quick(arr, a+1, ub);
		}
	}
	public int part(int arr[], int lb, int ub) {
		int piv = arr[ub], i = lb - 1, j, temp;
		for (j = lb; j <= ub-1; j++) {
			if (arr[j] < piv) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i+1];
		arr[i+1] = arr[ub];
		arr[ub] = temp;
		return (i+1);
	}
	public void printquick(int arr[], int n) {
		int i;
		System.out.println("list after sorting : ");
		for (i=0; i<n-1; i++) {
			System.out.print(arr[i]+ ", ");
		}
		System.out.print(arr[i]);
		System.out.println("\n");
	}
	public void heap(int arr[], int n) {
		int i, temp;
		for (i=(n/2)-1; i>=0; i--) {
			heapify(arr, n, i);
		}
		for (i = n-1; i>=0; i--) {
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}
	public void heapify(int arr[], int n, int i) {
		int max = i, temp;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left < n && arr[left] > arr[max]) {
			max = left;
		}
		if (right < n && arr[right] > arr[max]) {
			max = right;
		}
		if (max != i) {
			temp = 	arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			heapify(arr, n, max);
		}
	}
	public void printheap(int arr[], int n) {
		int i;
		System.out.println("list after sorting : ");
		for (i=0; i<n-1; i++) {
			System.out.print(arr[i]+ ", ");
		}
		System.out.print(arr[i]);
		System.out.println("\n");
	}
	public void count(int arr[], int n) {
		int temparr[] = new int[n+1], max = Arrays.stream(arr).max().getAsInt(),
				count[] = new int[max+1], i;
		for (i = 0; i<=max; ++i) {
			count[i] = 0;
		}
		for (i = 0; i<n; i++) {
			count[arr[i]]++;
		}
		for (i=1; i<=max; i++) {
			count[i] += count[i-1]; 
		}
		for (i=n-1; i>=0; i--) {
			temparr[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		for (i=0; i<n; i++) {
			arr[i] = temparr[i];
		}	
	}
	public void printcount(int arr[], int n) {
		int i;
		System.out.println("list after sorting : ");
		for (i=0; i<n-1; i++) {
			System.out.print(arr[i]+ ", ");
		}
		System.out.print(arr[i]);
		System.out.println("\n");
	}
	public void comb(int arr[], int n) {
		int gap = n, swap = 1, i, temp;
		while (gap != 1 || swap == 1) {
			gap = updatedgap(gap);
			swap = 0;
			for (i=0; i<(n-gap); i++) {
				if (arr[i] > arr[i+gap]) {
					temp = arr[i];
					arr[i] = arr[i+gap];
					arr[i+gap] = temp;
					swap = 1;
				}
			}
		}
	}
	public int updatedgap(int gap) {
		gap = (int)(gap/1.3);
		if (gap<1) {
			return 1;
		}
		return gap;
	}
	public void printcomb(int arr[], int n) {
		int i;
		System.out.println("list after sorting : ");
		for (i=0; i<n-1; i++) {
			System.out.print(arr[i]+ ", ");
		}
		System.out.print(arr[i]);
		System.out.println("\n");
	}
	public void stooge(int arr[], int i, int j) {
		int temp, k;
		if (arr[i] > arr[j]) {
			temp = arr[i];
			arr[i] = arr[j]; 
			arr[j] = temp;
		}
		if ((i+1)>=j) {
			return;
		}
		k = (int)((j-i+1)/3);
		stooge(arr, i, j-k);
		stooge(arr, i+k, j);
		stooge(arr, i, j-k);
		return;
	}
	public void printstooge(int arr[], int n) {
		int i;
		System.out.println("list after sorting : ");
		for (i=0; i<n-1; i++) {
			System.out.print(arr[i]+ ", ");
		}
		System.out.print(arr[i]);
		System.out.println("\n");
	}
	public void shell(int arr[], int n) {
		int i, j, temp, k;
		for (i=n/2; i>0; i/=2) {
			for (j=i; j<n; j+=1) {
				temp = arr[j];
				for (k=j; k>=i && arr[k-i]>temp; k-=i) {
					arr[k] = arr[k-i];
				}
				arr[k] = temp;
			}
		}
	}
	public void printshell(int arr[], int n) {
		int i;
		System.out.println("list after sorting : ");
		for (i=0; i<n-1; i++) {
			System.out.print(arr[i]+ ", ");
		}
		System.out.print(arr[i]);
		System.out.println("\n");
	}
}

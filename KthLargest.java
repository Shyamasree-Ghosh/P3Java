import java.util.Scanner;

public class KthLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int temp,k,r=0;
		System.out.println("Enter the elements : ");
		for(int i = 0;i<n ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i<n; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(a[j]<a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
		System.out.println("The sorted array is :");
		for(int i = 0;i<n ; i++) {
			System.out.println(a[i]);
		}
		
		for(int i=0 ; i<=n;i++) {
			for(int j=i+1 ; j<=n-1;j++) {
				if(a[i] == a[j]) {
					 repl(a,j);

				}
			}
		}
		
		System.out.println("Enter the value of  K :");
		k=sc.nextInt();
		
		int p;
		for(p=0;a[p]!=0;p++) {
			;
		}
		if(k>a.length-p) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found  " +a[k-1]);
		}
		

	}

	private static void repl(int[] a, int j) {
		int i;
		for(i = j; i<a.length-1;i++) {
			a[i] = a[i+1];
		}
		
		a[i]='\0';
		//return i;
		
	}

	}



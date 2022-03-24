import java.util.Scanner;

public class largeDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int temp;
		System.out.println("Enter the elements : ");
		for(int i = 0;i<n ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i<n; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
		System.out.println("The largest difference of "+ a[0] + " And " + a[n-1] +" is "+ (a[n-1] - a[0]));

	}

}

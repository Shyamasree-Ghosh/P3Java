import java.util.Scanner;

public class MaxProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0,i=0;
		
		System.out.println("Enter the number of elements : ");
		n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements : ");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int max=0;
		for(i=0;i<n-1;i++) {
			if(max<=a[i]*a[i+1]) {
				max=a[i]*a[i+1];
			}
		}
		
		System.out.println("MAximum product is : "+ a[i-1] +" And  "+ a[i] + "=" + max);
		
		
	}

}

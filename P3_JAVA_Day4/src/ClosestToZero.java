import java.util.Arrays;
import java.util.Scanner;

public class ClosestToZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.println("Enter the number of elements : ");
		n= sc.nextInt();
		int a[] =new int[n];
		int  i =0,j=0;
		System.out.println("Enter the  elements : ");
		for(i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(i =0; i<n; i++) {
			if(a[i]>0)
			{
				break;
			}
		}
		
		
		if(a[i-1]==0) {
			System.out.println("Closest to 0 is 0");
		}
		else {
			if((a[i]-0)>0-a[i-1])
			
				System.out.println("Closest to 0 are : "+a[i-1]);
			else 
				System.out.println("Closest to 0 are : "+a[i]);
			
				
		}
	}

}

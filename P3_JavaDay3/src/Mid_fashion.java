import java.util.Scanner;

public class Mid_fashion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mid=0 ,l=0,r=0,n=0;
		
		System.out.println("Enter the Number of elements");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter the elements :");
		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
					}
		mid = (n-1)/2;
		l = mid -1;
		r = mid +1;
		
		System.out.println(a[mid]);
		
		for(int i = 0; i<=n/2; i++) {
			
			if((r+i)<=(n-1))
			System.out.println(a[r+i]);
			if((l-i)>=0)
				System.out.println(a[l-i]);
		}
		
		

	}

}

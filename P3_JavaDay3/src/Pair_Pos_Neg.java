import java.util.Scanner;

public class Pair_Pos_Neg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mid=0 ,l=0,r=0,n=0;
		
		System.out.println("Enter the Number of elements");
		n = sc.nextInt();
		int a[] = new int[n];
		int count  = 0;
		System.out.print("Enter the elements :");
		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
					}
		for(int i = 0;i <n ; i++  ) {
			for(int j = i+1 ; j<n; j++) {
				
				if((Math.abs(a[i])) == (Math.abs(a[j])) && a[j]!='X') {
					count++;
					a[j] ='X';
					
				}
			}
		}
		
		
	System.out.println(count);

	}

}

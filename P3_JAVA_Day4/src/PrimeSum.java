import java.util.Scanner;

public class PrimeSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0,sum=0;
		System.out.println("Enter the limit:");
		num = sc.nextInt();
		int  i =0,res = 0;
		for (i=0; i<num; i++) {
			res = prime(i);
			if(res==1) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("The summation of all primes within  limit is :"+sum);
		
		
		

	}

	private static int prime(int i) {
		if(i==1 || i==0)
		 return 0;
		else {
			for(int j=2; j<=i/2; j++) {
				if(i%j ==0) {
					return 0;
				}
				
			}
			return 1;
		}
		
		
	}

}

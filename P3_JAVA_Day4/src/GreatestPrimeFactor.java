import java.util.Scanner;

public class GreatestPrimeFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = 0,q=0,i=0;
		num = sc.nextInt();
		if(isprime(num)==1) {
			System.out.println("Greatest prime factor is "+num);
		}
		else {
			
			while(num%2 == 0) {
				q = num/2;
				num = q;
			}
			for(i=3; i<num/2;i=i+2) {
				while(num%i == 0 ) {
					if(num==i) {
						break;
					}
					else {
					q = num/i;
					num = q;
					}
				}
				
				
			}
			
			
			System.out.println("Greatest prime factor is "+num);	
			
		}
		

	}

	private static int isprime(int i) {
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

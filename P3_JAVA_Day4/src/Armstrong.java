import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numner");
		int num = 0,digits = 0,temp = 0,rem = 0,arm=0;
		num = sc.nextInt();
		temp = num;
		while(num!=0)
		{	num = num/10;
			digits++;
			
		}
		
		System.out.println(digits);
		num = temp;
		while(num !=0) {
			rem = num%10;
			arm = (int) (arm + Math.pow(rem, digits));
			num = num / 10;
		}
		if(temp == arm) {
			System.out.println("Enterred number is an Armstrong Number");
		}
		else {
			System.out.println("Enterred number is a Not Armstrong");
			
		}
	}

}

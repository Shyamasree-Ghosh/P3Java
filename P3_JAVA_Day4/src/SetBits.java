import java.util.Scanner;

public class SetBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = 0,q=0,i=0,rem=0,count=0;
		num = sc.nextInt();
		int a[] = new int[10];
		
		while(num !=0) {
			rem = num%2;
			a[i] = rem;
			i++;
			num = num/2;
		}
		for(i=0;i<a.length;i++) {
			if(a[i]==1) {
				count++;
			}
		}
		System.out.println(count);
		
		

	}

}

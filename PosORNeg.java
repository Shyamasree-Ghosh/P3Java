import java.util.*;
public class PosORNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		if(a!=0) {
			if(a>0) {
				System.out.println(a + "is positive number");
			}
			else {
				System.out.println(a + "is Negetive number");
			}
			
		}
		else {
			System.out.println("Number entered is  0");
		}

	}

}

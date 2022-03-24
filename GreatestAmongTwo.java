import java.util.*;
public class GreatestAmongTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter first number a: ");
		a = sc.nextInt();
		System.out.println("Enter second number b: ");
		b = sc.nextInt();
		if(a > b) {
			System.out.println(a + " is greater than " + b);
		}
		else {
			System.out.println(b + " is greater than " + a);
		}
	}

}

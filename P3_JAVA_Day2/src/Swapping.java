import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=10,b=20;
		a= a+b;
		b= a-b;
		a=a-b;
		System.out.println("a = "+a+" b= "+ b);
	}

}

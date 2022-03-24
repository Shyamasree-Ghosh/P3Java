import java.util.*;
import java.io.*;
public class Basics {

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter first number : ");
		int num2 = sc.nextInt();
		
		
		int c= (num1 + num2);
		System.out.println("Result is : " + c);
		
	}

}

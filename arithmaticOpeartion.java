import java.util.*;
public class arithmaticOpeartion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first number a: ");
		a = sc.nextInt();
		System.out.println("Enter second number b: ");
		b = sc.nextInt();
		
		String s;
		do {
			System.out.println("Select numbers for desired opeartion ");
			System.out.println("1.Addition\n2.Substraction3.Multiplication\n4.Division\n5.Modulus : ");
			c = sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("The resut is : "+(a+b));
			break;
		case 2:
			System.out.println("The resut is : "+(a-b));
			break;
		case 3:
			System.out.println("The resut is : "+(a*b));
			break;
		case 4:
			if(b==0) {
				System.out.println("Divide by 0 error");
			}
			else
			{
				System.out.println("The resut is : "+((float)a/b));
			}
			break;
		case 5:
			if(b==0) {
				System.out.println("Divide by 0 error");
			}
			else
			{
				System.out.println("The resut is : "+(a%b));
			}
			break;
		default:
			System.out.println("Please select the proper opeartion");
		}
		System.out.println("Continue?");
		s=sc.next();
		}while (s.equalsIgnoreCase("Yes"));
		

	}

}

import java.util.Scanner;

public class Compare_string {

	public static void main(String[] args) {
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string1 :");
		s1 = sc.nextLine();
		System.out.println("Enter the string2 :");
		s2 = sc.nextLine();
		if(s1.compareTo(s2)==0) {
			System.out.println("Both Strings are equal");
			
		}
		else if (s1.compareTo(s2)>0) {
			System.out.println(s1 + " is bigger");
		}
		else
		{
			System.out.println(s2 + " is bigger");
		}

	}

}

import java.util.Scanner;

public class Concatination {

	public static void main(String[] args) {
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string1 :");
		s1 = sc.nextLine();
		System.out.println("Enter the string2 :");
		s2 = sc.nextLine();
		String s3 = s1.concat(s2);
		System.out.println("the concatinated string is : "+s3);
		int len = s3.length();
		System.out.println(len);
		int length = 0;
		for(char c:s3.toCharArray()) {
			length++;
		}
		System.out.println(length);	
		
}

}

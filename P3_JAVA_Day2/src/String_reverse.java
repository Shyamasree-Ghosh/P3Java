import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string1 :");
		s1 = sc.nextLine();
		
		char str1[] = new char[s1.length()];
		str1 = s1.toCharArray();
		char str2[] = new char[s1.length()];
		int i,j;
		for(j=0, i=s1.length()-1;i>=0 && j<s1.length();i--,j++) {
			str2[j] = str1[i];
		}
		//str2[j] = '\0';
		String s4 = new String(str2); //Converting char array to string by string constructor
		System.out.println("The reverse string is "+s4 );
		System.out.println("Enter the sub string to find:");
		String s3 = sc.nextLine();
		if(s1.contains(s3)) {
			System.out.println("Containes");
		}
		else {
			System.out.println("Not Containes");
		}

	}

}

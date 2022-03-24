import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LongestPallindeome {

	public static void main(String[] args) throws IOException {
		String sub_2[] = new String[10];
		String str;
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		str = sc.nextLine();
		int result;
		
		for(int k =0;k<str.length()-1;k++) {
		for(int i=0,j=2+k;j<=str.length();i++,j++) {
			sub_2[i] = str.substring(i,j);
			System.out.println(sub_2[i]);
			result = check_pallindrome(sub_2[i]);
			if(result!=0)
			{
				System.out.println("Pallindrome of length "+result);
			}
			else {
				System.out.println("Pallindrome not ");
			}
			
			
		}
		}
		
		

	}

	private static int check_pallindrome(String s1) {
		char sub_rev[] = new char[s1.length()];
		for(int i=0,j=s1.length()-1; i<s1.length();i++,j--)
		{
			sub_rev[i] = s1.charAt(j);
			System.out.println(sub_rev[i]);
		}
		
		//String reverse = sub_rev.toString();
		if(s1.contentEquals(new String (sub_rev))){
			return s1.length();
		}
		else {
			return 0;
		}
		
	}

	

	

}

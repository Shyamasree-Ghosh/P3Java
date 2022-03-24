
import java.util.*;
import java.io.*;
public class ThreeStrings {

	public static void main(String[] args) throws IOException {
		String s1,s2,s3;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first string : ");
		s1 = br.readLine();
		System.out.println("Enter Second string : ");
		s2 = br.readLine();
		System.out.println("Enter Third string : ");
		s3 = br.readLine();
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		float f3 = Float.parseFloat(s3);
		float f4 = f1 * f2 * f3;
		System.out.println("The result is : "+f4);
		

	}

}

import java.util.Scanner;

public class SplitIntoWords {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s;
		s= sc.nextLine();
		for(String split: s.split(" ")) {
			System.out.println(split);
		}
		String upper = s.toUpperCase();
		System.out.println(upper);
	}

}

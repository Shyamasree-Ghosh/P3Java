import java.util.ArrayList;
import java.util.Scanner;

public class MatchingBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter the string: ");
		s =sc.nextLine();
		int i =0,top=-1;
		ArrayList <Character> stack = new ArrayList<>();
		
		for(i=0;i<s.length();i++) {
			
			if(!(stack.isEmpty())&& s.charAt(i)==stack.get(top))
			{
				stack.remove(top);
				
				top--;
				
			
		}
			else {
				stack.add(s.charAt(i));
				top++;
				
			}
			
	}
		if(stack.isEmpty()) {
			System.out.println("valid");
		}
		else {
			System.out.println(" Not valid");
		}

}
}

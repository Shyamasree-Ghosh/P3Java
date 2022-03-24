import java.util.Scanner;

public class HoursTimeDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter minutes 1 :");
		double min1,min2,sec1,sec2;
		min1 = sc.nextDouble();
		System.out.println("Enter the Sec 1 :");
		sec1 = sc.nextDouble();
		
		System.out.println("Enter the minutes 2 :");
		min2 = sc.nextDouble();
		
		System.out.println("Enter the Sec 2 :");
		sec2 = sc.nextDouble();
		
		diffHours(min1,sec1,min2,sec2);

	}

	private static void diffHours(double min1, double sec1, double min2, double sec2) {
		double min1_sec, min2_sec, time1,time2,diff,diff_hr;
		
		 min1_sec = min1*60;
		min2_sec = min2 * 60;
		time1 = min1_sec + sec1;
		time2 = min2_sec + sec2;
		diff = time1 - time2;
		if(diff<0) {
			diff = -diff;
		}
		diff_hr = diff/3600;
		System.out.println("Difference of time in Hours : "+ String.format("%.2f", diff_hr) );
		
	}

}

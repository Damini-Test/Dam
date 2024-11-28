package InterviewPracticeProgram;

import java.util.Scanner;

public class SwappingTwoNumberUsingThirdNumber {

	public static void main(String[] args) {
		int x, y, temp;
		System.out.println("Enter value of X and Y");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();

		System.out.println("Before Swapping" + "  " + x + "  " + y);
		temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping" + "  " + x + "   " + y);
	}

}

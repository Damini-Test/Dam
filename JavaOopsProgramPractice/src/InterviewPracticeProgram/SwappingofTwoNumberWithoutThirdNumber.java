package InterviewPracticeProgram;

import java.util.Scanner;

public class SwappingofTwoNumberWithoutThirdNumber {

	public static void main(String[] args) {
		 int x,y;
		 System.out.println("Enter the Value of X and Y");
		 Scanner in= new Scanner(System.in);
		  x= in.nextInt();
		  y= in.nextInt();
		  
		  System.out.println("Before Swapping The Number"+"\n"+x+"\n"+y);
		  x= x+y;
		  y= x-y;
		  x= x-y;
		  
		  System.out.println("After Swapping the number"+"\n"+x+"\n"+y);

	}

}

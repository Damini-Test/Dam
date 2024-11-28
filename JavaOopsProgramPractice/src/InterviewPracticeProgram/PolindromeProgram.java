package InterviewPracticeProgram;

public class PolindromeProgram {

	public static void main(String[] args) {
		 String input ="Madam";
		 String result="";
		 
		 for(int i=input.length()-1;i>=0;i--)
		 {
			 char c= input.charAt(i);
			 result= result+c;
			 
		 }
		 System.out.println(result );
		 
		// if (input.equalsIgnoreCase(result))
		 //{
		 
		 //System.out.println(input );//+"is a polindrome");
		// }
		// else {
			// System.out.println(input+"is not a polidrome");
		// }
	}
 
}


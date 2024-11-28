package InterviewPracticeProgram;

public class Reverse_StringProgram {

	public static void main(String[] args) {
		 String str = "Damini";
		 String ReversedStr ="";
		 
		 // Reverse string Manually
		 for(int i =str.length()-1;i>=0;i--)
		 {
			 ReversedStr +=  str.charAt(i);
		 }
		 
		 System.out.println(ReversedStr);
	}

}

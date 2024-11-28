package OopsProgram;

public class SundayClass {

	int a = 10;
	int b = 20;

	SundayClass() {
		System.out.println("Constructor Executed");
	}

	public static void main(String[] args) {
		SundayClass obj = new SundayClass();
		System.out.println(obj);
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}

package OopsProgram;

public class UnderstangingnonStaticmethods {

	int a = 10;
	static boolean flag;
	{
		a = 45;
		test1();
		System.out.println(flag);
	}

	public void test1() {
		System.out.println("Test1() Executed");
	}

	public static void main(String[] args) {
		int a = 18;
		System.out.println(a);
		UnderstangingnonStaticmethods obj = new UnderstangingnonStaticmethods();
		obj.test1();
		System.out.println(obj.a);

	}

}

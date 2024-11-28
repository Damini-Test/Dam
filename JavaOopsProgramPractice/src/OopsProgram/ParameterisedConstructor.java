package OopsProgram;

public class ParameterisedConstructor {

	String name;
	int sid;
	String course;

	ParameterisedConstructor(String name1, int sid1, String course1) {
		name = name1;
		sid = sid1;
		course = course1;
	}

	public static void main(String[] args) {
		ParameterisedConstructor prmc = new ParameterisedConstructor("Shafayat", 101, "Java Full stack development");
		ParameterisedConstructor prmc1 = new ParameterisedConstructor("Damini", 102, "Testing");
		ParameterisedConstructor prmc3 = new ParameterisedConstructor("akash", 103, "Automation Tester");

		System.out.println(prmc.name +"  "+ prmc.sid +"   "+prmc.course);
		System.out.println(prmc1.name +"  "+prmc1.sid+"   "+ prmc.course);
		System.out.println(prmc3.name +"  "+ prmc3.sid +"  "+ prmc3.course);

	}

}

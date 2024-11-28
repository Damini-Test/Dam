package Encapsulation;

class student {
	private String name;

	public String getName() {
		return name;

	}

	public void setName(String Name) {
		this.name = Name;

	}

}

class Test {

	public static void main(String[] args) {
		student s = new student();
		s.setName("Damini Varle");
		System.out.println(s.getName());

	}

}

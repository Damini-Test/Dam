package Encapsulation;

public class Person {

	private String name;
	private long contact;
	private String email;
	private AadharCard aadharcard = new AadharCard(998877665544l, "01/06/200", "Pune");

	public Person(String name, long contact, String email) {
		this.name = name;
		this.contact = contact;
		this.email = email;

	}

	public void printprops() {
		System.out.println(this.name);
		System.out.println(this.contact);
		System.out.println(this.email);
		aadharcard.printprops();
	}
}

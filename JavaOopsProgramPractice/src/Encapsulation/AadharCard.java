package Encapsulation;

public class AadharCard {
	private long aadharNumber;
	private String dob;
	private String address;
	
	public AadharCard(long aadharNumber,String dob,String address)
	{
		this.aadharNumber=aadharNumber;
		this.dob= dob;
		this.address=address;
		
	}
	
	public void printprops()
	{
		System.out.println(aadharNumber);
		System.out.println(dob);
		System.out.println(address);
		
	}

}

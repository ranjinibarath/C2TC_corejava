package com.tns.day5.singleinheritance;

public class Citizen {
	private String name;
	private int Aadharno;
	private String address;
	private long phoneno;
	
	public Citizen() {
		System.out.println("citizen object created");
	}
	public Citizen(String name,int Aadharno,String address,long phoneno) {
		this.name=name;
		this.Aadharno=Aadharno;
		this.address=address;
		this.phoneno=phoneno;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAadharno() {
		return Aadharno;
	}
	public void setAadharno(int aadharno) {
		Aadharno = aadharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", Aadharno=" + Aadharno + ", address=" + address + ", phoneno=" + phoneno
				+ "]";
	}
	
	
	

}

package com.tns.day5.singleinheritance;

public class Student extends Citizen {
	private int rollno;
	private String Collegename;
	
	public Student() {
		super();
	}
	public Student( String name,int Aadharno,String address,long phoneno,int rollno,String Collegename) {
		super(name,Aadharno,address,phoneno);
		this.Collegename=Collegename;
		this.rollno=rollno;
		
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return Collegename;
	}
	public void setCollegename(String collegename) {
		Collegename = collegename;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", Collegename=" + Collegename +",Name= "+getName()+",Aadharno=" +getAadharno()+",String=" +getAddress()+",phoneno="+getPhoneno()+"]";

}
}

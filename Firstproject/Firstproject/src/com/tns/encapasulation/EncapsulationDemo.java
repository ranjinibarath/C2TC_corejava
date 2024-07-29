package com.tns.encapasulation;

public class EncapsulationDemo {
	private int age;
	private String Name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "EncapsulationDemo [age=" + age + ", Name=" + Name + "]";
	}
	
}

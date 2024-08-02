package com.tns.day6.staticvariable;

public class Employee{
		private String name;
		private int id;
		
	
		static String companyName = "TNS";

		public Employee() {
			// TODO Auto-generated constructor stub
		}
		
		// Declare a two-parameter constructor with parameters named n and i.
		Employee(String name, int id) {
			this.name = name;
			this.id = id;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
		}

		

	}




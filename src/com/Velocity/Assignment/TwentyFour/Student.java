package com.Velocity.Assignment.TwentyFour;

//	2. Suppose I have Student class containing I'd, name and salary now I
//	 want to sort the data based on comparator interface by using salary.


	public class Student {
	
		private int id;
		private String name;
		private int salary;
		public Student(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
		// Getters & setters method for private variables
		public int getId() {
			return id;
}
		public void setId(int id) {
			this.id = id;
}
		public String getName() {
			return name;
}
		public void setName(String name) {
			this.name = name;
}
		public int getSalary() {
			return salary;
}
		public void setSalary(int salary) {
			this.salary = salary;
}
// Object string representation
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
}
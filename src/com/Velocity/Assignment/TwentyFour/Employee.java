package com.Velocity.Assignment.TwentyFour;


//1. Suppose I have Employee class that containing I'd, name and city now I want to sort the
// data based on comparable interface by using name.


	public class Employee implements Comparable<Employee> {
		private int id;
		private String name;
		private String city;
	
		public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
}
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
	public String getCity() {
		return city;
}
	public void setCity(String city) {
		this.city = city;
}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
}
// Sorting logic on employee name
	@Override
	public int compareTo(Employee emp) {
		return this.name.compareTo(emp.name);
}
}
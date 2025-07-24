package com.example.jv;
 class Student
{
	private String name;
	private int id;
	
	public Student(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String getDetails()
	{
		return "Employee: " + name + ", ID:" + id;
	}
}

 class StudentPersistance 
{
	public void saveToFile(Student student)
	{
		System.out.println("Saving student to file: " + student.getDetails());
	}
}

public class Single_responsibility {

	public static void main(String[] args) {
		Student st = new Student("Alice", 105);
		StudentPersistance per =  new StudentPersistance();
		per.saveToFile(st);
		// TODO Auto-generated method stub

	}

}

//Student.java

class Student{
	private String name;
	private long prn;
	private double CGPA;
	private String dept;
	private String batch;  //using string because of the '-'

	public Student(String name, long prn, double CGPA, String dept, String batch){ // constructor
		this.name = name;
		this.prn = prn;
		this.CGPA = CGPA;
		this.dept = dept;
		this.batch = batch;
	}
}

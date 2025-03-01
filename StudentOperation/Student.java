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

	//Getter for NAME
	public String getName(){
		return name;
	}

	//setter for name
	public void setName(String name){
		this.name = name;
	}

	//getter for PRN
	public long getPRN(){
		return prn;
	}

	//setter for PRN
	public void setPRN(long prn){
		this.prn = prn;
	}

	//getter for CGPA
	public double getCGPA(){
		return CGPA;
	}

	//setter for CGPA
	public void setCGPA(double CGPA){
		this.CGPA = CGPA;
	}

	//getter for dept
	public String getDept(){
		return dept;
	}

	//setter for dept
	public void setDept(String dept){
		this.dept = dept;
	}

	//getter for batch 
	public String getBatch(){
		return batch;
	}
	
	//setter for batch
	public void setBatch(String batch){
		this.batch = batch;
	}

	public void display(){
		System.out.println("Name: " +name+ " PRN: " +prn+ " CGPA: " +CGPA+ " dept: " +dept+ " Batch: " +batch);
	}
	
}

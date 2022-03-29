
class Student1 {
	private int sid;
	private String course;
	private double tutionfee;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getTutionfee() {
		return tutionfee;
	}
	public void setTutionfee(double tutionfee) {
		this.tutionfee = tutionfee;
	}
	
	double assignfee(double  fine )
	{
		double totalfee = tutionfee + fine;
		  return totalfee;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", course=" + course + ", tutionfee=" + tutionfee + "]";
	}
}
	public class Student{
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.setTutionfee(2000.00);
		System.out.println("the total fees is  " + s.assignfee(500.00));
	}
	}
		
	
	
	
	
	



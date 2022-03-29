
public class FirstProg {
	 int empno;
	String empname;
	double salary;
	double empbonus;
	
	public void empbonus(double bonus) {
		   
		double temp = (double) (salary+bonus);
		System.out.println(temp);
		
	}

public static void main(String[] args) {
	
	FirstProg fp = new FirstProg();
    fp.empname = "Vyom";
	fp.salary = 20000;
	fp.empbonus(5000);
	
}

}

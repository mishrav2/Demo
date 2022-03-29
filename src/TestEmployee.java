class Person{
	String name = "Vyom";
	void name() {
		
		System.out.println(" Employee name is = " + name);
		

	}
	}

class Employee extends Person{
	double sal;
	int year;
	String ins;
	  Employee(double sal, int year, String ins) {
		
		this.sal = sal;
		this.year = year;
		this.ins = ins;
		
		System.out.println("Salary =" + sal + "Year =" + year + "Insurance =" + ins );
	}
	
	
}
public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new Employee(200.00 , 2022 , "LIC");
		e.name();
		
	}

}

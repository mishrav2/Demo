class Patient {
	int weight;
	double height;
	//patient() below is a  parametrized constructor 
	Patient(int weight , double height){
		//this keyword is used to prevent name collision here
		this.weight = weight;
		this.height = height;
	}
	 double computeBMI() {
		return (weight/(height*height));
	}
	public static void main(String[] args) {
		Patient p1 = new Patient(90 , 1.75);//here we are passing values to a constructor .
		Patient p2 = new Patient(100 , 1.85);//here we are passing values to a constructor.
		System.out.println(p1.computeBMI());
		System.out.println(p2.computeBMI());
		
		
	}

}

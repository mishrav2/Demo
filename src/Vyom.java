import java.util.Scanner;

public class Vyom {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = s.nextInt();
		int array[] = new int[size];
		for(int i=0;i<array.length;i++) {
			System.out.println("enter the value of "+i+"th index");
			array[i] = s.nextInt();
		}
		
		
	}

}

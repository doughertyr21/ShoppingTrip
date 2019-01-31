import java.util.Scanner;

public class VSMain {
	int i1 = 5;
	String s1 = "five";
	double d1 = 5.0;
	boolean b1 = false;
	static int vsStatic = 1; // only one copy, all objects change it
	
	public void changeInt1(int n) {
		i1 = n;
	}
	
	public void printInt1() {
		System.out.println("i1 = " + i1);
	}
	
	public void changeStatic(int n) {
		vsStatic = n;
	}
	
	public void printStatic() {
		System.out.println("vsStatic = " + vsStatic);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//VSMain m1 = new VSMain();
	//	VSMain m2 = new VSMain();
		//VSMain m3 = null;
		Triangle t1 = new Triangle(5,4,3);
		Triangle t2 = new Triangle(7,4,4);
		
//		m1.printInt1();
//		m2.printInt1();
//		m1.changeInt1(10);
//		m1.printInt1();
//		m2.printInt1();
//		m3 = m1;
//		m3.changeInt1(15);
//		m1.printInt1();
//		m3.printInt1();
		System.out.println("Enter three side numbers");
		t1.printSides();
		t2.printSides();
		t1.setSides(Integer.valueOf(scan.next()), Integer.valueOf(scan.next()), Integer.valueOf(scan.next()));
		t1.printSides();
		t1.perimeter();
	//	m1.printStatic();
	//	m2.printStatic();
	//	m1.changeStatic(10);
	//	m1.printStatic();
	//	m2.printStatic();
		
		

	}

}

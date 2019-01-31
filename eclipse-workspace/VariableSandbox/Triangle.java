
public class Triangle {
	int a = 0;
	int b = 0;
	int c = 0;
	int p = 0;
	
	public void setSides(int a, int b, int c) {
		// "this" references this class specifically
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void printSides() {
		System.out.println("Side 1 = " + a);
		System.out.println("Side 2 = " + b);
		System.out.println("Side 3 = " + c);
	}
	
	public Triangle(int a, int b, int c) {
		setSides(a,b,c);
	}
	
	public void perimeter() {
		this.p = (this.a + this.b + this.c);
		System.out.println("Perimeter = " + p);
	}
	
}

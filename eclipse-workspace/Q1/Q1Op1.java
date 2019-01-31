
public class Q1Op1 extends Q1OpParent {
	public int op(int a, int b, int c) {
		
		int multiply = a * b;
		int modulo = multiply % c;
		return modulo;
	}
	

}

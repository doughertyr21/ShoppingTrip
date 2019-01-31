
public class VRPNDivideOperator extends VRPNOperator {
	static float x1 = 0;
	static float x2 = 0;
	public VRPNDivideOperator() {
		super("/");
	}
	public void handle(VRPNStack stack) {
		VRPNStackItem d1 = stack.pop();
		VRPNStackItem d2 = stack.pop();
		float v1 = Float.parseFloat(d1.toString());
		float v2 = Float.parseFloat(d2.toString());
		stack.push(new VRPNStackItem(String.valueOf(v2 / v1)));
		x1 = v1;
		x2 = v2;
	}
	
	public static float divided() {
		return(x2 / x1);
	}
	
}

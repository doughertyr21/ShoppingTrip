
public class VRPNMultiplyOperator extends VRPNOperator {
	static float x1 = 0;
	static float x2 = 0;
	public VRPNMultiplyOperator() {
		super("*");
	}
	public void handle(VRPNStack stack) {
		VRPNStackItem m1 = stack.pop();
		VRPNStackItem m2 = stack.pop();
		float v1 = Float.parseFloat(m1.toString());
		float v2 = Float.parseFloat(m2.toString());
		stack.push(new VRPNStackItem(String.valueOf(v1 * v2)));
		x1 = v1;
		x2 = v2;
			
	}
	
	public static float multiplied() {
		return(x2 * x1);
	}
	
}

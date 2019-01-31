
public class VRPNMinusOperator extends VRPNOperator {
	static float x1 = 0;
	static float x2 = 0;
	public VRPNMinusOperator() {
		super("-");
	}
	public void handle(VRPNStack stack) {
		VRPNStackItem s1 = stack.pop();
		VRPNStackItem s2 = stack.pop();
		float v1 = Float.parseFloat(s1.toString());
		float v2 = Float.parseFloat(s2.toString());
		stack.push(new VRPNStackItem(String.valueOf(v2 - v1)));
		x2 = v2;
		x1 = v1;
		
	}
	
	public static float subtracted() {
		return(x2 - x1);
	}
	
}

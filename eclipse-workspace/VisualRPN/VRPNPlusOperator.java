
public class VRPNPlusOperator extends VRPNOperator {
	static float x1 = 0;
	static float x2 = 0;
	public VRPNPlusOperator() {
		super("+");
		
	}
	public void handle(VRPNStack stack) {
		VRPNStackItem a1 = stack.pop();
		VRPNStackItem a2 = stack.pop();
		float v1 = Float.parseFloat(a1.toString());
		float v2 = Float.parseFloat(a2.toString());
		stack.push(new VRPNStackItem(String.valueOf(v1 + v2)));
		x2 = v2;
		x1 = v1;
	}
	public static float added() {
		return(x1 + x2);
	}
	
}


public class VRPNExponentOperator extends VRPNOperator {
	public VRPNExponentOperator() {
		super("^");
	}
	public void handle(VRPNStack stack) {
		VRPNStackItem e1 = stack.pop();
		VRPNStackItem e2 = stack.pop();
		float v1 = Float.parseFloat(e1.toString());
		float v2 = Float.parseFloat(e2.toString());
		stack.push(new VRPNStackItem(String.valueOf(Math.pow(v2, v1))));
	}
	
}

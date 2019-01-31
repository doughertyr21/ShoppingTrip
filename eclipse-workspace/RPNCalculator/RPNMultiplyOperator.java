
public class RPNMultiplyOperator extends RPNOperator {
	public RPNMultiplyOperator() {
		super("*");
	}
	public void handle(RPNStack stack) {
		RPNStackItem m1 = stack.pop();
		RPNStackItem m2 = stack.pop();
		float v1 = Float.parseFloat(m1.toString());
		float v2 = Float.parseFloat(m2.toString());
		stack.push(new RPNStackItem(String.valueOf(v1 * v2)));
	}
	
}
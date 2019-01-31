
public class RPNExponentOperator extends RPNOperator {
	public RPNExponentOperator() {
		super("^");
	}
	public void handle(RPNStack stack) {
		RPNStackItem e1 = stack.pop();
		RPNStackItem e2 = stack.pop();
		float v1 = Float.parseFloat(e1.toString());
		float v2 = Float.parseFloat(e2.toString());
		stack.push(new RPNStackItem(String.valueOf(Math.pow(v2, v1))));
	}
	
}
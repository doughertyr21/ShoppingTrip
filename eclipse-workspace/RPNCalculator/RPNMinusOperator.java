
public class RPNMinusOperator extends RPNOperator {
	public RPNMinusOperator() {
		super("-");
	}
	public void handle(RPNStack stack) {
		RPNStackItem s1 = stack.pop();
		RPNStackItem s2 = stack.pop();
		float v1 = Float.parseFloat(s1.toString());
		float v2 = Float.parseFloat(s2.toString());
		stack.push(new RPNStackItem(String.valueOf(v2 - v1)));
	}
	
}

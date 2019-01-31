
public class RPNPlusOperator extends RPNOperator {
	public RPNPlusOperator() {
		super("+");
	}
	public void handle(RPNStack stack) {
		RPNStackItem a1 = stack.pop();
		RPNStackItem a2 = stack.pop();
		float v1 = Float.parseFloat(a1.toString());
		float v2 = Float.parseFloat(a2.toString());
		stack.push(new RPNStackItem(String.valueOf(v1 + v2)));
	}

}

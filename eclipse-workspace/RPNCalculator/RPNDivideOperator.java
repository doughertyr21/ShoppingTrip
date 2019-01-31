
public class RPNDivideOperator extends RPNOperator {
	public RPNDivideOperator() {
		super("/");
	}
	public void handle(RPNStack stack) {
		RPNStackItem d1 = stack.pop();
		RPNStackItem d2 = stack.pop();
		float v1 = Float.parseFloat(d1.toString());
		float v2 = Float.parseFloat(d2.toString());
		stack.push(new RPNStackItem(String.valueOf(v2 / v1)));
	}
	
}

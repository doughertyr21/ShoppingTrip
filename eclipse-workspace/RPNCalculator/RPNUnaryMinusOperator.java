
public class RPNUnaryMinusOperator extends RPNOperator {
	public RPNUnaryMinusOperator() {
		super("_");
	}
	public void handle(RPNStack stack) {
		RPNStackItem u1 = stack.pop();
		int v1 = Integer.parseInt(u1.toString());
		stack.push(new RPNStackItem(String.valueOf(v1 * -1)));
	}
	
}

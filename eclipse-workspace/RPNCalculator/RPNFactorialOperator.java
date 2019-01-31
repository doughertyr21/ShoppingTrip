
public class RPNFactorialOperator extends RPNOperator {
	public RPNFactorialOperator() {
		super("!");
	}
	public void handle(RPNStack stack) {
		int mult = 1;
		RPNStackItem f1 = stack.pop();
		float v1 = Float.parseFloat(f1.toString());
		for (int i = 1; i<=v1; i++) {
			mult = mult * i;
		}
		stack.push(new RPNStackItem(String.valueOf(mult)));
	}
	
}
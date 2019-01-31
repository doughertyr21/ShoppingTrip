
public abstract class RPNOperator {
	String symbol;
	public RPNOperator(String symbol) {
		this.symbol = symbol;
	}
	
	abstract public void handle(RPNStack stack);

}

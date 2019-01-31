
public abstract class VRPNOperator {
	String symbol;
	public VRPNOperator(String symbol) {
		this.symbol = symbol;
	}
	
	abstract public void handle(VRPNStack myStack);

}

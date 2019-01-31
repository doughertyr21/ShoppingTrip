//things that I added:
//subtraction, multiplication, division, unary minus, exponentiation, factorial, modulo, started working on true false comparison stuff

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class RPNMain {
	static Scanner scan = new Scanner(System.in);
	
	static Map<String, RPNOperator> opMap = new HashMap<String, RPNOperator>();
	
	public static void main(String[] args) {
		RPNStack myStack = new RPNStack();
		
		opMap.put("+", new RPNPlusOperator());
		opMap.put("-", new RPNMinusOperator());
		opMap.put("*", new RPNMultiplyOperator());
		opMap.put("/", new RPNDivideOperator());
		opMap.put("^", new RPNExponentOperator());
		opMap.put("%", new RPNModuloOperator());
		opMap.put("_", new RPNUnaryMinusOperator());
		opMap.put("!", new RPNFactorialOperator());
		opMap.put("=", new RPNEqualOperator());
		String input = "";
		String[] tokens;
		// test of truth:  3 4 + 5 +   outputs 12
		do {
			input = scan.nextLine();
			tokens = input.split(" ");	
			RPNOperator tempOp;
			for (String s : tokens) {
		//		int i=0;
		//		i=i++;
		//		System.out.println(i);
				if(opMap.get(s) != opMap.get("=")) {
					if ((tempOp = opMap.get(s)) != null) {
						tempOp.handle(myStack);
					} else {
						myStack.push(new RPNStackItem(s));
					}
				
				}
				else {
					System.out.println("unfinished");
				}
			}
			myStack.printStack();
			myStack.stack.clear();
		} while (true);
		 
		//myStack.push(new RPNStackItem("bleah"));
		//myStack.push(new RPNStackItem("blip"));
		//System.out.println(myStack.pop());
		//System.out.println(myStack.pop());
		
		
		// myStack.printStack();
	}

}
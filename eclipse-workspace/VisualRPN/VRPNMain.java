import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class VRPNMain {
	
	//tried my best to implement a lot of the code from the normal RPNCalculator that we had built
	
	JFrame frame;
	JLabel label;
	JPanel panel;
	VRPNStack myStack;
	String[] tokens;
	static int amountOnStack = 0;
	// the amountOnStack variable was going to be used for something if i had more time, but currently it just tracks
	// how many different variables are on the stack at any givent ime
	static String currentNumber = ("");
	//i used a string to store the number that you are making at that current moment before adding it to the stack,
	//and it will convert it into a float when giving it to the stack so that it can be acted on by operators

	static Map<String, VRPNOperator> opMap = new HashMap<String, VRPNOperator>();

	public static void main(String[] args) {
		
		opMap.put("+", new VRPNPlusOperator());
		opMap.put("-", new VRPNMinusOperator());
		opMap.put("*", new VRPNMultiplyOperator());
		opMap.put("/", new VRPNDivideOperator());
//		opMap.put("^", new VRPNExponentOperator());
//		opMap.put("%", new VRPNModuloOperator());
//		opMap.put("_", new VRPNUnaryMinusOperator());
//		opMap.put("!", new VRPNFactorialOperator());
//		opMap.put("=", new VRPNEqualOperator());
	
		//these operators were going to be added if i had more time, but currently they are unused on the opmap
		
		VRPNMain gui = new VRPNMain ();
		gui.go();

	}
	
	public void go() {
		frame = new JFrame("Calculator");
		panel = new JPanel();
		label = new JLabel("0");
		myStack = new VRPNStack();
		
		frame.getContentPane().add(panel);
		panel.setBounds(200,200,200,200);
		// this bit of code was leftover from an attempt at making it work with coordinates rather than adjusting to the frame
		label.setLocation(40,20);
		panel.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//specific button creation for each button for the next hundredish lines of code
		//gives it a listener, name, and dimension
		
		JButton zeroButton = new JButton("0");
		panel.add(zeroButton);
		zeroButton.addActionListener(new zeroListener());
		zeroButton.setPreferredSize(new Dimension(40, 40));
		
		JButton oneButton = new JButton("1");
		panel.add(oneButton);
		oneButton.addActionListener(new oneListener());
		oneButton.setPreferredSize(new Dimension(40, 40));
		
		JButton twoButton = new JButton("2");
		panel.add(twoButton);
		twoButton.addActionListener(new twoListener());
		twoButton.setPreferredSize(new Dimension(40, 40));
		
		JButton threeButton = new JButton("3");
		threeButton.addActionListener(new threeListener());
		threeButton.setPreferredSize(new Dimension(40, 40));
		panel.add(threeButton);
		
		JButton fourButton = new JButton("4");
		fourButton.addActionListener(new fourListener());
		fourButton.setPreferredSize(new Dimension(40, 40));
		panel.add(fourButton);
		
		JButton fiveButton = new JButton("5");
		fiveButton.addActionListener(new fiveListener());
		fiveButton.setPreferredSize(new Dimension(40, 40));
		panel.add(fiveButton);
		
		JButton sixButton = new JButton("6");
		sixButton.addActionListener(new sixListener());
		sixButton.setPreferredSize(new Dimension(40, 40));
		panel.add(sixButton);
		
		JButton sevenButton = new JButton("7");
		sevenButton.addActionListener(new sevenListener());
		sevenButton.setPreferredSize(new Dimension(40, 40));
		panel.add(sevenButton);
		
		JButton eightButton = new JButton("8");
		eightButton.addActionListener(new eightListener());
		eightButton.setPreferredSize(new Dimension(40, 40));
		panel.add(eightButton);
		
		JButton nineButton = new JButton ("9");
		nineButton.addActionListener(new nineListener());
		nineButton.setPreferredSize(new Dimension(40, 40));
		panel.add(nineButton);
		
		JButton addButton = new JButton("+");
		addButton.addActionListener(new addListener());
		addButton.setPreferredSize(new Dimension(40, 40));
		panel.add(addButton);
		
		JButton subtractButton = new JButton("-");
		subtractButton.addActionListener(new subtractListener());
		subtractButton.setPreferredSize(new Dimension(40, 40));
		panel.add(subtractButton);
		
		JButton multiplyButton = new JButton("*");
		multiplyButton.addActionListener(new multiplyListener());
		multiplyButton.setPreferredSize(new Dimension(40, 40));
		panel.add(multiplyButton);
		
		JButton divideButton = new JButton("/");
		divideButton.addActionListener(new divideListener());
		divideButton.setPreferredSize(new Dimension(40, 40));
		panel.add(divideButton);
		
		JButton dotButton = new JButton(".");
		dotButton.addActionListener(new dotListener());
		dotButton.setPreferredSize(new Dimension(40, 40));
		panel.add(dotButton);
		
		JButton deleteButton = new JButton("del");
		deleteButton.addActionListener(new deleteListener());
		deleteButton.setPreferredSize(new Dimension(40, 40));
		panel.add(deleteButton);
		
		JButton enterButton = new JButton("enter");
		enterButton.addActionListener(new enterListener());
		enterButton.setPreferredSize(new Dimension(80,40));
		panel.add(enterButton);
		
		JButton clearButton = new JButton("clear");
		clearButton.addActionListener(new clearListener());
		clearButton.setPreferredSize(new Dimension(80,40));
		panel.add(clearButton);
		
		frame.setSize(200,280);
		frame.setVisible(true);
		frame.getContentPane().add(BorderLayout.NORTH, label);
		
	}
	
	//most of the number listeners are just adding a number to the currentNumber string and changing the label so you can see what you are typing
	
	class zeroListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentNumber = (currentNumber + "0");
			label.setText(currentNumber);
		}
	}
	
	class oneListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentNumber = (currentNumber + "1");
			label.setText(currentNumber);
		}
	}
	
	class twoListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentNumber = (currentNumber + "2");
			label.setText(currentNumber);
		}
	}
	
	class threeListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentNumber = (currentNumber + "3");
			label.setText(currentNumber);
		}
	}
	
	class fourListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentNumber = (currentNumber + "4");
			label.setText(currentNumber);
		}
	}
	
	class fiveListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentNumber = (currentNumber + "5");
			label.setText(currentNumber);
		}
	}
	
	class sixListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentNumber = (currentNumber + "6");
			label.setText(currentNumber);
		}
	}
	
	class sevenListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentNumber = (currentNumber + "7");
			label.setText(currentNumber);
		}
	}
	
	class eightListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentNumber = (currentNumber + "8");
			label.setText(currentNumber);
		}
	}
	
	class nineListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentNumber = (currentNumber + "9");
			label.setText(currentNumber);
		}
	}
	
	class dotListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentNumber = (currentNumber + ".");
			label.setText(currentNumber);
		}
	}
	
	class clearListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentNumber = "";
			myStack.stack.clear();
			label.setText("0");
		}
	}
	
	class deleteListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentNumber = "";
			label.setText("0");
		}
	}
	
	//for the operator listeners, a lot of code is reused from the original rpncalculator, so i think the equals check
	//might be redundant at the moment, but if i had more time to add the equals operator to the opmap successfully, that
	//check may have actually been useful. otherwise, it will clear the currentnumber string every time you use an operator
	// and work on the stack.
	
	class addListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (currentNumber != "") {
				myStack.push(new VRPNStackItem(currentNumber));
				currentNumber = "";
				amountOnStack = amountOnStack+1;
			}
			VRPNOperator tempOp;
			for (int count = 1; count<2; count++) {
				if(opMap.get("+") != opMap.get("=")) {
					if ((tempOp = opMap.get("+")) != null) {
						tempOp.handle(myStack);
					} 
				
				}
		
			}
			amountOnStack = amountOnStack-1;
			label.setText(Float.toString(VRPNPlusOperator.added()));
			myStack.printStack();
			
		}
	}
	
	class subtractListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (currentNumber != "") {
				myStack.push(new VRPNStackItem(currentNumber));
				currentNumber = "";
				amountOnStack = amountOnStack+1;
			}
			VRPNOperator tempOp;
			for (int count = 1; count<2; count++) {
				if(opMap.get("-") != opMap.get("=")) {
					if ((tempOp = opMap.get("-")) != null) {
						tempOp.handle(myStack);
					} 
				
				}
		
			}
			amountOnStack = amountOnStack-1;
			label.setText(Float.toString(VRPNMinusOperator.subtracted()));
			myStack.printStack();
		}
	}
	
	class multiplyListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (currentNumber != "") {
				myStack.push(new VRPNStackItem(currentNumber));
				currentNumber = "";
				amountOnStack = amountOnStack+1;
			}
			VRPNOperator tempOp;
			for (int count = 1; count<2; count++) {
				if(opMap.get("*") != opMap.get("=")) {
					if ((tempOp = opMap.get("*")) != null) {
						tempOp.handle(myStack);
					} 
				
				}
		
			}
			amountOnStack = amountOnStack-1;
			label.setText(Float.toString(VRPNMultiplyOperator.multiplied()));
			myStack.printStack();
		}
	}
	
	class divideListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (currentNumber != "") {
				myStack.push(new VRPNStackItem(currentNumber));
				currentNumber = "";
				amountOnStack = amountOnStack+1;
			}
			VRPNOperator tempOp;
			for (int count = 1; count<2; count++) {
				if(opMap.get("/") != opMap.get("=")) {
					if ((tempOp = opMap.get("/")) != null) {
						tempOp.handle(myStack);
					} 
				
				}
		
			}
			amountOnStack = amountOnStack-1;
			label.setText(Float.toString(VRPNDivideOperator.divided()));
			myStack.printStack();
		}
	}
	
	class enterListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			myStack.push(new VRPNStackItem(currentNumber));
			currentNumber = "";
			amountOnStack = amountOnStack+1;
			
			//enter is used to add a number to the stack but not use an operator on it. it adds one to amountOnStack and
			//sets the current number to nothing, first pushing currentNumber onto the stack as a VRPNStackItem
		}
	}

}

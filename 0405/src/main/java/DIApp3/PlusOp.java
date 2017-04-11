package DIApp3;

import org.springframework.beans.factory.annotation.Autowired;

public class PlusOp implements OperatorBean { 
		@Autowired private Operand operand1;
		@Autowired private Operand operand2;

//		public PlusOp(Operand operand1, Operand operand2) {
//			this.operand1 = operand1;
//			this.operand2 = operand2;
//		}
		@Autowired
		public void setOperand1(Operand operand1) {
			this.operand1 = operand1;
		}
		
		@Autowired
		public void setOperand2(Operand operand2) {
			this.operand2 = operand2;
		}
		
		public Operand getOperand1() {
			return operand1;
		}
		
		public Operand getOperand2() {
			return operand2;
		}

		@Override
		public void calc() {
			int result = operand1.getValue() + operand2.getValue();
			System.out.println("result" + result);
		}
}

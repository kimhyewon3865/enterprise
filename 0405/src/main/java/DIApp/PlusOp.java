package DIApp;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PlusOp implements OperatorBean {
	//@Autowired 
	private Operand operand1;
	//@Autowired 
	private Operand operand2;

//	@Autowired
//	@Qualifier("op1")
//	@Autowired(required = false)
	@Resource(name="operand1")
	public void setOperand1(@Qualifier("") Operand operand1) {
		this.operand1 = operand1;
	}
	
//	@Autowired
//	@Qualifier("op2")
	@Resource(name="operand2")
	public void setOperand2(Operand operand2) {
		this.operand2 = operand2;
	}	

	@Override
	public void calc() {
		int result = operand1.getValue() + operand2.getValue();
		System.out.println("result" + result);
	}
}

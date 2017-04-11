package DIApp3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
	@Bean
	@Scope("prototype")
	public Operand operand() {
		Operand op = new Operand();
		op.setValue(30);
		return op;
	}

	@Bean
	public PlusOp operatorBean() {
//		PlusOp plusOp = new PlusOp(operand(), operand());
		PlusOp plusOp = new PlusOp();
//		plusOp.setOperand1(operand());
//		plusOp.setOperand2(operand());
		return plusOp;
	}
}
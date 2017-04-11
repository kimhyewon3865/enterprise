package DIApp3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIApp3 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		OperatorBean bean = (OperatorBean)ctx.getBean("operatorBean");
		System.out.println("op1>" + bean.getOperand1() + "//op2>" + bean.getOperand2());
		bean.calc();
	}
}

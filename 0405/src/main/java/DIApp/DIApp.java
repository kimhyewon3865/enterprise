package DIApp;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DIApp {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("classpath:appCtx.xml");
		OperatorBean bean = (OperatorBean)ctx.getBean("operatorBean");
		bean.calc();
		ctx.close();
	}
}


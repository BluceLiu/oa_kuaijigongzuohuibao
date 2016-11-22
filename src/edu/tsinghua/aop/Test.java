package edu.tsinghua.aop;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
/*
		Logger logger=Logger.getLogger(Test.class);
		logger.debug("׼�����÷���");
		IBiz ibiz=new Biz();
		logger.debug("ִ�з���");
		ibiz.buy(10, 5);
		logger.debug("�������");
*/
		BeanFactory bf=new ClassPathXmlApplicationContext("applicationContext.xml");
		IBiz biz=(IBiz) bf.getBean("zhenghe");
		biz.buy(2, 4);
		
	}

}

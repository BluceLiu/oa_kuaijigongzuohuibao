package edu.tsinghua.aop;

import java.lang.reflect.Method;

import org.aopalliance.aop.Advice;
//import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;
/*
public class LoggerAdvice implements MethodBeforeAdvice,Advice{
/*
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println(arg0+"\t"+arg0.getName());//������
		System.out.println(arg1);//�����Ĳ���
		System.out.println(arg2);//ʵ����
		
		Logger logger=Logger.getLogger(Test.class);
		logger.debug("׼�����÷���");		
		logger.debug("ִ�з���");				
		
	}

}
*/
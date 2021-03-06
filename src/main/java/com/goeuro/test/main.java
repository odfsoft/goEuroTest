package com.goeuro.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.goeuro.test.exception.GoEuroException;
import com.goeuro.test.exception.ParameterRequiredException;
import com.goeuro.test.service.PositionService;
import com.goeuro.test.service.impl.PositionServiceImpl;

public class main {	
	
	private static final Log logger = LogFactory.getLog(main.class);
	
	
	@SuppressWarnings("unused")
	 public static void main(String[] args) throws GoEuroException {
		if(args.length > 0){
			ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
			PositionService positionService = context.getBean(PositionService.class);
			positionService.exportPositionSearch(args[0]);
			logger.info("file exported");
		}else{
			throw new ParameterRequiredException("search criteria is required.");
		}
	 }
}

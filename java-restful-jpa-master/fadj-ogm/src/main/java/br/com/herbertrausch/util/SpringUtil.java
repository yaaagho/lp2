package br.com.herbertrausch.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringUtil {
	
	public static ApplicationContext getContext(){
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		return context;
	}

}

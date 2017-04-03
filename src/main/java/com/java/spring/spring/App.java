package com.java.spring.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.AppConfig;
import com.java.beans.AppConfig2;
import com.java.beans.Mundo;

public class App 
{
    public static void main( String[] args ){
    
   //ApplicationContext app = new ClassPathXmlApplicationContext("com/java/xml/beans.xml");
    //ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);
    	
    	AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext();
    	app.register(AppConfig.class);
    	app.register(AppConfig2.class);
    	app.refresh();
    	
    Mundo m = (Mundo)app.getBean("marte");
    System.out.println(m.getSaludo());
    ((ConfigurableApplicationContext)app).close();
}
 
}

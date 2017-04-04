package com.java.spring.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Person;

public class App 
{
    public static void main( String[] args ){
    
   ApplicationContext app = new ClassPathXmlApplicationContext("com/java/xml/beans.xml");
    
   Person people = (Person)app.getBean("person");
   
   System.out.println("the name of person is: " + people.getName()+
		   " From "+ people.getCountry().getName());
    	
    	
    ((ConfigurableApplicationContext)app).close();
}
 
}

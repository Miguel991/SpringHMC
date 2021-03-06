package com.java.spring.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Country;
import com.java.beans.Person;

public class App 
{
    public static void main( String[] args ){
    
   ApplicationContext app = new ClassPathXmlApplicationContext("com/java/xml/beans.xml");
    
   Person people = (Person)app.getBean("person");
   
   System.out.println("The name of person is: "+ people.getName());
   
 
   
    	
    	
    ((ConfigurableApplicationContext)app).close();
}
 
}

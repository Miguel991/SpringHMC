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
    
   Person people = (Person)app.getBean("PersonTag2");
   
   String nameCity;
   
   for(Country country: people.getCountrys()){
	   System.out.println(country.getName());
   }
   
    	
    	
    ((ConfigurableApplicationContext)app).close();
}
 
}

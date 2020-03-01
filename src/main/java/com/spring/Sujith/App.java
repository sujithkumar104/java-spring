package com.spring.Sujith;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Sujith.mobile.Samsung;
import com.spring.Sujith.vehicle.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		 Vehicle obj = (Vehicle)context.getBean("car"); 
		 obj.drive();
		 
   
		
		 Samsung s = (Samsung) context.getBean("samsung");
		 s.config();
		 
		 
    }
}

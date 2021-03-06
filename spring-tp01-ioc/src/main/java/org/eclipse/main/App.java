package org.eclipse.main;

import org.eclipse.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
        System.out.println( "Hello World!" );
        
        System.out.println();
        System.out.println( "-------------" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User u1 = context.getBean("u1", User.class);
        u1.afficher();
        
        System.out.println();
        System.out.println( "-------------" );
    }
}

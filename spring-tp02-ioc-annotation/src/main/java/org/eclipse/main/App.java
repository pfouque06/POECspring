package org.eclipse.main;

import org.eclipse.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        System.out.println();
        System.out.println( "------French.class-------" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        European e = (European) context.getBean(French.class);
        e.saluer();
        
        System.out.println();
        System.out.println( "------English.class-------" );
        e = (European) context.getBean(English.class);
        e.saluer();
          
        System.out.println();
        System.out.println( "------\"fr\"-------" );
        e = (European) context.getBean("fr");
        e.saluer();
        
        System.out.println();
        System.out.println( "------\"en\"-------" );
        e = (European) context.getBean("en");
        e.saluer();

        System.out.println();
        System.out.println( "-------------" );
    }
}

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
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println();
        System.out.println( "-------------" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Personne p = context.getBean("per", Personne.class);
        p.afficher();
        
        System.out.println();
        System.out.println( "-------------" );
        
        Voiture v = context.getBean("auto", Voiture.class);
        v.afficher();        
    }
}

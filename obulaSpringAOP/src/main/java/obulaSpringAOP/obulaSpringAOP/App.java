package obulaSpringAOP.obulaSpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext appContext=new ClassPathXmlApplicationContext("Customer.xml");
       CustomerService cust=(CustomerService) appContext.getBean("customerServiceProxy");
       System.out.println("*******************************");
       cust.printName();
       System.out.println("*******************************");
       cust.printURL();
       System.out.println("*******************************");
       try {
    	   cust.printThrowSxception();
       }catch(Exception e)
       {
    	   
       }
       
    }
}

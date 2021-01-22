package springtest.aoppoc.proxyFactoryBeanExample;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPXMLApplication {

    @Test
    public void TestAround() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"ProxyFactoryBeanExcample.xml"});
        CustomerService cust = (CustomerService) appContext.getBean("testAround");
        System.out.println("*************************");
        cust.printName();
        System.out.println("*************************");
    }

    @Test
    public void TestBefore() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"ProxyFactoryBeanExcample.xml"});
        CustomerService cust = (CustomerService) appContext.getBean("testBefore");
        System.out.println("*************************");
        cust.printName();
        System.out.println("*************************");
    }

    @Test
    public void TestAfter() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"ProxyFactoryBeanExcample.xml"});
        CustomerService cust = (CustomerService) appContext.getBean("testAfter");
        System.out.println("*************************");
        cust.printName();
        System.out.println("*************************");
    }

    @Test
    public void TestException() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"ProxyFactoryBeanExcample.xml"});
        CustomerService cust = (CustomerService) appContext.getBean("testException");
        System.out.println("*************************");
        try {
            cust.printThrowException();
        } catch(Exception e) {

        }
        System.out.println("*************************");
    }

    @Test
    public void TestRegx() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"ProxyFactoryBeanExcample.xml"});
        CustomerService cust = (CustomerService) appContext.getBean("testRegx");
        System.out.println("*************************");
        cust.printURL();
        System.out.println("*************************");
    }

    @Test
    public void TestThirdMethod() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"ProxyFactoryBeanExcampleAuto.xml"});
        CustomerService cust = (CustomerService) appContext.getBean("customerService");
        System.out.println("*************************");
        cust.printURL();
        System.out.println("*************************");
    }

}

package springtest.aoppoc.aspectxml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPXMLApplication {

    @Test
    public void testAddCustomerAround() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"aop_aspect.xml"});
        CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
        customer.addCustomerAround("mkyong");
    }

    @Test
    public void testPointCutBefore() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"aop_aspect.xml"});
        CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
        customer.addCustomer();
    }

    @Test
    public void testPointCutAfter() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"aop_aspect.xml"});
        CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
        customer.addCustomer();
    }

    @Test
    public void testPointCutAfterReturning() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"aop_aspect.xml"});
        CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
        customer.addCustomerReturnValue();
    }

    @Test
    public void testAssddCustomerThrowException() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"aop_aspect.xml"});
        CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
        try {
            customer.addCustomerThrowException();
        } catch (Exception e) {
        }
    }

    @Test
    public void testOtherFunction() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"aop_aspect.xml"});
        CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
        customer.testFunction();
    }

}

package springtest.javaconfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springtest.javaconfig.service.FunctionService;

public class JavaConfigApplication {

    @Test
    public void testSenaroio1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FunctionService functionService = context.getBean("functionService", FunctionService.class);
        functionService.getFunction1("aaa_cccc");
    }


    @Test
    public void testSenaroio2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FunctionService functionService = context.getBean("functionService", FunctionService.class);
        functionService.testFunction1("okvalue1", "okvalue2");
    }
}

package springtest.javaconfig.service;

import org.springframework.stereotype.Service;
import springtest.javaconfig.annotations.LockedCourse;

@Service
public class FunctionService2 {

    @LockedCourse(ledgerCode="ledgerCode_value1", username = "username_value1", orLockedByRequester = false)
    public void testFunction1(String name) {
        System.out.println("FunctionService::testFunction1");
    }

    public void getFunction1(String name) {
        System.out.println("FunctionService::getFunction1");
    }
}

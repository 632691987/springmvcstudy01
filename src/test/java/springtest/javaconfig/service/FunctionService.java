package springtest.javaconfig.service;

import org.springframework.stereotype.Service;
import springtest.javaconfig.annotations.LockedCourse;

@Service
public class FunctionService {

    @LockedCourse(ledgerCode="nameAAAA", username = "usernameBBB", orLockedByRequester = true)
    public void testFunction1(String nameAAAA, String usernameBBB) {
        System.out.println("FunctionService::testFunction1");
    }

    public void getFunction1(String name) {
        System.out.println("FunctionService::getFunction1");
    }
}

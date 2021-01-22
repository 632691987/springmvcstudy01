package java8.study.comparator_example;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingTest {

    private static List<Developer> getDevelopers() {
        List<Developer> result = new ArrayList<Developer>();
        result.add(new Developer("d", new BigDecimal("70000"), 33));
        result.add(new Developer("b", new BigDecimal("80000"), 20));
        result.add(new Developer("a", new BigDecimal("100000"), 10));
        result.add(new Developer("c", new BigDecimal("170000"), 55));
        return result;
    }

    @Test
    public void testSortByAge() {
        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("After Sort");

        //lambda here!
        listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
        listDevs.sort(Comparator.comparingInt(Developer::getAge));

        //java 8 only, lambda also, to print the List
        listDevs.forEach((developer)->System.out.println(developer));
    }

    @Test
    public void testSortByName() {
        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("After Sort");

        //lambda here!
        listDevs.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        listDevs.sort(Comparator.comparing(Developer::getName));

        //java 8 only, lambda also, to print the List
        listDevs.forEach((developer)->System.out.println(developer));
    }

}

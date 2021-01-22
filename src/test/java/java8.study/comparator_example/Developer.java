package java8.study.comparator_example;

import com.google.common.base.Objects;

import java.math.BigDecimal;
import java.util.StringJoiner;

public class Developer {

    private String name;
    private BigDecimal salary;
    private int age;

    public Developer(String name, BigDecimal salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return age == developer.age &&
                Objects.equal(name, developer.name) &&
                Objects.equal(salary, developer.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, salary, age);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Developer.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("salary=" + salary)
                .add("age=" + age)
                .toString();
    }
}

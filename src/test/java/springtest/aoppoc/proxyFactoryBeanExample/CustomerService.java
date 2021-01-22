package springtest.aoppoc.proxyFactoryBeanExample;

public class CustomerService {
    private String name;
    private String url;

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void printName() {
        System.out.println("Inside CustomerService Customer name : " + this.name);
    }

    public void printURL() {
        System.out.println("Inside CustomerService Customer website : " + this.url);
    }

    public void printThrowException() {
        throw new IllegalArgumentException();
    }

}

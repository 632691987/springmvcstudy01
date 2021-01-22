package java8.study.mapsorting_example;

import java.util.StringJoiner;

public class Hosting {

    private int Id;
    private String name;
    private long websites;

    public Hosting(int id, String name, long websites) {
        Id = id;
        this.name = name;
        this.websites = websites;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Hosting.class.getSimpleName() + "[", "]")
                .add("Id=" + Id)
                .add("name='" + name + "'")
                .add("websites=" + websites)
                .toString();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWebsites() {
        return websites;
    }

    public void setWebsites(long websites) {
        this.websites = websites;
    }
}

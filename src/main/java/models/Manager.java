package models;

/**
 * Created by abhisheks on 13-06-2020.
 */
public class Manager {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show(){
        System.out.println("manager display called");
    }
}

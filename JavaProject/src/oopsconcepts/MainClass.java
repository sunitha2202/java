package oopsconcepts;
import oopsconcepts.Data;

public class MainClass {
    public static void main(String[] args) {
        Data data = new Data();

        data.setName("John");
        data.setAge(25);

        System.out.println("Name: " + data.getName());
        System.out.println("Age: " + data.getAge());
    }
}


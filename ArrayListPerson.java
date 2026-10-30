import java.util.ArrayList;

public class ArrayListPerson {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("John", 30));
        list.add(new Person("Jane", 25));
        list.add(new Person("Bob", 40));
        list.add("My cousin");

        for (Person p : list) {
            System.out.println(p.name + " - " + p.age);
        }
    }
}
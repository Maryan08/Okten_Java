package Task3.classwork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "maryan");
        Person person2 = new Person(2, "Vasya");
        Person person3 = new Person(3, "Ivan");

        List<Pet> pets1 = new ArrayList<>();
        pets1.add(new Pet("Dog"));
        pets1.add(new Pet("Cat"));
        pets1.add(new Pet("Bird"));
        pets1.add(new Pet("Fish"));

        List<Pet> pets2 = new ArrayList<>();
        pets2.add(new Pet("Dog"));
        pets2.add(new Pet("Cat"));
        pets2.add(new Pet("Bird"));


        Zooclub zooclubs = new Zooclub();
        zooclubs.addZoo(person1, pets1);
        zooclubs.addZoo(person2, pets2);
        zooclubs.addZoo(person3,pets1);
        zooclubs.addAnimal(person1, "Lion");
        zooclubs.deleteAnimal(person1, "Dog");
        zooclubs.deleteMember(person1);
        zooclubs.deleteFromAll("Cat");
        System.out.println(zooclubs);


    }
}

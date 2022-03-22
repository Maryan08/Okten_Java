package Task4.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {


//        Створити колекцію Юзерів
//                - відсортувати  за  віком (зростання , а потім окремо спадання)
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)

        List<User> users=new ArrayList<>();
        users.add(new User(1,"Igor",23));
        users.add(new User(2,"Mishanya",34));
        users.add(new User(3,"Vasya",21));
        users.add(new User(4,"Maksum",53));
        users.add(new User(5,"Stepan",13));

        List<User> filterUserByAge1=users.stream().sorted((o1,o2)-> o1.getAge()- o2.getAge()).collect(toList());
        List<User> filterUserByAge2=users.stream().sorted((o1,o2)-> o2.getAge()- o1.getAge()).collect(toList());

        List<User> filterByLongName1=users.stream().sorted((o1,o2)->o1.getName().length()-o2.getName().length()).collect(toList());
        List<User> filterByLongName2=users.stream().sorted((o1,o2)->o2.getName().length()-o1.getName().length()).collect(toList());

        System.out.println(filterUserByAge1);
        System.out.println(filterUserByAge2);
        System.out.println(filterByLongName1);
        System.out.println(filterByLongName2);

//
//        створити ArrayList зі словами на 15-20 елементів.
//                - відсортувати його за алфавітом .
//                -- відфільтрувати слова довжиною менше 4 символів

        ArrayList<String> words=new ArrayList<>();
        words.add("Hey");
        words.add("Hello");
        words.add("Good");
        words.add("Paradise");
        words.add("School");
        words.add("Neighbor");
        words.add("Opportunity");
        words.add("Friend");
        words.add("Apple");
        words.add("Samsung");
        words.add("Hocco");
        words.add("Porsche");
        words.add("Volkswagen");
        words.add("Mercedes-Benz");
        words.add("Children");
        words.add("Hope");
        words.add("Dogs");

        List<String> sortetByAlph=words.stream().sorted((o1,o2)->o1.compareTo(o2)).filter(word->word.length()>4 ).collect(Collectors.toList());
        System.out.println(sortetByAlph);

//
//        - Створити масив з 20 числами.
//                - за допомогою способу sorted відсортувати масив.
//                -- за допомогою filter отримати числа кратні 3
//                -- за допомогою filter отримати числа кратні 10
//                -- перебрати (проітерувати) масив за допомогою foreach()
//                -- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші


        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(i+(i%3));
        }

        List<Integer> sortedArray = arrayList.stream().sorted().collect(Collectors.toList());
        List<Integer> filterArrayBy3 = arrayList.stream().filter(number->number%3==0).collect(Collectors.toList());
        List<Integer> filterArrayBy10 = arrayList.stream().filter(number->number%10==0).collect(Collectors.toList());
        arrayList.forEach(System.out::println);
        List<Integer> newArray = arrayList.stream().map((o)->o*3).collect(Collectors.toList());

        System.out.println(arrayList);
        System.out.println(sortedArray);
        System.out.println(filterArrayBy3);
        System.out.println(filterArrayBy10);
        System.out.println(newArray);
    }
}

package Task3.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Skills> skill1 = new HashSet<>();
        skill1.add(new Skills("java", 10));
        skill1.add(new Skills("python", 20));

        Set<Skills> skill2 = new HashSet<>();
        skill2.add(new Skills("java", 20));
        skill2.add(new Skills("python", 3));
        skill2.add(new Skills("HTML", 1));

        Set<Skills> skill3 = new HashSet<>();
        skill3.add(new Skills("HTML", 1));

        Set<Skills> skill4 = new HashSet<>();
        skill4.add(new Skills("java", 10));
        skill4.add(new Skills("python", 20));
        skill2.add(new Skills("HTML", 1));
        skill2.add(new Skills("JS", 12));

        User user1 = new User(5, "vasya", "pupkin", "jedkjdf@gmail.com", 31, Gender.Male, skill1, new Car("toyota", 2020, 230));
        User user2 = new User(2, "Ivan", "pup", "jedkjdf@gmail.com", 12, Gender.Male, skill2, new Car("toyota", 2020, 230));
        User user3 = new User(3, "petro", "pupin", "jedkjdf@gmail.com", 41, Gender.Male, skill3, new Car("toyota", 2020, 230));
        User user4 = new User(4, "Nadya", "pupn", "jedkjdf@gmail.com", 33, Gender.Female, skill1, new Car("toyota", 2020, 230));
        User user5 = new User(1, "maryan", "ppkin", "jedkjdf@gmail.com", 34, Gender.Male, skill4, new Car("toyota", 2020, 230));
        User user6 = new User(6, "serj", "pkn", "jedkjdf@gmail.com", 22, Gender.Male, skill4, new Car("toyota", 2020, 230));
        User user7 = new User(7, "yura", "pkin", "jedkjdf@gmail.com", 21, Gender.Male, skill1, new Car("toyota", 2020, 230));
        User user8 = new User(8, "Ira", "pup", "jedkjdf@gmail.com", 37, Gender.Female, skill3, new Car("toyota", 2020, 230));
        User user9 = new User(9, "vaya", "ppkin", "jedkjdf@gmail.com", 51, Gender.Male, skill2, new Car("toyota", 2020, 230));
        User user10 = new User(10, "vasya", "pukin", "jedkjdf@gmail.com", 71, Gender.Male, skill3, new Car("toyota", 2020, 230));

        HashSet<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if(user.getGender()==Gender.Male){
                iterator.remove();
            }
        }
        System.out.println(users);

        Set<User> treesets=new TreeSet<>();
        treesets.add(user1);
        treesets.add(user2);
        treesets.add(user3);
        treesets.add(user4);
        treesets.add(user5);
        treesets.add(user6);
        treesets.add(user7);
        treesets.add(user8);
        treesets.add(user9);
        treesets.add(user10);

        Iterator<User> iter = treesets.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }

}

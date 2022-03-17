package Task1.Classwork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> geo = new ArrayList<>();
        geo.add(-37.45254364563);
        geo.add(81.432454364564);
        Adress adress = new Adress("Kulas","Apt. 56","Lviv","1232424-242343",geo);
        Company company = new Company("MacDonald`s","flkasdgldjgflks","lefmaelgrfsle");
    User user=new User(1,"Leanne","Breat","Sunser@april.com",adress,"1-4234-13253","hildegard.org",company);
        System.out.println(user);
    }
}

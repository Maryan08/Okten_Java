package Task2.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book());
        printables.add(new Magazine());
        for (Printable printable : printables
        ) {
            printable.print();

        }


    }
}

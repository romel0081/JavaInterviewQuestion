import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        String names[] = {"Java", "Ruby", "Python", "C", "Java", "Ruby"};

        //Compare Each Elements

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate Number is ::::" + names[i]);
                }
            }
        }
        System.out.println("*************");

        //Using HashSet Collection: It stores Unique Value

        Set<String> store = new HashSet<String>();
        for (String name : names) {
            if (!store.add(name)) {
                System.out.println("Duplicate Element is :::" + name);


            }
        }
    }
}
import java.util.Arrays;
import java.util.HashSet;

public class UniqueNames {
    public static void main(String[] args) {
        String[] names = {"Aman", "Varchasv", "Divyansh", "Varchasv", "Aman"};

        HashSet<String> uniqueNames = new HashSet<>(Arrays.asList(names));

       
        String nameToCheck = "Varchasv";
        System.out.println("Is " + nameToCheck + " in the set? " + uniqueNames.contains(nameToCheck));

       
        System.out.println("Unique names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}

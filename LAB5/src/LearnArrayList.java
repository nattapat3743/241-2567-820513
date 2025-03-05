import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        List<Double> setNumber1 = new ArrayList<>();
// Add elements to the list
        setNumber1.add(12.0);
        setNumber1.add(20.0);
        setNumber1.add(15.0);
        System.out.println("List: " + setNumber1 + ", List Size = " + setNumber1.size());
// Access element from the list
        double number = setNumber1.get(2);
        System.out.println("Accessed Element: " + number);
// Remove element from the list
        double removedNumber = setNumber1.remove(1);
        System.out.println("Removed Element: " + removedNumber);
        System.out.println("List: " + setNumber1 + ", List Size = " + setNumber1.size());
    }
}
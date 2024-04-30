package Punto3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Punto3 {
    public static void main(String[] args) {
        List<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        weekDays.add(4, "Thursday");
        System.out.println("Inserted 'Thurday' at position 4.");

        System.out.println("Element at position 3: " + weekDays.get(3));
        System.out.println("Element at position 4: " + weekDays.get(4));

        System.out.println("First element: " + weekDays.get(0));
        System.out.println("Last element: " + weekDays.get(weekDays.size() - 1));

        if (weekDays.remove("Thursday")) {
            System.out.println("'Thursday' has been removed from the list.");
        } else {
            System.out.println("'Thursday' was not in the list.");
        }

        System.out.println("Displaying elements with iterator:");
        Iterator<String> iterator = weekDays.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        boolean found = false;
        for (String day : weekDays) {
            if (day.equalsIgnoreCase("Monday")) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("'Monday' has been found in the list.");
        } else {
            System.out.println("'Monday' has not been found in the list.");
        }

        weekDays.clear();
        System.out.println("All elements have been removed from the list.");
    }
}

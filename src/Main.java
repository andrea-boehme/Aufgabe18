import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<PersonWithHashCodeAndEquals, Integer> personToNumberMap = new HashMap<>();

        PersonWithHashCodeAndEquals max1 = new PersonWithHashCodeAndEquals(18, "Max", "Mustermann");
        personToNumberMap.put(max1, 1234);
        System.out.println(personToNumberMap.get(max1));

        PersonWithHashCodeAndEquals max2 = new PersonWithHashCodeAndEquals(18, "Max", "Mustermann");
        System.out.println(personToNumberMap.get(max2));
    }
}
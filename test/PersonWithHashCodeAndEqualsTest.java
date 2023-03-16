
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

// equals() und hashCode() Methoden braucht man nicht zu testen, da nur Java Funktionalitäten
class PersonWithHashCodeAndEqualsTest {

    private PersonWithHashCodeAndEquals person;
    private final double DELTA = 0.01;

    @BeforeEach
    void initPerson() {
        person = new PersonWithHashCodeAndEquals(22, "Name", "Surname");
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        assertEquals(22, person.age, DELTA);
    }

    @Test
    void testNotEquals() {
        assertNotEquals(30, person.age, DELTA);
    }

    @Test
    void testHashCode() {
        Map<PersonWithHashCodeAndEquals, Integer> personMap = new HashMap<>();

        PersonWithHashCodeAndEquals max1 = new PersonWithHashCodeAndEquals(30, "Max", "Mustermann");
        PersonWithHashCodeAndEquals max2 = new PersonWithHashCodeAndEquals(30, "Max", "Mustermann");
        personMap.put(max1, 1234);
        assertEquals(1234, personMap.get(max2));
    }
    // zweites Objekt (max2) testet ob gleichen bucket
}
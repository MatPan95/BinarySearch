import org.binarysearch.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void testBinarySearchInt() {
        ArrayBinarySearch<Integer> binarySearch = new ArrayBinarySearch<>();
        Integer[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // Test cases
        assertEquals(3, binarySearch.binarySearch(sortedArray, 7)); // Element is at index 3
        assertEquals(-1, binarySearch.binarySearch(sortedArray, 4)); // Element is not in the array
        assertEquals(0, binarySearch.binarySearch(sortedArray, 1)); // Element is at the beginning of the array
        assertEquals(9, binarySearch.binarySearch(sortedArray, 19)); // Element is at the end of the array
        assertEquals(-1, binarySearch.binarySearch(sortedArray, 20)); // Element is larger than the largest element in the array
    }

    @Test
    public void testBinarySearchString() {
        ArrayBinarySearch<String> binarySearch = new ArrayBinarySearch<>();
        String[] sortedArray = {"apple", "banana", "cherry", "date", "fig", "grape", "kiwi"};

        // Test cases
        assertEquals(0, binarySearch.binarySearch(sortedArray, "apple")); // Element is at index 0
        assertEquals(2, binarySearch.binarySearch(sortedArray, "cherry")); // Element is at index 2
        assertEquals(6, binarySearch.binarySearch(sortedArray, "kiwi")); // Element is at index 6
        assertEquals(-1, binarySearch.binarySearch(sortedArray, "orange")); // Element is not in the array
        assertEquals(-1, binarySearch.binarySearch(sortedArray, "avocado")); // Element is not in the array
        assertEquals(-1, binarySearch.binarySearch(sortedArray, "zucchini")); // Element is larger than the largest element in the array
    }

    @Test
    public void testBinarySearchPerson() {
        ArrayBinarySearch<Person> binarySearch = new ArrayBinarySearch<>();

        Person[] sortedArray = {
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35),
                new Person("David", 40),
                new Person("Eve", 45)
        };

        // Test cases
        assertEquals(0, binarySearch.binarySearch(sortedArray, new Person("Alice", 25))); // // Element is at index 0
        assertEquals(1, binarySearch.binarySearch(sortedArray, new Person("Bob", 30))); // // Element is at index 1
        assertEquals(4, binarySearch.binarySearch(sortedArray, new Person("Eve", 45))); // // Element is at index 4
        assertEquals(-1, binarySearch.binarySearch(sortedArray, new Person("Frank", 50))); // Element is not in the array
        assertEquals(-1, binarySearch.binarySearch(sortedArray, new Person("Zara", 20))); // Element is smaller than the smallest element in the array
    }
}


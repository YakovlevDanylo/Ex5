import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "apple", "apple", "mango", "banana", "banana", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry",
                "mango", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "apple", " pea", "peanut", "pear",
                "mango", "pineapple", "pumpkin", "potato"));

        System.out.println(countOccurance(words, "banana"));
        int[] arr = {0, 1, 1, 3, 5, 5, 6, 5};
        System.out.println(toList(arr));
        System.out.println(findUnique(toList(arr)));
    }

    public static int countOccurance(ArrayList<String> words, String compareWord) {
        int counter = 0;
        for (String word : words) {
            if (word.equals(compareWord)) {
                counter++;
            }
        }
        return counter;
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            numbers.add(array[i]);
        }
        return numbers;
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        Set<Integer> uniqueSet = new HashSet<>(numbers);

        return new ArrayList<>(uniqueSet);
    }
}
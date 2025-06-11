import java.util.*;

public class AnagramGrouping {

    public static void main(String[] args) {
        String[] words = {"PAT", "TAP", "STUDENTS", "STUDENT", "LAMP", "LENS"};

        Map<String, List<String>> groups = new HashMap<>();

        for (String word : words) {
            // Sort the characters of the word to use as a key for the map
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Check if the sorted word already exists in the map
            if (groups.containsKey(sortedWord)) {
                // If it exists, add the word to the corresponding group
                groups.get(sortedWord).add(word);
            } else {
                // If it doesn't exist, create a new group with this word
                List<String> newGroup = new ArrayList<>();
                newGroup.add(word);
                groups.put(sortedWord, newGroup);
            }
        }

        // Print the groups
        for (List<String> group : groups.values()) {
            System.out.println(group);
        }
    }
}

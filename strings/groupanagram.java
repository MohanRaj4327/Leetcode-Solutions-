import java.util.*;

class groupanagram {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("eat");
        strs.add("tea");
        strs.add("tan");
        strs.add("ate");
        strs.add("nat");
        strs.add("bat");

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert word to sorted string
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // If key is not present, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add the word to its group
            map.get(key).add(word);
        }

        // Get all groups from the map
        List<List<String>> result = new ArrayList<>(map.values());

        // Print the result
        System.out.println(result);
    }
}
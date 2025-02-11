import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        
        Map<Character, Integer> charMap = new HashMap<>();
        for (char letter : str.toCharArray()) {
            charMap.put(letter, charMap.getOrDefault(letter, 0) + 1 );
        }
        List<Map.Entry<Character, Integer>> listedMap = new ArrayList<>(charMap.entrySet());
        listedMap.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        return listedMap.get(0).getKey();
    }
}

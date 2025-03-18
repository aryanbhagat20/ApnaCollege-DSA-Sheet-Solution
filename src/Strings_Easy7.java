import java.util.* ;
//Print all the duplicate characters in a string - Ola + Amdocs IQ Interview Qs
//GFG
//Time : O(n) and Space : O(1) for the Fixed size map.

public class Strings_Easy7 {
    public static void printDuplicateCharactersWithCount(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for(char ch : str.toCharArray()){
            charCountMap.put(ch, charCountMap.getOrDefault(ch , 0) + 1);
        }

        // Print characters with frequency > 1 (duplicates)
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ", count = " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        printDuplicateCharactersWithCount(str);
    }
}



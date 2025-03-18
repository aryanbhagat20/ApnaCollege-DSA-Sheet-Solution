import java.util.* ;
//Convert a sentence into its equivalent mobile numeric keypad sequence - Adobe + Grofers + Dunzo Interview Qs
//GFG
//Time : O(n) and Space : O(1) for the Fixed size map.

public class Strings_Easy6 {
        // Mapping of characters to their corresponding keypad sequences
        private static final Map<Character, String> keypadMap = new HashMap<>();

        static {
            keypadMap.put('A', "2");
            keypadMap.put('B', "22");
            keypadMap.put('C', "222");
            keypadMap.put('D', "3");
            keypadMap.put('E', "33");
            keypadMap.put('F', "333");
            keypadMap.put('G', "4");
            keypadMap.put('H', "44");
            keypadMap.put('I', "444");
            keypadMap.put('J', "5");
            keypadMap.put('K', "55");
            keypadMap.put('L', "555");
            keypadMap.put('M', "6");
            keypadMap.put('N', "66");
            keypadMap.put('O', "666");
            keypadMap.put('P', "7");
            keypadMap.put('Q', "77");
            keypadMap.put('R', "777");
            keypadMap.put('S', "7777");
            keypadMap.put('T', "8");
            keypadMap.put('U', "88");
            keypadMap.put('V', "888");
            keypadMap.put('W', "9");
            keypadMap.put('X', "99");
            keypadMap.put('Y', "999");
            keypadMap.put('Z', "9999");
            keypadMap.put(' ', "0"); // Space maps to 0
        }

        public static String convertToKeypadSequence(String sentence) {
            StringBuilder sequence = new StringBuilder();

            // Convert each character to its corresponding keypad sequence
            for (char c : sentence.toUpperCase().toCharArray()) {
                sequence.append(keypadMap.getOrDefault(c, ""));
            }
            return sequence.toString();
        }

        public static void main(String[] args) {
            String sentence = "HELLO WORLD";
            String keypadSequence = convertToKeypadSequence(sentence);
            System.out.println("Input String: " + sentence);
            System.out.println("Keypad Sequence: " + keypadSequence);
        }
    }




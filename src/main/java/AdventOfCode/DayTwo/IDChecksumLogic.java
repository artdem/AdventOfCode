package AdventOfCode.DayTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDChecksumLogic {

    public List<String> stringSplitter(String string) {
        List<String> inputList = new ArrayList<>();
        String ids[] = string.split("\n");

        for (int i = 0; i <= ids.length - 1; i++) {
            inputList.add(ids[i]);
        }
        return inputList;
    }

    public List<String> checkForDoubles(String string) {
        List<String> inputIds = stringSplitter(string);
        List<String> idsWithDoubles = new ArrayList<>();

        for (int i = 0; i <= inputIds.size() - 1; i++) {
            String inputString = inputIds.get(i);
            char characters[] = inputString.toCharArray();
            Map<Character, Integer> charMapDoubles = new HashMap<>();
            for (Character ch : characters) {
                if (charMapDoubles.containsKey(ch)) {
                    charMapDoubles.put(ch, charMapDoubles.get(ch) + 1);
                } else {
                    charMapDoubles.put(ch, 1);
                }
            }
            if (charMapDoubles.containsValue(2)){
                idsWithDoubles.add(inputString);
            }
        }

        return idsWithDoubles;
    }

    public List<String> checkForTriples(String string) {
        List<String> inputIds = stringSplitter(string);
        List<String> idsWithTriples = new ArrayList<>();

        for (int i = 0; i <= inputIds.size() - 1; i++) {
            String inputString = inputIds.get(i);
            char characters[] = inputString.toCharArray();
            Map<Character, Integer> charMapTriples = new HashMap<>();
            for (Character ch : characters) {
                if (charMapTriples.containsKey(ch)) {
                    charMapTriples.put(ch, charMapTriples.get(ch) + 1);
                } else {
                    charMapTriples.put(ch, 1);
                }
            }
            if (charMapTriples.containsValue(3)){
                idsWithTriples.add(inputString);
            }
        }
        return idsWithTriples;
    }

    public int idsChecksum(String string) {
        List<String> doubles = checkForDoubles(string);
        List<String> triples = checkForTriples(string);

        return doubles.size() * triples.size();
    }


}

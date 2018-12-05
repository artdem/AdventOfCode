package AdventOfCode.DayTwo;

import com.sun.deploy.util.StringUtils;

import java.util.*;

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
            if (charMapDoubles.containsValue(2)) {
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
            if (charMapTriples.containsValue(3)) {
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

    public int stringDistance(String str1, String str2) {
        int i = 0;
        int count = 0;
        while (i <= str1.length() - 1) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
                i++;
            }
            i++;
        }
        return count;
    }

    public List<String> possibleBoxes(String string) {
        List<String> inputBoxes = stringSplitter(string);
        List<String> possibleBoxes = new ArrayList<>();

        for (String str : inputBoxes) {
            Iterator<String> inputBoxesIterator = inputBoxes.iterator();
            while (inputBoxesIterator.hasNext()) {
                if (stringDistance(str, inputBoxesIterator.next()) == 1) {
                    possibleBoxes.add(str);
                }
            }
        }
        return possibleBoxes;
    }

    public String charsInCommon(String string) {
        String str1 = possibleBoxes(string).get(0);
        String str2 = possibleBoxes(string).get(1);
        List<Character> charsInCommon = new ArrayList<>();
        int i = 0;

        while (i <= str1.length() - 1) {
            if (str1.charAt(i) == str2.charAt(i)) {
                charsInCommon.add(str1.charAt(i));
                i++;
            } else {
                i++;
            }
        }
        return charsInCommon.toString();
    }

}

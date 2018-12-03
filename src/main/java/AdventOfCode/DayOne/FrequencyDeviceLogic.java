package AdventOfCode.DayOne;

import java.util.ArrayList;
import java.util.List;

public class FrequencyDeviceLogic {

    public List<Integer> parsingInput(String string) {
        List<Integer> inputNumbers = new ArrayList<>();
        String numbers[] = string.split("\n");

        for (int i = 0; i <= numbers.length - 1; i++) {
            inputNumbers.add(Integer.parseInt(numbers[i]));
        }
        return inputNumbers;
    }

    public int taskOne(String string) {
        parsingInput(string);

        int currentFrequency = 0;
        for (int i : parsingInput(string)) {
            currentFrequency = currentFrequency + i;
        }
        return currentFrequency;
    }

    public int taskTwo(String string) {
        parsingInput(string);

        int frequencyCalibrator = 0;
        List<Integer> frequencies = new ArrayList<>();
        frequencies.add(frequencyCalibrator);
        while (true) {
            for (int i : parsingInput(string)) {
                frequencyCalibrator = frequencyCalibrator + i;
                if (!frequencies.contains(frequencyCalibrator)) {
                    frequencies.add(frequencyCalibrator);
                } else {
                    return frequencyCalibrator;
                }
            }
        }
    }
}

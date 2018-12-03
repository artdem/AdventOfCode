package AdventOfCode.DayOne;

import org.junit.Assert;
import org.junit.Test;

public class FrequencyDeviceTest {

    FrequencyDeviceLogic frequencyDeviceLogic = new FrequencyDeviceLogic();

    @Test
    public void parsingInputTest(){
        //given
        String string = "+1\n" +
                "-2\n" +
                "+3\n" +
                "+4\n" +
                "-5";

        //when
        frequencyDeviceLogic.parsingInput(string);

        //then
        Assert.assertTrue(frequencyDeviceLogic.parsingInput(string).get(3) == 4);
    }

    @Test
    public void taskOneFirstTest() {
        //given
        String input = "+1\n" +
                "+1\n" +
                "+1";

        //when
        frequencyDeviceLogic.taskOne(input);

        //then
        Assert.assertTrue(frequencyDeviceLogic.taskOne(input) == 3);
    }

    @Test
    public void taskOneSecondTest() {
        //given
        String input = "+1\n" +
                "+1\n" +
                "-2";

        //when
        frequencyDeviceLogic.taskOne(input);

        //then
        Assert.assertTrue(frequencyDeviceLogic.taskOne(input) == 0);
    }

    @Test
    public void taskOneThirdTest() {
        //given
        String input = "-1\n" +
                "-2\n" +
                "-3";

        //when
        frequencyDeviceLogic.taskOne(input);

        //then
        Assert.assertTrue(frequencyDeviceLogic.taskOne(input) == -6);
    }

    @Test
    public void taskTwoFirstTest(){
        //given
        String string = "+3\n" +
                "+3\n" +
                "+4\n" +
                "-2\n" +
                "-4";

        //when
        frequencyDeviceLogic.taskTwo(string);

        //then
        System.out.println(frequencyDeviceLogic.taskTwo(string));
        Assert.assertTrue(frequencyDeviceLogic.taskTwo(string) == 10);
    }

    @Test
    public void taskTwoSecondTest(){
        //given
        String string = "-6\n" +
                "+3\n" +
                "+8\n" +
                "+5\n" +
                "-6";

        //when
        frequencyDeviceLogic.taskTwo(string);

        //then
        System.out.println(frequencyDeviceLogic.taskTwo(string));
        Assert.assertTrue(frequencyDeviceLogic.taskTwo(string) == 5);
    }

    @Test
    public void taskTwoThirdTest(){
        //given
        String string = "+7\n" +
                "+7\n" +
                "-2\n" +
                "-7\n" +
                "-4";

        //when
        frequencyDeviceLogic.taskTwo(string);

        //then
        System.out.println(frequencyDeviceLogic.taskTwo(string));
        Assert.assertTrue(frequencyDeviceLogic.taskTwo(string) == 14);
    }

}
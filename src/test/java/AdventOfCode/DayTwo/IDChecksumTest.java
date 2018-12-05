package AdventOfCode.DayTwo;

import org.junit.Assert;
import org.junit.Test;

public class IDChecksumTest {

    IDChecksumLogic idChecksumLogic = new IDChecksumLogic();

    @Test
    public void stringSplitterTest(){
        //given
        String string = "abcdef\n" +
                "bababc\n" +
                "abbcde\n" +
                "abcccd\n" +
                "aabcdd\n" +
                "abcdee\n" +
                "ababab";

        //when
        idChecksumLogic.stringSplitter(string);

        //then
        Assert.assertTrue(idChecksumLogic.stringSplitter(string).get(2).equals("abbcde"));
        Assert.assertTrue(idChecksumLogic.stringSplitter(string).get(6).equals("ababab"));
    }

    @Test
    public void checkForDoubles(){
        //given
        String string = "abcdef\n" +
                "bababc\n" +
                "abbcde\n" +
                "abcccd\n" +
                "aabcdd\n" +
                "abcdee\n" +
                "ababab";

        //when
        idChecksumLogic.checkForDoubles(string);

        //then
        Assert.assertTrue(idChecksumLogic.checkForDoubles(string).get(2).equals("aabcdd"));

    }

    @Test
    public void checkForTriples(){
        //given
        String string = "abcdef\n" +
                "bababc\n" +
                "abbcde\n" +
                "abcccd\n" +
                "aabcdd\n" +
                "abcdee\n" +
                "ababab";

        //when
        idChecksumLogic.checkForTriples(string);

        //then
        Assert.assertTrue(idChecksumLogic.checkForTriples(string).get(1).equals("abcccd"));
    }

    @Test
    public void idsChecksum(){
        //given
        String string = "abcdef\n" +
                "bababc\n" +
                "abbcde\n" +
                "abcccd\n" +
                "aabcdd\n" +
                "abcdee\n" +
                "ababab";

        //when
        idChecksumLogic.idsChecksum(string);

        //then
        Assert.assertTrue(idChecksumLogic.idsChecksum(string) == 12);
    }

    @Test
    public void stringDistanceTest(){
        //given
        String str1 = "fghij";
        String str2 = "fguij";

        //when
        int i = idChecksumLogic.stringDistance(str1, str2);

        //then
        Assert.assertTrue(i == 1);
    }

    @Test
    public void possibleBoxesTest(){
        //given
        String string = "abcde\n" +
                "fghij\n" +
                "klmno\n" +
                "pqrst\n" +
                "fguij\n" +
                "axcye\n" +
                "wvxyz";

        //when
        idChecksumLogic.possibleBoxes(string);

        //then
        Assert.assertTrue(idChecksumLogic.possibleBoxes(string).size() == 2);
    }



}

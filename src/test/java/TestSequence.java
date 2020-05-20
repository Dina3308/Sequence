import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class TestSequence {
    private StringBuilder[] arr = {new StringBuilder("1"), new StringBuilder("11"), new StringBuilder("21"),
            new StringBuilder("1211"), new StringBuilder("111221"), new StringBuilder("312211"),  new StringBuilder("13112221"),
            new StringBuilder("1113213211"),  new StringBuilder("31131211131221"),  new StringBuilder("13211311123113112211")};
    @Test
    public void testGetListOfSequence5() throws Exception {
        Sequence sequence = new Sequence(5);
        LinkedList<StringBuilder> expected = sequence.getListOfSequence();
        LinkedList<StringBuilder> actual = new LinkedList<>();
        Collections.addAll(actual, Arrays.copyOf(arr, 5));
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetListOfSequence1() throws Exception {
        Sequence sequence = new Sequence(1);
        LinkedList<StringBuilder> expected = sequence.getListOfSequence();
        LinkedList<StringBuilder> actual = new LinkedList<>();
        actual.addLast(new StringBuilder("1"));
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetListOfSequence10() throws Exception {
        Sequence sequence = new Sequence(10);
        LinkedList<StringBuilder> expected = sequence.getListOfSequence();
        LinkedList<StringBuilder> actual = new LinkedList<>();
        Collections.addAll(actual, arr);
        Assert.assertEquals(actual, expected);
    }
}

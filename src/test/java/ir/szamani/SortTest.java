package ir.szamani;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class SortTest {

    @Test
    public void testMergeSort() {
        int[] expected = createArray();
        int[] actual = Arrays.copyOf(expected, expected.length);
        Arrays.sort(expected);

        Sort sort = new Sort();
        sort.doMergeSort(actual);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSort() {
        int[] expected = createArray();
        int[] actual = Arrays.copyOf(expected, expected.length);
        Arrays.sort(expected);

        Sort sort = new Sort();
        sort.doBubbleSort(actual);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testHeapSort() {
        int[] expected = createArray();
        int[] actual = Arrays.copyOf(expected, expected.length);
        Arrays.sort(expected);

        Sort sort = new Sort();
        sort.doHeapSort(actual);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertionSort() {
        int[] expected = createArray();
        int[] actual = Arrays.copyOf(expected, expected.length);
        Arrays.sort(expected);

        Sort sort = new Sort();
        sort.doInsertionSort(actual);

        Assert.assertArrayEquals(expected, actual);
    }

    private int[] createArray() {
        int[] array = new int[50];
        Random random = new Random();
        for (int i = 0; i < 50; i++)
            array[i] = random.nextInt();
        return array;
    }
}

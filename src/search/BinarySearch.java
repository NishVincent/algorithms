package search;

import org.jetbrains.annotations.Contract;

// Binary search in a sorted array   Olog(n)
// This can be only performed on a sorted array
public class BinarySearch {

    @Contract(pure = true)
    private int binarySearch(int k, int[] array) {
        int lowerBound = 0;
        int upperBound = array.length - 1;
        while (lowerBound <= upperBound) {
            int meanValue = (lowerBound + upperBound)/2;
            if(k > array[meanValue])
                lowerBound = meanValue + 1;
            else if (k < array[meanValue])
                upperBound = meanValue - 1;
            else
                return meanValue;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 1, 4, 8, 9, 16, 32, 64, 98, 112, 14, 156, 176, 177, 189};
        System.out.println(new BinarySearch().binarySearch(98, array));

    }
}

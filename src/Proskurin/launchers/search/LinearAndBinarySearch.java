package Proskurin.launchers.search;

import Proskurin.algorithms.searches.BinarySearch;
import Proskurin.algorithms.searches.LinearSearch;

public class LinearAndBinarySearch {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        LinearSearch linearSearch = new LinearSearch(array);
        linearSearch.search(5);
        BinarySearch binarySearch = new BinarySearch(array);
        binarySearch.search(4);
    }
}

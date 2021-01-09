package Proskurin.launchers.sorts;

import Proskurin.algorithms.sorts.BinaryInsertionSort;
import Proskurin.algorithms.sorts.InsertionSort;
import Proskurin.algorithms.sorts.Sort;
import Proskurin.utils.sort.SortUtils;

import java.util.Arrays;

public class InsertionAndBinaryInsertion {

    public static void main(String[] args) {
        Sort insertionSort = new InsertionSort();
        Sort binaryInsertionSort = new BinaryInsertionSort();
        Integer[] array = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(array));
        binaryInsertionSort.sort(array);
        System.out.println(Arrays.toString(array));



        SortUtils.sortRandomArray(insertionSort,10);
        SortUtils.sortRandomArray(binaryInsertionSort,10);

        SortUtils.sortRandomArray(insertionSort, 50);
        SortUtils.sortRandomArray(insertionSort, 50);
        SortUtils.sortRandomArray(insertionSort, 50);

        SortUtils.sortRandomArray(binaryInsertionSort, 50);
        SortUtils.sortRandomArray(binaryInsertionSort, 50);
        SortUtils.sortRandomArray(binaryInsertionSort, 50);

    }
}

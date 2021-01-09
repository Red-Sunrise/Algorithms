package Proskurin.launchers.sorts;

import Proskurin.algorithms.sorts.*;
import Proskurin.utils.sort.SortUtils;

public class QuickAndMergeSort {
    private static final int N = 10;

    public static void main(String[] args) {
        Sort quickSort = new QuickSort();
        Sort mergeSort = new MergeSort();
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        mergeSort.sort(arr);
        
        SortUtils.printAllTypeArray(mergeSort, N);
        SortUtils.printAllTypeArray(quickSort, N);
    }
}

package Proskurin.launchers.sorts;

import Proskurin.algorithms.sorts.*;
import Proskurin.utils.sort.SortUtils;

public class BubbleAndShellSort {
    public static void main(String[] args) {
        Sort bubbleSort = new BubbleSort();
        Sort shellSort = new ShellSort();
        int n=10;
        SortUtils.sortRandomArray(bubbleSort,n);
        SortUtils.sortReversedArray(bubbleSort,n);
        SortUtils.sortOrderedArray(bubbleSort,n);
        SortUtils.sortRandomArray(shellSort,n);
        SortUtils.sortReversedArray(shellSort,n);
        SortUtils.sortOrderedArray(shellSort,n);
    }
}

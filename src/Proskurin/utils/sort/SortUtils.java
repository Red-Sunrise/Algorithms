package Proskurin.utils.sort;

import Proskurin.algorithms.sorts.Sort;

import java.util.Arrays;
import java.util.Collections;

public class SortUtils {
    public static void sortRandomArray(Sort nameSort, int n) {
        printNameSort(nameSort);
        Integer[] array = createArray(n);
        Collections.shuffle(Arrays.asList(array));
        printArray(nameSort,array);
    }

    public static void sortReversedArray(Sort nameSort, int n){
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("<------ Перевернутый массив ------>");
        printNameSort(nameSort);
        Integer[] array = createArray(n);
        Collections.reverse(Arrays.asList(array));
        printArray(nameSort,array);
    }

    public static void sortOrderedArray(Sort nameSort, int n){
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("<------ Упорядоченный массив ------>");
        printNameSort(nameSort);
        Integer[] array = createArray(n);
        printArray(nameSort,array);
    }

    private static void printNameSort(Sort nameSort){
        System.out.println("----------------------------------------------");
        System.out.println("<------ " + nameSort.toString() + " ------>");
    }

    private static Integer[] createArray(int n){
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }

    private static void printArray(Sort nameSort, Integer[] array){
        System.out.println(Arrays.toString(array));
        nameSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void printAllTypeArray(Sort nameSort,int n){
        System.out.println();
        sortRandomArray(nameSort,n);
        sortReversedArray(nameSort,n);
        sortOrderedArray(nameSort,n);
    }

}

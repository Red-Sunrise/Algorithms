package Proskurin.algorithms.sorts;

public class MergeSort implements Sort {
    private static int compare = 1;

    public static int mergeSort(Integer[] array, int n) {
        if (n < 2) {
            return compare;
        }
        int middle = n / 2;
        Integer[] l = new Integer[middle];
        Integer[] r = new Integer[n - middle];
        for (int i = 0; i < middle; i++) {
            l[i] = array[i];
        }
        for (int i = middle; i < n; i++) {
            r[i - middle] = array[i];
        }
        mergeSort(l, middle);
        mergeSort(r, n - middle);
        merge(array, l, r, middle, n - middle);
        return compare;
    }

    private static void merge(Integer[] array, Integer[] l, Integer[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            compare++;
            if (l[i] <= r[j]) {
                array[k++] = l[i++];
            } else {
                array[k++] = r[j++];
            }
        }
        while (i < left) {
            array[k++] = l[i++];
        }
        while (j < right) {
            array[k++] = r[j++];
        }
    }

    @Override
    public void sort(Integer[] arr) {
        mergeSort(arr, arr.length);
        System.out.println("Количество сравнений = " + compare);
        compare = 1;
    }

    @Override
    public String toString() {
        return "Сортировка слиянием";
    }
}

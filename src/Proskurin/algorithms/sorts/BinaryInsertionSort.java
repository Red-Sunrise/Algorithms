package Proskurin.algorithms.sorts;

public class BinaryInsertionSort implements Sort {
        private int count;

    private int BinarySearch(Integer[] a, int left, int right, int key) {
        int mid;
        this.count++;
        if (left == right)
            return left;

        mid = left + (right - left) / 2;
        if (key > a[mid])
            return BinarySearch(a, mid + 1, right, key);
        else if (key < a[mid])
            return BinarySearch(a, left, mid, key);
        return mid;
    }

    public void sort(Integer[] array) {
        int ins, i, j;
        int tmp;
        int compare = 0;
        for (i = 1; i < array.length; i++) {
            ins = BinarySearch(array, 0, i, array[i]);
            if (ins < i) {
                tmp = array[i];
                for (j = i - 1; j >= ins; j--) {
                    array[j + 1] = array[j];
                }
                array[ins] = tmp;
            }
        }
        int sumCompare=compare+this.count;
        System.out.println("Количество сравнений = " + sumCompare);
        this.count=0;
    }

    @Override
    public String toString() {
        return "Сортировка бинарными вставками";
    }
}

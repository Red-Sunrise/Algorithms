package Proskurin.algorithms.sorts;

public class QuickSort implements Sort {
    private static int compare = 0;

    public static int quickSort(Integer[] array, int from, int to) {
        if (from < to) {
            int right = to;
            int left = from;
            int pivot = array[from];

            while (left <= right) {
                while (array[left] < pivot) {
                    compare++;
                    left++;
                }
                while (array[right] > pivot) {
                    compare++;
                    right--;
                }
                if (left <= right) {
                    int temp = array[right];
                    array[right] = array[left];
                    array[left] = temp;
                    left++;
                    right--;
                }
            }
            int divideIndex = left;
            quickSort(array, from, divideIndex - 1);
            quickSort(array, divideIndex, to);
        }
        return compare;
    }

    @Override
    public void sort(Integer[] arr) {
        System.out.println("Количество сравнений = " + quickSort(arr, 0, arr.length - 1));
        compare=0;
    }
    @Override
    public String toString() {
        return "Быстрая сортировка";
    }
}

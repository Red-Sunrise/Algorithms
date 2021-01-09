package Proskurin.algorithms.sorts;

public class BubbleSort implements Sort {

    @Override
    public void sort(Integer[] arr) {
            int size = arr.length;
            int compare = 1;
            for (int i = 1; i < size - 1; i++) {
                for (int j = size - 1; j >= i; j--) {
                    compare++;
                    if (arr[j - 1] > arr[j]) {
                        int temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        System.out.println("Количество сравнений = " + compare);
    }

    @Override
    public String toString() {
        return "Сортировка пузырьком";
    }
}

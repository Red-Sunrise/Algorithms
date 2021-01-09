package Proskurin.algorithms.sorts;

public class InsertionSort implements Sort {

    public void sort(Integer[] arr) {
        int compare = 0;
        for (int i = 1; i < arr.length; i++) {
            compare++;
            for (int j = i; j > 0; j--) {
                if(arr[j-1]>arr[j]){
                    compare++;
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
        return "Сортировка вставками";
    }
}

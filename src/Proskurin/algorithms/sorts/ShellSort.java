package Proskurin.algorithms.sorts;

public class ShellSort implements Sort {
    @Override
    public void sort(Integer[] arr) {//выбор промежутка Кнута
        int gap = 1, i, j, len = arr.length;
        int temp;
        int compare = 1;
        while (gap < len / 3) {
            gap = gap * 3 + 1;
        }
        for (; gap > 0; gap /= 3) {
            for (i = gap; i < len; i++) {
                temp = arr[i];
                compare++;
                for (j = i - gap; j >= 0 && arr[j] > temp; j -= gap) {
                    arr[j + gap] = arr[j];
                    compare++;
                }
                arr[j + gap] = temp;
            }
        }
        System.out.println("Количество сравнений = " + compare);
    }

    @Override
    public String toString() {
        return "Сортировка Шелла";
    }
}

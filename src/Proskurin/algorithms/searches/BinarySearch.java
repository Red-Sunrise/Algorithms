package Proskurin.algorithms.searches;

import Proskurin.utils.search.SearchUtils;

import java.util.Arrays;

public class BinarySearch implements Search {
    private static int[] array;
    private static int compare = 0;

    public int[] getArray() {
        return array;
    }

    public void setCompare(int compare) {
        BinarySearch.compare = compare;
    }

    public int getCompare() {
        return compare;
    }

    public BinarySearch(int[] array) {
        BinarySearch.array = array;
    }

    private static int binarySearch(int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            compare++;
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            }
            // если средний элемент меньше направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }
            // если средний элемент больше направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (array[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    @Override
    public void search(int elementToSearch) {
        Arrays.sort(array);
        SearchUtils.info(this);
        int index = binarySearch(elementToSearch);
        if (index == -1) {
            System.out.println("Элемент " + elementToSearch + " не найден");
        } else {
            System.out.println("Элемент " + elementToSearch + " найден в массиве по индексу " + index);
        }
        SearchUtils.compare(this);

    }

    @Override
    public String toString() {
        return "Бинарный поиск";
    }
}

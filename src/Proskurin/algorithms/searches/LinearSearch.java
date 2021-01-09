package Proskurin.algorithms.searches;

import Proskurin.utils.search.SearchUtils;

public class LinearSearch implements Search {
    private static int[] array;
    private static int compare = 0;

    public int getCompare() {
        return compare;
    }

    public void setCompare(int compare) {
        LinearSearch.compare = compare;
    }

    public int[] getArray() {
        return array;
    }

    public LinearSearch(int[] array) {
        LinearSearch.array = array;
    }

    private static int linearSearch(int elementToSearch) {
        for (int index = 0; index < array.length; index++) {
            compare++;
            if (array[index] == elementToSearch) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public void search(int elementToSearch) {
        SearchUtils.info(this);
        int index = linearSearch(elementToSearch);
        if (index == -1) {
            System.out.println("Элемент " + elementToSearch + " не найден");
        } else {
            System.out.println("Элемент " + elementToSearch + " найден в массиве по индексу " + index);
        }
        SearchUtils.compare(this);
    }

    @Override
    public String toString() {
        return "Линейный поиск";
    }
}

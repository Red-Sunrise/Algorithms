package Proskurin.utils.search;

import Proskurin.algorithms.searches.Search;

import java.util.Arrays;

public class SearchUtils {
    public static void info(Search search){
        System.out.println("--------------------------------------");
        System.out.println("<---------- " + search.toString() + " ---------->");
        System.out.println(Arrays.toString(search.getArray()));
    }
    public static void compare(Search search){
        System.out.println("Выполнено " + search.getCompare() + " сравнений");
        search.setCompare(0);
    }
}

package Proskurin.algorithms.searches;

public interface Search {
    void search(int elementToSearch);
    String toString();
    int[] getArray();
    int getCompare();
    void setCompare(int compare);
}

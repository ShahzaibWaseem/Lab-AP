public class InsertionSort implements SortingAlgorithm {
    public void sort(Object[] items) {
        int j;
        for (int i = 1; i < items.length; i++) {
            Object temp = items[i];

            for (j = i; j > 0 && ((Comparable) items[j]).compareTo(temp) > 0; j--)
                items[j] = items[j - 1];

            items[j] = temp;
        }
    }
}

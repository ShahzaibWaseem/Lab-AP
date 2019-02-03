public class Recursive extends SortFactory {
    public SortingAlgorithm getAlgorithm() {
        System.out.println(super.algorithm);
        return new QuickSort();
    }
}

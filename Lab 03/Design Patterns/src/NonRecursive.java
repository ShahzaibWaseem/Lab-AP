public class NonRecursive extends SortFactory {
    public SortingAlgorithm getAlgorithm() {
        System.out.println(super.algorithm);
        if (super.algorithm == "Insertion") {
            return new InsertionSort();
        } else if (super.algorithm == "Selection") {
            return new SelectionSort();
        }
        return null;
    }
}

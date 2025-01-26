public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");

        int outputLength = input.length;
        int smallestIndex;
        int smallestNum;
        for (int i = 0; i < outputLength - 1; i++) {
            smallestIndex = i;
            smallestNum = input[i];
            for (int j = i + 1; j < outputLength; j++) {
                if (input[j] < input[smallestIndex]) {
                    smallestIndex = j;
                    smallestNum = input[j];
                }
            }
            input[smallestIndex] = input[i];
            input[i] = smallestNum;;

        }
    }
}
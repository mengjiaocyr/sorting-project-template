public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        int[] output = input;
        System.out.println("Selection Sort!!!");

        int outputLength = output.length;
        for (int i =1 ;i<outputLength;i++){
            int currentNum = output[i];
            for (int j = i-1; j>=0; j--){
                if (output[i]<output[j]){
                    output[i] = output[j];
                    output[j] = currentNum;
                }
            }
        }
        for(int i =0; i<outputLength;i++){
            System.out.println(output[i]);
        }
}
}
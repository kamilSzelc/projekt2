package pl.sdacademy;

public class bubleSort {

    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 9, 5, 2, 8, 6};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
    }
}

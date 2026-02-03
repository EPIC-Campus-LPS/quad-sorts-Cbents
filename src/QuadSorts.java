import java.util.Arrays;

public class QuadSorts {

    public static int[] BubbleSort(int[] arr){
        boolean sorted = false;
        int numSwap = 0;
        while (!sorted){
            numSwap = 0;
            for (int i = 0; i < arr.length - 1; i++){
                int n1 = arr[i];
                int n2 = arr[i+1];
                if (n1 > n2){
                    int n1Place = n1;
                    int n2Place = n2;
                    arr[i+1] = n1Place;
                    arr[i] = n2Place;
                    numSwap += 1;
                }

            }
            if (numSwap == 0){
                sorted = true;
            }
        }
        return arr;

    }
    public static int[] SelectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i){ // if there is something to switch
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }


        }
        return arr;
    }
    public static int[] InsertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){

            int holdingNumber = arr[i];
            int j = i -1;

            while (j >= 0 && arr[j] > holdingNumber){ //If number to the left is greater than the key number, move it to the right
                arr[j + 1] = arr[j];
                j --;
            }

            arr[j + 1] = holdingNumber;

        }

        return arr;
    }

    public static int[] merge(int[] leftArr, int[] rightArr){
        int[] merged = new int[leftArr.length + rightArr.length];
        int i = 0; // pointer for leftArr
        int j = 0; // pointer for rightArr
        int k = 0; // pointer for merged array

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                merged[k] = leftArr[i];
                k++;
                i++;
            } else {
                merged[k] = rightArr[j];
                k++;
                j++;
            }


        }

        // Copy any remaining elements from leftArr
        while (i < leftArr.length) {
            merged[k] = leftArr[i];
            k++;
            i++;
        }

        //Copy remaining elements from rightArr
        while (j < rightArr.length){
            merged[k] = rightArr[j];
            k++;
            j++;
        }
        return merged;


    }
    public static int[] MergeSort(int[] arr){
        int length = arr.length;
        if (length <= 1) {
            return arr;
        }

        int mid = Math.floorDiv(length, 2);
        int[] leftArray = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArray = Arrays.copyOfRange(arr, mid, length);

        return merge(MergeSort(leftArray), MergeSort(rightArray));


    }
}

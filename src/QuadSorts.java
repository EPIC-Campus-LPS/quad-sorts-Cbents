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
            int selectedIndex = i;
            int finalIndex = 0;
            for (int j = selectedIndex + 1; j < arr.length; j++){
                if (arr[selectedIndex] > j){
                    finalIndex = j; // update final index

                }
                else if (arr[selectedIndex] < j){
                    finalIndex = j - 1;
                    break;
                }

            }
            int temp = arr[i];
            arr[i] = arr[finalIndex];
            arr[finalIndex] = temp;
        }
        //DOESNT WORK YET!!!!
        return arr;
    }
    public static int[] MergeSort(int[] arr){
        return arr;
    }
}

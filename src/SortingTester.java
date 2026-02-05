import java.util.Random;

public class SortingTester {

    public static int[] Test(int function){

        int[] results = new int[5];

        if (function == 0){
            for (int i = 0; i < 5; i++){
                if (i == 0){
                    results[i] = Timer(0, 100);
                }
                else if(i == 1){
                    results[i] = Timer(0, 1000);
                }
                else if(i == 2){
                    results[i] = Timer(0, 10000);
                }
                else if(i == 3){
                    results[i] = Timer(0, 100000);
                }

            }

        }
        else if (function == 1){
            for (int i = 0; i < 5; i++){
                if (i == 0){
                    results[i] = Timer(1, 100);
                }
                else if(i == 1){
                    results[i] = Timer(1, 1000);
                }
                else if(i == 2){
                    results[i] = Timer(1, 10000);
                }
                else if(i == 3){
                    results[i] = Timer(1, 100000);
                }
                else if (i==4){
                    results[i] = Timer(1, 1000000);
                }
            }
        }
        else if (function == 2){
            for (int i = 0; i < 5; i++){
                if (i == 0){
                    results[i] = Timer(2, 100);
                }
                else if(i == 1){
                    results[i] = Timer(2, 1000);
                }
                else if(i == 2){
                    results[i] = Timer(2, 10000);
                }
                else if(i == 3){
                    results[i] = Timer(2, 100000);
                }
                else if (i==4){
                    results[i] = Timer(2, 1000000);
                }
            }
        }

        else if (function == 3){
            for (int i = 0; i < 5; i++){
                if (i == 0){
                    results[i] = Timer(3, 100);
                }
                else if(i == 1){
                    results[i] = Timer(3, 1000);
                }
                else if(i == 2){
                    results[i] = Timer(3, 10000);
                }
                else if(i == 3){
                    results[i] = Timer(3, 100000);
                }
                else if (i==4){
                    results[i] = Timer(3, 1000000);
                }
            }
        }




        return results;

    }

    public static int Timer(int functionNum, int size){
        Random random = new Random();
        int timebefore = 0;
        int timeafter = 0;
        int time = 0;

        int[] genArr = new int[size];

        for (int i = 0; i < genArr.length; i++){
            genArr[i] = random.nextInt(0, size);
        }

        timebefore += System.currentTimeMillis();

        if (functionNum == 0){
            QuadSorts.BubbleSort(genArr);
            timeafter += System.currentTimeMillis();
            time = timeafter - timebefore;
        }
        else if (functionNum == 1){
            QuadSorts.SelectionSort(genArr);
            timeafter += System.currentTimeMillis();
            time = timeafter - timebefore;
        }
        else if (functionNum == 2){
            QuadSorts.InsertionSort(genArr);
            timeafter += System.currentTimeMillis();
            time = timeafter - timebefore;
        }
        else if (functionNum == 3){
            QuadSorts.MergeSort(genArr);
            timeafter += System.currentTimeMillis();
            time = timeafter - timebefore;
        }

        return time;

    }


}

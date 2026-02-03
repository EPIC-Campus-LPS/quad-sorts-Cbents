import java.util.Random;

public class SortingTester {

    public static long[] Test(QuadSorts function, int[] arr){
        Random random = new Random();
        long[] results = new long[5];
        int[] genArr = new int[100];
        int timebefore = 0;
        int timeafter = 0;

        for (int i = 0; i < genArr.length; i++){
            genArr[i] = random.nextInt(0, 100);
        }

        timebefore += System.currentTimeMillis();


        genArr = new int[1000];

        for (int i = 0; i < genArr.length; i++){
            genArr[i] = random.nextInt(0, 100);
        }

    }
}

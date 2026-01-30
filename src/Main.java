import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] genArr = new int[4];

        for (int i = 0; i < genArr.length; i++){
            genArr[i] = random.nextInt(0, 100);
        }
        System.out.print(Arrays.toString(genArr));
        System.out.print("\n --------------------- \n");
        genArr = QuadSorts.InsertionSort(genArr);
        System.out.print(Arrays.toString(genArr));


    }
}

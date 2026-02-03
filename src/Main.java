import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.print(Arrays.toString(genArr));
        System.out.print("\n --------------------- \n");
        genArr = QuadSorts.MergeSort(genArr);
        System.out.print(Arrays.toString(genArr));


    }
}

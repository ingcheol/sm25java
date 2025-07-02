package array;

import java.util.Arrays;
import java.util.Random;

public class Array10 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(10) + 1;
            boolean exists = false;

            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    exists = true;
                    break;
                }
            }

            if (exists) {
                i--;
            } else {
                arr[i] = num;
            }
        }

        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.printf("최소값: %d, 최대값: %d\n", min, max);
    }
}

package array2;

import java.util.Arrays;
import java.util.Random;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Random rand = new Random();

        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {
                while (true) {
                    int num = rand.nextInt(100) + 1;
                    if (!isDuplicateInColumn(arr, col, num)) {
                        arr[row][col] = num;
                        break;
                    }
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    // 특정 열에 중복된 값이 있는지 확인하는 함수
    public static boolean isDuplicateInColumn(int[][] arr, int col, int num) {
        for (int row = 0; row < arr.length; row++) {
            if (arr[row][col] == num) {
                return true;
            }
        }
        return false;
    }
}

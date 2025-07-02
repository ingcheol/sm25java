package operation;

public class Op4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        // 3수의 최대 값과 최소 값을 구하시오
        int max = a;
        int min = a;

        if (b > max) {
            max = b;
        }
        if (b < min) {
            min = b;
        }

        if (c > max) {
            max = c;
        }
        if (c < min) {
            min = c;
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);




    }

}
package variable;

public class Var1 {
    public static void main(String[] args) {
        // 정수는 int 정수형으로 선언했을 때 21억이 기본 베이스
        int intNum = 2100000000; // 32bit, 2^32, 4byte

        long doubleNum = 210000000000L; // 64bit, 8byte

        byte b1 = 100;
        byte b2 = 100;
        byte b3 = (byte) (b1 + b2); // 오른쪽에서 계산된 결과는 int이기 때문에 (byte) 사용 필요
        System.out.println(b3);

        // 실수 double
        // float f1 = 100000.0; → 실수로 쓰면 double, f를 붙여야 float
        float f1 = 1000000.0F;
        float f2 = 1000000.0F;
        float f3 = f1 + f2;
        System.out.printf("%f", f3);

        double d1 = 100000.0;
        int num1 = 150000000;
        int num2 = 150000000;
        int result = num1 + num2;
        System.out.println(result);
    }
}

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수: ");
        int a = sc.nextInt();

        System.out.print("두번째 정수: ");
        int b = sc.nextInt();

        System.out.println("덧셈: "+ (a + b));
        System.out.println("뺄셈: "+ (a - b));
        System.out.println("곱셈: "+ (a * b));
        System.out.printf("나눗셈: %.2f\n", ((double) a / b));
        System.out.println("나머지: "+ (a % b));

    }
}
import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci series till ");
        int num = sc.nextInt();
        sc.close();

        cal(num);
    }

    static void cal(int n) {

        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

}

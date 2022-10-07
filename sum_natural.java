import java.util.Scanner;

public class sum_natural {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Sum of natural numbers from 1 to ");
        int num = sc.nextInt();
        sc.close();

        int result = cal(num);
        System.out.println("Sum of natural numbers = " + result);
    }

    static int cal(int n) {
        int i = 1;
        int r = 0;
        while (i <= n) {
            r = r + i;
            i++;
        }
        return r;
    }
}

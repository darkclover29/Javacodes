import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number : ");
        int num = sc.nextInt();
        sc.close();

        cal(num);

    }

    static void cal(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

}

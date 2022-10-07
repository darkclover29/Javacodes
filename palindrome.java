import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a  number : ");
        int num = sc.nextInt();
        calculate obj = new calculate();
        sc.close();

        obj.check(num);

    }
}

class calculate {

    void check(int n) {
        int n1 = n;
        int rev = 0;
        while (n1 > 0) {

            rev = rev * 10 + n1 % 10;
            n1 = n1 / 10;
        }
        if (n == rev) {
            System.out.println(n + " is a palindrome number");
        } else {
            System.out.println(n + " is not a palindrome number");
        }
    }

}

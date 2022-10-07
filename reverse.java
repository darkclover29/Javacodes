import java.util.Scanner;

public class reverse {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a five digit number ");
        int num = sc.nextInt();
        calculate obj = new calculate();
        sc.close();

        obj.rev(num);

    }
}

class calculate {

    void rev(int n) {
        int rev = 0;
        while (n > 0) {

            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Reverse number =  " + rev);
    }

}

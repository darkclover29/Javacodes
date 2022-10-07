import java.util.Scanner;

public class separate {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a five digit number ");
        int num = sc.nextInt();
        calculate obj = new calculate();
        sc.close();
        obj.sep(num);

    }
}

class calculate {

    void sep(int n) {

        int a[] = new int[10];
        int count = 0;

        while (n > 0) {
            a[count] = n % 10;
            n = n / 10;
            count++;
        }

        int size = count - 1;

        System.out.println("Separated numbers are given below");
        for (int i = size; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }
}

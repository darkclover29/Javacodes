public class divide0_ex {
    public static void main(String args[]) {
        int[] a = { 10, 30, 55, 70 };
        int[] b = { 5, 0, 11, 7 };

        for (int i = 0; i < a.length; i++) {
            try {
                System.out.println(a[i] / b[i]);
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by 0");
            }
        }

    }
}

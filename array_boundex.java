public class array_boundex {
    public static void main(String args[]) {
        int[] arr = new int[5];
        try {
            arr[10] = 25;
            System.out.println("No error");

        } catch (Exception e) {
            System.out.println("Array out of range error");
        } finally {
            System.out.println("end of try catch");
        }
        System.out.println("Rest of the program");
    }
}

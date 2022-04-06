public class Task1 {
    public static void main(String[] args) {
        int count = 50;
        int[] arr = new int[count];

        for (int i = 1; i <= 99; i += 2) {
            arr[i / 2] = i;
        }

        System.out.println("Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr[" + i + "] = " + arr[i]);
        }
    }
}

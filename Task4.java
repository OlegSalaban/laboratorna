public class Task4 {
    public static void fillArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*11);
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void createArrayOfSums(int[] A, int[] B, int[] C){
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        fillArray(A);
        fillArray(B);

        createArrayOfSums(A, B, C);

        System.out.print("A: ");
        printArray(A);

        System.out.print("B: ");
        printArray(B);

        System.out.print("C: ");
        printArray(C);
    }
}

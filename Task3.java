public class Task3 {
    public static void fillArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*6);
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static double avgValue(int[] arr){
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

        fillArray(A);
        fillArray(B);
        fillArray(C);

        System.out.print("A: ");
        printArray(A);

        System.out.print("B: ");
        printArray(B);

        System.out.print("C: ");
        printArray(C);

        double aAvg = avgValue(A);
        double bAvg = avgValue(B);
        double cAvg = avgValue(C);

        System.out.println("A avg value: " + aAvg);
        System.out.println("B avg value: " + bAvg);
        System.out.println("C avg value: " + cAvg);

        if(aAvg == bAvg && aAvg == cAvg){
            System.out.println("Avg values are equals!");
        }else if(aAvg > bAvg && aAvg > cAvg){
            System.out.println("A avg is the greatest!");
        }else if(bAvg > cAvg){
            System.out.println("B avg is the greatest!");
        }else{
            System.out.println("C avg is the greatest!");
        }
    }
}

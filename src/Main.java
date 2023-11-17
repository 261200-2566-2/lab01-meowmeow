import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter array size: ");
        n = Math.abs(sin.nextInt());
        long[] arr = readInput(sin, n);
        sin.close();
        Arrays.sort(arr);
        printArray(arr);
    }

    public static long[] readInput(Scanner sin, int n) {
        long[] arr = new long[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sin.nextLong();
        }
        sin.close();
        return arr;
    }

    public static void printArray(long[] arr) {
        System.out.println("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
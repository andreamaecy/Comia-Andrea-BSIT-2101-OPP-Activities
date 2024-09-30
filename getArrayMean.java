import java.util.Scanner;

public class getArrayMean {

    public static double getArrayMean(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double ) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = value.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            arr[i] = value.nextInt();
        }

        System.out.println("Mean ofarray is: " + getArrayMean(arr));

        value.close();
    }
}
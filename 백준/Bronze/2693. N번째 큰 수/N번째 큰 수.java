import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        int n = 3;

        for (int i = 0; i < test; i++) {
            int[] arr = new int[10];

            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

            System.out.println(arr[10-n]);
        }

        sc.close();
    }
}

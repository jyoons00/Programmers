import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt(); 
        
        for (int i = 0; i < test; i++) {
            int[] arr = new int[10];

            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }
        
            Arrays.sort(arr);

            System.out.println(arr[7]);
        }

        sc.close();
    }
}

/*
만약에 n을 직접 입력 받아서 N번째 큰 값을 출력하고자 할 경우의 코드

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt(); 
        int n = sc.nextInt(); 
        
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


*/

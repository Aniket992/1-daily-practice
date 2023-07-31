import java.util.*;

class practice {
    // function to calculate the number of digits in weird number
    public static int weirdlength(int A) {
        int count = 1;
        while (A > 9) {
            A = A / 10;
            count++;
        }
        return count;
    }
// function to get the weird numbers
    public static int weird(int N, int K) {
        int l = 0;
        for (int i = 1; i <= N; i++) {
            if (i % K != 0 && weirdlength(i) % 2 == 0) {
                l++;
                System.out.print(i + ",");
            }
        }  System.out.println(" ");
        return l;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            System.out.println(weird(N, K));
        }
    }
}
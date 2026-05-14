import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập số nguyên N: ");
        int N = sc.nextInt();

        N = Math.abs(N);

        int sum = 0;

        while (N > 0) {
            int digit = N % 10;
            sum += digit;
            N = N / 10;
        }

        System.out.println("Tổng các chữ số là: " + sum);

        sc.close();
    }
}
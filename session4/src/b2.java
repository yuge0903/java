import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so hang: ");
        int rows = sc.nextInt();

        System.out.print("Nhap so cot: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Nhap cac phan tu cua mang:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        int tongChan = 0;
        int tongLe = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (arr[i][j] % 2 == 0) {
                    tongChan += arr[i][j];
                } else {
                    tongLe += arr[i][j];
                }

            }
        }
        System.out.println("Tong cac so chan: " + tongChan);
        System.out.println("Tong cac so le: " + tongLe);

        sc.close();
    }
}
import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Mang khong co phan tu");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu:");

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        System.out.println("Mang sau khi sap xep:");

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
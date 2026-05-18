import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu:");

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // Sắp xếp chọn giảm dần
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Hoán đổi
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        System.out.println("\nMang sau khi sap xep giam dan:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n\nNhap so can tim: ");
        int x = sc.nextInt();

        // Tìm kiếm tuyến tính
        int viTriTuyenTinh = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                viTriTuyenTinh = i;
                break;
            }
        }

        // Tìm kiếm nhị phân trên mảng giảm dần
        int left = 0;
        int right = n - 1;
        int viTriNhiPhan = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == x) {
                viTriNhiPhan = mid;
                break;
            }

            // Vì mảng giảm dần
            if (arr[mid] < x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (viTriTuyenTinh != -1) {
            System.out.println("Tim kiem tuyen tinh: Tim thay tai vi tri " + viTriTuyenTinh);
        } else {
            System.out.println("Tim kiem tuyen tinh: Khong tim thay");
        }

        if (viTriNhiPhan != -1) {
            System.out.println("Tim kiem nhi phan: Tim thay tai vi tri " + viTriNhiPhan);
        } else {
            System.out.println("Tim kiem nhi phan: Khong tim thay");
        }

        sc.close();
    }
}
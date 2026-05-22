import java.util.Arrays;
import java.util.Scanner;

public class b1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] diem = new double[100];
        int n = 0;
        int choice;

        do {
            System.out.println("\n****************QUAN LY DIEM SV****************");
            System.out.println("1. Nhap danh sach diem sinh vien");
            System.out.println("2. In danh sach diem");
            System.out.println("3. Tinh diem trung binh cua cac sinh vien");
            System.out.println("4. Tim diem cao nhat va thap nhat");
            System.out.println("5. Dem so luong sinh vien dat va truot");
            System.out.println("6. Sap xep diem tang dan");
            System.out.println("7. Thong ke so luong sinh vien gioi va xuat sac");
            System.out.println("8. Thoat");

            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhap diem sinh vien thu " + (i + 1) + ": ");
                        diem[i] = sc.nextDouble();
                    }
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Chua co du lieu!");
                    } else {
                        System.out.println("Danh sach diem sinh vien:");
                        for (int i = 0; i < n; i++) {
                            System.out.println("Sinh vien " + (i + 1) + ": " + diem[i]);
                        }
                    }
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("Chua co du lieu!");
                    } else {
                        double tong = 0;

                        for (int i = 0; i < n; i++) {
                            tong += diem[i];
                        }

                        double dtb = tong / n;
                        System.out.println("Diem trung binh: " + dtb);
                    }
                    break;

                case 4:
                    if (n == 0) {
                        System.out.println("Chua co du lieu!");
                    } else {
                        double max = diem[0];
                        double min = diem[0];

                        for (int i = 1; i < n; i++) {
                            if (diem[i] > max) {
                                max = diem[i];
                            }

                            if (diem[i] < min) {
                                min = diem[i];
                            }
                        }

                        System.out.println("Diem cao nhat: " + max);
                        System.out.println("Diem thap nhat: " + min);
                    }
                    break;

                case 5:
                    if (n == 0) {
                        System.out.println("Chua co du lieu!");
                    } else {
                        int dat = 0;
                        int truot = 0;

                        for (int i = 0; i < n; i++) {
                            if (diem[i] >= 5) {
                                dat++;
                            } else {
                                truot++;
                            }
                        }

                        System.out.println("So sinh vien dat: " + dat);
                        System.out.println("So sinh vien truot: " + truot);
                    }
                    break;

                case 6:
                    if (n == 0) {
                        System.out.println("Chua co du lieu!");
                    } else {
                        Arrays.sort(diem, 0, n);

                        System.out.println("Danh sach diem sau khi sap xep tang dan:");
                        for (int i = 0; i < n; i++) {
                            System.out.println(diem[i]);
                        }
                    }
                    break;

                case 7:
                    if (n == 0) {
                        System.out.println("Chua co du lieu!");
                    } else {
                        int gioiXuatSac = 0;

                        for (int i = 0; i < n; i++) {
                            if (diem[i] >= 8) {
                                gioiXuatSac++;
                            }
                        }

                        System.out.println("So sinh vien gioi va xuat sac: " + gioiXuatSac);
                    }
                    break;

                case 8:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 8);

        sc.close();
    }
}
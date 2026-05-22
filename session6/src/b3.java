import java.util.Arrays;
import java.util.Scanner;

public class b3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] bienSo = new String[100];
        int n = 0;
        int choice;

        do {

            System.out.println("\n**************** QUAN LY BIEN SO XE ****************");
            System.out.println("1. Them cac bien so xe");
            System.out.println("2. Hien thi danh sach bien so xe");
            System.out.println("3. Tim kiem bien so xe");
            System.out.println("4. Tim bien so xe theo ma tinh");
            System.out.println("5. Sap xep bien so xe tang dan");
            System.out.println("6. Thoat");

            System.out.print("Lua chon cua ban: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("Nhap so luong bien so xe: ");
                    int m = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < m; i++) {

                        System.out.print("Nhap bien so xe thu " + (n + 1) + ": ");
                        String bs = sc.nextLine();

                        if (kiemTraBienSo(bs)) {
                            bienSo[n] = bs;
                            n++;
                        } else {
                            System.out.println("Bien so khong dung dinh dang!");
                            i--;
                        }
                    }

                    break;

                case 2:

                    if (n == 0) {
                        System.out.println("Danh sach rong!");
                    } else {

                        System.out.println("Danh sach bien so xe:");

                        for (int i = 0; i < n; i++) {
                            System.out.println(bienSo[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Nhap bien so can tim: ");
                    String tim = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < n; i++) {

                        if (bienSo[i].equalsIgnoreCase(tim)) {
                            System.out.println("Tim thay bien so: " + bienSo[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Khong tim thay!");
                    }

                    break;

                case 4:

                    System.out.print("Nhap ma tinh can tim: ");
                    String maTinh = sc.nextLine();

                    boolean check = false;

                    System.out.println("Danh sach bien so theo ma tinh:");

                    for (int i = 0; i < n; i++) {

                        if (bienSo[i].startsWith(maTinh)) {
                            System.out.println(bienSo[i]);
                            check = true;
                        }
                    }

                    if (!check) {
                        System.out.println("Khong co bien so nao!");
                    }

                    break;

                case 5:

                    Arrays.sort(bienSo, 0, n);

                    System.out.println("Danh sach sau khi sap xep:");

                    for (int i = 0; i < n; i++) {
                        System.out.println(bienSo[i]);
                    }

                    break;

                case 6:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 6);

        sc.close();
    }

    // Kiem tra bien so xe
    public static boolean kiemTraBienSo(String bs) {

        return bs.matches("^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$");
    }
}
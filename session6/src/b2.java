import java.util.Scanner;

public class b2 {

    static String hoTen = "";
    static String email = "";
    static String sdt = "";
    static String matKhau = "";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n**************** QUAN LY NGUOI DUNG ****************");
            System.out.println("1. Nhap thong tin nguoi dung");
            System.out.println("2. Chuan hoa ho ten");
            System.out.println("3. Kiem tra email hop le");
            System.out.println("4. Kiem tra so dien thoai hop le");
            System.out.println("5. Kiem tra mat khau hop le");
            System.out.println("6. Thoat");

            System.out.print("Lua chon cua ban: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Nhap ho ten: ");
                    hoTen = sc.nextLine();

                    System.out.print("Nhap email: ");
                    email = sc.nextLine();

                    System.out.print("Nhap so dien thoai: ");
                    sdt = sc.nextLine();

                    System.out.print("Nhap mat khau: ");
                    matKhau = sc.nextLine();
                    break;

                case 2:
                    if (hoTen.isEmpty()) {
                        System.out.println("Chua nhap ho ten!");
                    } else {
                        System.out.println("Ho ten sau khi chuan hoa: " + chuanHoaHoTen(hoTen));
                    }
                    break;

                case 3:
                    if (kiemTraEmail(email)) {
                        System.out.println("Email hop le");
                    } else {
                        System.out.println("Email khong hop le");
                    }
                    break;

                case 4:
                    if (kiemTraSDT(sdt)) {
                        System.out.println("So dien thoai hop le");
                    } else {
                        System.out.println("So dien thoai khong hop le");
                    }
                    break;

                case 5:
                    if (kiemTraMatKhau(matKhau)) {
                        System.out.println("Mat khau hop le");
                    } else {
                        System.out.println("Mat khau khong hop le");
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

    // Chuan hoa ho ten
    public static String chuanHoaHoTen(String name) {

        name = name.trim().toLowerCase();

        String[] words = name.split("\\s+");

        String result = "";

        for (String word : words) {
            result += Character.toUpperCase(word.charAt(0))
                    + word.substring(1) + " ";
        }

        return result.trim();
    }

    // Kiem tra email
    public static boolean kiemTraEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    // Kiem tra so dien thoai VN
    public static boolean kiemTraSDT(String sdt) {
        return sdt.matches("^(03|05|07|08|09)\\d{8}$");
    }

    // Kiem tra mat khau
    public static boolean kiemTraMatKhau(String password) {

        if (password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}
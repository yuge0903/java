import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập email: ");
        String email = sc.nextLine();

        // Loại bỏ khoảng trắng thừa
        email = email.trim();

        // Regex kiểm tra email
        String regex = "^[A-Za-z0-9._]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,6}$";

        // Kiểm tra hợp lệ
        if (email.matches(regex)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }

        sc.close();
    }
}
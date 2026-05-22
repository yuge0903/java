import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập mật khẩu
        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();

        /*
         * Regex kiểm tra:
         * (?=.*[A-Z])    : ít nhất 1 chữ hoa
         * (?=.*[a-z])    : ít nhất 1 chữ thường
         * (?=.*\\d)      : ít nhất 1 số
         * (?=.*[@#$!%])  : ít nhất 1 ký tự đặc biệt
         * .{8,}          : tối thiểu 8 ký tự
         */

        String regex =
                "^(?=.*[A-Z])" +
                        "(?=.*[a-z])" +
                        "(?=.*\\d)" +
                        "(?=.*[@#$!%])" +
                        ".{8,}$";
        if (password.matches(regex)) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }

        sc.close();
    }
}
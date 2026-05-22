import java.util.Random;
import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        String characters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                        "abcdefghijklmnopqrstuvwxyz" +
                        "0123456789";

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        if (n < 1 || n > 1000) {
            System.out.println("n phải trong khoảng từ 1 đến 1000");
            return;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        System.out.println("Chuỗi ngẫu nhiên:");
        System.out.println(result);

        sc.close();
    }
}
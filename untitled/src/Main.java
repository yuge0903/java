import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Khai báo biến bán kính
        double radius;

        // Nhập bán kính
        System.out.print("Nhập bán kính: ");
        radius = sc.nextDouble();

        // Tính diện tích hình tròn
        double area = 3.1416 * radius * radius;

        // In kết quả
        System.out.printf("Diện tích: %.2f", area);

        sc.close();
    }
}
import java.util.Scanner;

public class b1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ban kinh: ");
        double radius = sc.nextDouble();

        double area = 3.1416 * radius * radius;

        System.out.printf("Dien tich: %.2f", area);

        sc.close();
    }
}
import java.util.Scanner;

public class b4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float width;
        float height;
        float area;
        float perimeter;

        System.out.print("Nhap chieu rong: ");
        width = sc.nextFloat();

        System.out.print("Nhap chieu cao: ");
        height = sc.nextFloat();

        area = width * height;

        perimeter = 2 * (width + height);

        System.out.println("Dien tich hinh chu nhat: " + area);
        System.out.println("Chu vi hinh chu nhat: " + perimeter);

        sc.close();
    }
}
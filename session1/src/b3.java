import java.util.Scanner;

public class b3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tu so phan so 1: ");
        int tu1 = sc.nextInt();

        System.out.print("Nhap mau so phan so 1: ");
        int mau1 = sc.nextInt();

        System.out.print("Nhap tu so phan so 2: ");
        int tu2 = sc.nextInt();

        System.out.print("Nhap mau so phan so 2: ");
        int mau2 = sc.nextInt();

        int tuTong = (tu1 * mau2) + (tu2 * mau1);
        int mauTong = mau1 * mau2;


        System.out.println("Tong hai phan so la: " + tuTong + "/" + mauTong);

        sc.close();
    }
}
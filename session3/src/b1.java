import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin khách hàng
        System.out.print("Nhập tên khách hàng: ");
        String customerName = sc.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        String productName = sc.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        double price = sc.nextDouble();

        System.out.print("Nhập số lượng mua: ");
        int quantity = sc.nextInt();

        System.out.print("Khách có thẻ thành viên (true/false): ");
        boolean isMember = sc.nextBoolean();

        // Tính thành tiền
        double subtotal = price * quantity;

        // Tính giảm giá
        double discount = 0;
        if (isMember) {
            discount = subtotal * 0.10; // Giảm 10%
        }

        // Tính VAT 8%
        double vat = (subtotal - discount) * 0.08;

        // Tổng thanh toán
        double total = subtotal - discount + vat;

        // In hóa đơn
        System.out.println("\n===== THÔNG TIN HÓA ĐƠN =====");
        System.out.println("Khách hàng      : " + customerName);
        System.out.println("Sản phẩm        : " + productName);
        System.out.println("Số lượng        : " + quantity);
        System.out.println("Đơn giá         : " + price);
        System.out.println("Thành tiền      : " + subtotal);
        System.out.println("Giảm giá        : " + discount);
        System.out.println("Tiền VAT (8%)   : " + vat);
        System.out.println("Tổng thanh toán : " + total);

        sc.close();
    }
}
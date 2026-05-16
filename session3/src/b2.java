import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        double total = 0;
        double max = -1;
        double min = 11;

        while (true) {
            // Hiển thị menu
            System.out.println("\n----- MENU -----");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát chương trình");
            System.out.print("Chọn chức năng: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    while (true) {
                        System.out.print("Nhập điểm học viên (-1 để kết thúc): ");
                        double score = sc.nextDouble();

                        if (score == -1) {
                            break;
                        }
                        // Kiểm tra hợp lệ
                        if (score < 0 || score > 10) {
                            System.out.println("Điểm không hợp lệ! Vui lòng nhập lại.");
                            continue;
                        }
                        // Xếp loại học lực
                        if (score < 5) {
                            System.out.println("Xếp loại: Yếu");
                        } else if (score < 7) {
                            System.out.println("Xếp loại: Trung Bình");
                        } else if (score < 8) {
                            System.out.println("Xếp loại: Khá");
                        } else if (score < 9) {
                            System.out.println("Xếp loại: Giỏi");
                        } else {
                            System.out.println("Xếp loại: Xuất sắc");
                        }

                        // Cập nhật thống kê
                        count++;
                        total += score;

                        if (score > max) {
                            max = score;
                        }

                        if (score < min) {
                            min = score;
                        }
                    }
                    break;

                //Hiển thị thống kê
                case 2:
                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        double average = total / count;

                        System.out.println("\n----- THỐNG KÊ -----");
                        System.out.println("Số học viên đã nhập: " + count);
                        System.out.println("Điểm trung bình: " + average);
                        System.out.println("Điểm cao nhất: " + max);
                        System.out.println("Điểm thấp nhất: " + min);
                    }
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình!");
                    System.exit(0);
                    break;

                // Trường hợp nhập sai menu
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
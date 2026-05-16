import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        double totalSalary = 0;
        double maxSalary = 0;
        double minSalary = Double.MAX_VALUE;
        double totalBonus = 0;

        while (true) {

            // Hiển thị menu
            System.out.println("\n----- MENU -----");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng tiền thưởng");
            System.out.println("4. Thoát chương trình");
            System.out.print("Chọn chức năng: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    while (true) {
                        System.out.print("Nhập lương nhân viên (-1 để kết thúc): ");
                        double salary = sc.nextDouble();

                        if (salary == -1) {
                            break;
                        }

                        // Kiểm tra hợp lệ
                        if (salary < 0 || salary > 500000000) {
                            System.out.println("Lương không hợp lệ!");
                            continue;
                        }

                        // Phân loại lương
                        if (salary < 5000000) {
                            System.out.println("Thu nhập thấp");
                        } else if (salary <= 15000000) {
                            System.out.println("Thu nhập trung bình");
                        } else if (salary <= 50000000) {
                            System.out.println("Thu nhập khá");
                        } else {
                            System.out.println("Thu nhập cao");
                        }

                        // Tính thưởng
                        double bonus = 0;

                        if (salary < 5000000) {
                            bonus = salary * 0.05;
                        } else if (salary <= 15000000) {
                            bonus = salary * 0.10;
                        } else if (salary <= 50000000) {
                            bonus = salary * 0.15;
                        } else if (salary <= 100000000) {
                            bonus = salary * 0.20;
                        } else {
                            bonus = salary * 0.25;
                        }

                        totalBonus += bonus;

                        // Cập nhật thống kê
                        count++;
                        totalSalary += salary;

                        if (salary > maxSalary) {
                            maxSalary = salary;
                        }

                        if (salary < minSalary) {
                            minSalary = salary;
                        }
                    }
                    break;

                //Hiển thị thống kê
                case 2:
                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        double averageSalary = totalSalary / count;

                        System.out.println("\n----- THỐNG KÊ -----");
                        System.out.println("Số nhân viên đã nhập: " + count);
                        System.out.println("Lương trung bình: " + averageSalary);
                        System.out.println("Lương cao nhất: " + maxSalary);
                        System.out.println("Lương thấp nhất: " + minSalary);
                        System.out.println("Tổng tiền lương: " + totalSalary);
                    }
                    break;

                //Tổng tiền thưởng
                case 3:
                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("Tổng số tiền thưởng: " + totalBonus);
                    }
                    break;

                case 4:
                    System.out.println("Kết thúc chương trình!");
                    System.exit(0);
                    break;

                // Nhập sai menu
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
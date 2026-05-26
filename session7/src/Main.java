class Book {
    // Khai báo các thuộc tính (Attributes) với phạm vi public (+)
    public String title;
    public String author;
    public double price;

    // Viết phương thức printInfo() để in ra thông tin quyển sách
    public void printInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}
public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();

        myBook.title = "Lập trình hướng đối tượng Java";
        myBook.author = "Nguyễn Văn A";
        myBook.price = 150000.0;

        System.out.println("--- Thông tin sách vừa tạo ---");
        myBook.printInfo();
    }
}
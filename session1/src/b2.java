import java.util.Scanner;

public class b2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.print("Nhap so thu nhat: ");
        firstNumber = sc.nextInt();

        System.out.print("Nhap so thu hai: ");
        secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;
        System.out.println("\nKET QUA");
        System.out.println("So thu nhat: " + firstNumber);
        System.out.println("So thu hai: " + secondNumber);

        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);
        System.out.println("Thuong: " + quotient);
        System.out.println("Phan du: " + remainder);

        sc.close();
    }
}
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
//        Bài 3: Nhập vào 2 số nguyên và một phép tính toán học, in ra kết quả
//        của các phép tính
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen thu nhat");
        int num1 = scanner.nextInt();
        System.out.println("Nhap vao so nguyen thu hai");
        int num2 = scanner.nextInt();
        System.out.println("Nhap vao mot phep tinh hoc: +,-,*,/");
        char operator = scanner.next().charAt(0);
        float result ;
        switch (operator) {
            case '+':
                System.out.println("Kết quả: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Kết quả: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Kết quả: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Kết quả: " + ((double) num1 / num2));
                } else {
                    System.out.println("Không thể chia cho 0.");
                }
                break;
            default:
                System.out.println("Phép toán không hợp lệ.");
        }
        scanner.close();

    }
}

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
//        Bài 1: Nhập vào một số nguyên từ bàn phím, kiểm tra số đó là số chẵn
//        hay số lẻ, in kết quả ra màn hình console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen: ");
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.printf("%d la so chan",number);
        }else {
            System.out.printf("%d la so le",number);
        }
    }
}

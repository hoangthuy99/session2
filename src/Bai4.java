import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
//        Bài 4: Nhập từ bàn phím một số nguyên, kiểm tra và in kết quả số đó có
//        chia hết cho cả 3 và 5 không
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen:");
        int number = scanner.nextInt();
        if(number %3==0 && number%5==0){
            System.out.printf("So %d chia het cho 3 va 5",number);
        }else {
            System.out.printf("So %d khong chia het cho 3 va 5", number);
        }
    }
}

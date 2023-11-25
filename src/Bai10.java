import java.util.Scanner;

public class Bai10 {
//    Bài 10: Viết chương trình nhập vào lương cơ bản và ngày công thực tế
//    của nhân viên. In ra màn hình lương nhân viên biết:
//            • Số ngày công trong tháng là 26 ngày
//• Lương được tính theo công thức:
//            • lương cơ bản * (ngày công thực tế / số ngày công)
//            • Nếu ngày công lớn hơn ngày công thực tế thì các ngày dư ra sẽ
//    được tính 150% so với ngày công bình thường
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap luong co ban: ");
        double basicSarary = scanner.nextDouble();
        System.out.println("Nhap ngay cong thuc te: ");
        int dayWork = scanner.nextInt();
        int toltalWork = 26;
        double sarary;
        if(toltalWork >=dayWork){
            sarary = basicSarary + (basicSarary*0.5*(dayWork-toltalWork)/toltalWork);
        }
        else {
            sarary = basicSarary *(double) dayWork / toltalWork;
        }
        System.out.printf("Tien luong la: %.2f",sarary);


    }
}

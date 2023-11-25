import java.time.YearMonth;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
//        Bài 7: Nhập vào năm và tháng, in ra màn hình số ngày trong tháng đó
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao nam: ");
        int year = scanner.nextInt();
        System.out.println("Nhap vao thang (1-12): ");
        int month = scanner.nextInt();
        if(month>=1 && month<= 12){
            YearMonth yearMonth = YearMonth.of(year,month);
            int day = yearMonth.lengthOfMonth();
            System.out.println("Nam " + year+ " Thang "+ month+ " Ngay "+ day);
        }
    }
}

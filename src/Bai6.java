import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
//        Bài 6: Nhập vào chỉ số cũ (chỉ số công tơ điện ở đầu tháng) và chỉ số
//        mới (chỉ số công tơ điện ở cuối tháng), tính tiền điện tiêu thụ trong tháng
//        của hộ gia đình biết giá điện được tính như sau:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chi so cu: ");
        int oldNum = scanner.nextInt();
        System.out.println("Nhap chi so moi: ");
        int newNum =scanner.nextInt();
        int total = newNum - oldNum;
        int price;
//        50 <= Số điện < 100 15.000
//        100 <= Số điện < 150 20.000
//        150 <= Số điện < 200 25.000
//        200 <= Số điện 30.000
        if(0<=total && total <50){
            price = total*10000;
        } else if (100<=total && total<150) {
            price = total*25000;
        } else if (150 <= total &&total<200) {
            price = total *25000;
        }else {
            price = total* 30000;
        }
        System.out.println("Tien dien tieu thu cua ban la: "+price);

    }
}

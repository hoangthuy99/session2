import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
//        Nhập vào 3 điểm html, css, javascript của sinh viên, tính điểm
//        trung bình và in ra xếp loại của sinh viên:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao diem html:");
        float html = scanner.nextFloat();
        System.out.println("\n Nhap vao diem css");
        float css = scanner.nextFloat();
        System.out.println("\n Nhap vao diem javascript");
        float javascript = scanner.nextFloat();
        float avgMark = (html + css+ javascript) / 3F ;
        if(0 <= avgMark && avgMark< 5){
            System.out.println("Ban sep loai yeu");
        } else if (5<=avgMark & avgMark<7) {
            System.out.println("Ban sep loai trung binh");
        } else if (7<= avgMark & avgMark<8) {
            System.out.println("Ban sep loai kha");
        } else if (8<=avgMark && avgMark <9) {
            System.out.println("Ban sep loai gioi");
        }else {
            System.out.println("Ban sep loai xuat sac");
        }
    }
}

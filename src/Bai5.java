import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai canh 1: ");
        int a = scanner.nextInt();
        System.out.println("Nhap do dai canh 2: ");
        int b = scanner.nextInt();
        System.out.println("Nhap do dai canh 3: ");
        int c = scanner.nextInt();
        if(a>=b+c || b>=c+a|| c>a+b){
            System.out.println("Ba canh tren khong phai la mot tam giac");
        } else if (a == b||b==c || c == a) {
            if (a == b+c||b== c+a||c==a + b ) {
                System.out.println("Tam giac la tam giac vuong can");
            }
            System.out.println("Tam giac la tam giac can");
        } else {
            System.out.println("Tam giac la tam giac thuong");
        }
    }
}

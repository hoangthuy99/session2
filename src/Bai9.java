import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen thu nhat");
        int num1 = scanner.nextInt();
        System.out.println("Nhap vao so nguyen thu hai");
        int num2 = scanner.nextInt();
        System.out.println("Nhap vao so nguyen thu ba");
        int num3 = scanner.nextInt();
        if (num1>num2&& num2>num3){
            System.out.println("GTGD: "+num1+num2+num3);
        } else if (num1>num3&&num3>num2) {
            System.out.println("GTGD: "+num2 +num3 +num1);
        } else if (num2>num1&&num1>num3) {
            System.out.println("GTGD: "+num2+num1+num3);
        }else if(num2>num3&&num3>num1){
            System.out.println("GTGD: "+num1+num3+num2);
        }else if(num3>num2&&num2>num1){
            System.out.println("GTGD: "+num1+num2+num3);
        }else {
            System.out.println("GTGD: "+num2+num1+num3);

        }

    }
}

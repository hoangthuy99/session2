import java.util.Scanner;

public class Bai8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int year = scanner.nextInt();
        System.out.println("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.println("Nhập ngay: ");
        int day = scanner.nextInt();

            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Thang co ngay 31");
                    System.out.printf("Nam %d thang %d nam %d ", year, month, day );
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Thang co ngay 30");
                    System.out.printf("Nam %d thang %d nam %d ", year, month, day );
                    break;

                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        System.out.println("Thang co ngay 29");
                        System.out.printf("Nam %d thang %d nam %d ", year, month, day );

                    } else {
                        System.out.println("Thang co ngay 28");
                        System.out.printf("Nam %d thang %d nam %d ", year, month, day );

                    }
                    break;
                default:
                    System.out.printf("Nam %d thang %d nam %d khong hop le ", year, month, day );

            }






}
}
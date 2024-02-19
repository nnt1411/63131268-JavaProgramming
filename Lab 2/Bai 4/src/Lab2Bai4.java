import java.util.Scanner;

public class Lab2Bai4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        
        do {
            menu();
            
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    GiaiPTBacNhat();
                    break;
                case 2: 
                    GiaiPTBac2();
                    break;
                case 3:
                    TinhTienDien();
                    break;
                case 4: 
                    System.out.println("Kết thúc chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
            
        } while(choice != 4);
        
    }
    
    public static void menu() {
        System.out.println("+--------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2"); 
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+--------------------------------------------------+");
    }
    
    public static void GiaiPTBacNhat() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        if(a == 0) {
            if(b == 0) {
                System.out.println("Phương trình vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else {
            double x = -b/a;
            System.out.printf("Nghiệm của phương trình là: %f%n", x);
        }
    }
    
    public static void GiaiPTBac2() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        if(a == 0) {
            GiaiPTBacNhat();
        } else {
            double delta = Math.pow(b, 2) - 4*a*c;
            
            if(delta < 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else if(delta == 0) {
                double x = -b / (2*a);
                System.out.printf("Phương trình có nghiệm kép: %f%n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.printf("Phương trình có 2 nghiệm phân biệt: %n");
                System.out.printf("x1 = %f%n", x1);
                System.out.printf("x2 = %f%n", x2);
            }
        }
    }
    
    public static void TinhTienDien() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số điện sử dụng: ");
        int soDien = scanner.nextInt();
        
        if(soDien <= 50) {
            int tien = soDien * 1000;
            System.out.printf("Số tiền điện phải trả là: %d%n", tien);
        } else {
            int tien = 50 * 1000 + (soDien - 50) * 1200; 
            System.out.printf("Số tiền điện phải trả là: %d%n", tien);
        }
    }
}

import java.util.Scanner;

public class Lab2Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        if(a == 0) {
            if(b == 0) {
                if(c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c/b;
                System.out.printf("Phương trình có nghiệm duy nhất x = %f\n", x);
            }
        } else {
            double delta = b*b - 4*a*c;
            if(delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Phương trình có nghiệm kép x1 = x2 = %f\n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.printf("Phương trình có 2 nghiệm phân biệt: \nx1 = %f\nx2 = %f\n", x1, x2);
            }
        }
    }

}

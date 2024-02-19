import java.util.Scanner;

public class Lab2Bai3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số điện tiêu thụ: ");
        int soDien = scanner.nextInt();
        
        if(soDien <= 50) {
            int tien = soDien * 1000; 
            System.out.println("Số tiền điện phải trả là: " + tien + " VND");
        }
        else {
            int tien = 50 * 1000 + (soDien - 50) * 1200;
            System.out.println("Số tiền điện phải trả là: " + tien + " VND");
        }
    }
}

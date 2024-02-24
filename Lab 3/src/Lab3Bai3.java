import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt(); 
        }
        
        // Sắp xếp mảng
        Arrays.sort(a);
        
        // Xuất mảng đã sắp xếp
        System.out.print("Mảng sau khi sắp xếp: ");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " "); 
        }
        
        // Tìm phần tử nhỏ nhất
        int min = a[0];
        
        // Tính trung bình cộng các số chia hết cho 3
        int tong = 0;
        int dem = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] % 3 == 0) {
                tong += a[i];
                dem++;
            }
        }
        
        float tb = (float)tong/dem;
        
        System.out.println("\nPhần tử nhỏ nhất: " + min);        
        System.out.println("Trung bình cộng các số chia hết cho 3: " + tb);
    }

}
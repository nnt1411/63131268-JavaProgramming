import java.util.Scanner;

public class Lab3Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập vào một số nguyên: ");
        int n = scanner.nextInt();
        
        boolean isPrime = true;
        
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                isPrime = false;
                break; 
            }
        }
        
        if(isPrime) {
            System.out.println(n + " là số nguyên tố");
        }
        else {
            System.out.println(n + " không phải là số nguyên tố");
        }
    }
}
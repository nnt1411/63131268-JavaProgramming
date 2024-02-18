import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập cạnh của khối lập phương: ");  
	    double canh = scanner.nextDouble();
	    
	    double TheTich = canh * canh * canh;
	    
		System.out.printf("Thể tích của khối lập phương: %.1f ", TheTich); 
	}

}

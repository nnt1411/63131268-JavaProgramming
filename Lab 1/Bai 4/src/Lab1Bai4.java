import java.util.Scanner;

public class Lab1Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập hệ số a: ");  
	    double a = scanner.nextDouble();
	    
	    System.out.print("Nhập hệ số b: ");  
	    double b = scanner.nextDouble();
	    
	    System.out.print("Nhập hệ số c: ");  
	    double c = scanner.nextDouble();
	    
	    double delta = Math.pow(b, 2) - 4 * a * c;
	    
	    double CanDelta = Math.sqrt(delta);
	    
	    System.out.printf("Delta của pt là: %.1f ", delta);
	    System.out.printf("Căn Delta của pt là: %.1f ", CanDelta);
	}

}

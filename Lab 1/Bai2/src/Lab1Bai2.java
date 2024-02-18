import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Nhập chiều dài: ");  
	    double dai = scanner.nextDouble();
	    
	    System.out.print("Nhập chiều rộng: "); 
	    double rong = scanner.nextDouble();
	    
	    double ChuVi = (dai + rong)*2;
	    double DienTich = dai*rong;
	    double CanhNhoNhat = Math.min(dai, rong);
	    
	    System.out.printf("Chu vi: %.1f \n", ChuVi);
	    System.out.printf("Diện tích: %.1f \n", DienTich);
	    System.out.printf("Cạnh nhỏ nhất: %.1f", CanhNhoNhat);
	}

}

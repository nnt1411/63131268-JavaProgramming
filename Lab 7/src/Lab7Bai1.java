public class ChuNhat {
  double rong;
  double dai;

  public ChuNhat(double rong, double dai) {
    this.rong = rong;
    this.dai = dai;
  }

  public double getChuVi() {
    return (rong + dai) * 2;
  }
  
  public double getDienTich() {
    return rong * dai; 
  }

  public void xuat() {
    System.out.println("Chieu rong: " + rong);
    System.out.println("Chieu dai: " + dai);
    System.out.println("Dien tich: " + getDienTich());
    System.out.println("Chu vi: " + getChuVi());
  }
}

public class Vuong extends ChuNhat {

	  public Vuong(double canh) {
	    super(canh, canh); 
	  }

	  @Override
	  public void xuat() {
	    System.out.println("Canh: " + rong);  
	    System.out.println("Dien tich: " + getDienTich());
	    System.out.println("Chu vi: " + getChuVi());
	  }

	}

public class Lab7Bai1 {

	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    // Nhập hình chữ nhật
	    System.out.print("Nhập chiều dài: ");
	    double dai = scanner.nextDouble();
	    System.out.print("Nhập chiều rộng: ");
	    double rong = scanner.nextDouble();  
	    ChuNhat hcn = new ChuNhat(dai, rong);
	    
	    // Nhập hình vuông 
	    System.out.print("Nhập cạnh: ");
	    double canh = scanner.nextDouble();
	    Vuong hv = new Vuong(canh); 
	    
	    // Xuất kết quả
	    hcn.xuat();
	    hv.xuat();
	  }

	}
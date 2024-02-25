import java.util.Scanner;

class SanPham {
  private String tenSp;
  private double donGia;
  private double giamGia;

  public SanPham(String tenSp, double donGia, double giamGia) {
    this.tenSp = tenSp;
    this.donGia = donGia;
    this.giamGia = giamGia;
  }
  
  public SanPham(String tenSp, double donGia) {
    this(tenSp, donGia, 0); 
  }

  public void setTenSp(String tenSp) {
    this.tenSp = tenSp;
  }

  public void setDonGia(double donGia) {
    this.donGia = donGia;
  }

  public void setGiamGia(double giamGia) {
    this.giamGia = giamGia;
  }

  public void xuat() {
    System.out.println("Tên: " + tenSp);
    System.out.println("Đơn giá: " + donGia);
    System.out.println("Giảm giá: " + giamGia);
  }

}

public class Lab4Bai3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Tạo SP có giảm giá
    System.out.println("Nhập thông tin SP có giảm giá:");
    System.out.print("Tên: ");
    String ten = scanner.nextLine();
    System.out.print("Đơn giá: ");
    double gia = scanner.nextDouble();
    System.out.print("Giảm giá: ");
    double giam = scanner.nextDouble();

    SanPham sp1 = new SanPham(ten, gia, giam);

    // Tạo SP không giảm giá
    System.out.println("\nNhập thông tin SP không giảm giá:"); 
    scanner.nextLine();
    System.out.print("Tên: ");
    ten = scanner.nextLine();
    System.out.print("Đơn giá: ");
    gia = scanner.nextDouble();

    SanPham sp2 = new SanPham(ten, gia);

    // Xuất thông tin 2 SP
    sp1.xuat();
    sp2.xuat();
  }

}
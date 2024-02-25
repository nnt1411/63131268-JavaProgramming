import java.util.Scanner;

class SanPham {
  String tenSp;
  double donGia;
  double giamGia;

  double getThueNhapKhau() {
    return donGia * 0.1; 
  }

  void xuat() {
    System.out.println("Tên sản phẩm: " + tenSp);
    System.out.println("Đơn giá: " + donGia);
    System.out.println("Giảm giá: " + giamGia);
    System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
  }
}

public class Lab4Bai2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    SanPham sp1 = new SanPham();
    SanPham sp2 = new SanPham();

    // Nhập thông tin sp1
    System.out.println("Nhập thông tin sản phẩm 1:");
    System.out.print("Tên: ");
    sp1.tenSp = scanner.nextLine();
    System.out.print("Đơn giá: ");
    sp1.donGia = scanner.nextDouble();
    System.out.print("Giảm giá: ");
    sp1.giamGia = scanner.nextDouble();

    // Nhập thông tin sp2
    System.out.println("\nNhập thông tin sản phẩm 2:");
    scanner.nextLine(); // Đọc bỏ dòng trống
    System.out.print("Tên: ");
    sp2.tenSp = scanner.nextLine();
    System.out.print("Đơn giá: ");
    sp2.donGia = scanner.nextDouble();
    System.out.print("Giảm giá: ");  
    sp2.giamGia = scanner.nextDouble();

    // Xuất thông tin 2 sản phẩm
    sp1.xuat();
    System.out.println();
    sp2.xuat();
  }

}
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

public class Lab4Bai1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    SanPham sp = new SanPham();

    System.out.print("Nhập tên sản phẩm: ");
    sp.tenSp = scanner.nextLine();

    System.out.print("Nhập đơn giá: ");
    sp.donGia = scanner.nextDouble();

    System.out.print("Nhập giảm giá: ");
    sp.giamGia = scanner.nextDouble();

    sp.xuat();
  }
}
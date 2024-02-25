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

  public String getTenSp() {
    return tenSp;
  }

  public void setTenSp(String tenSp) {
    this.tenSp = tenSp;
  }

  public double getDonGia() {
    return donGia;
  }

  public void setDonGia(double donGia) {
    this.donGia = donGia;
  }

  public double getGiamGia() {
    return giamGia;
  }

  public void setGiamGia(double giamGia) {
    this.giamGia = giamGia;
  }

  public double getThueNhapKhau() {
    return donGia * 0.1;
  }

  public void xuat() {
    System.out.println("Tên: " + getTenSp());
    System.out.println("Đơn giá: " + getDonGia());
    System.out.println("Giảm giá: " + getGiamGia());
    System.out.println("Thuế NK: " + getThueNhapKhau());
  }

}

public class Lab4Bai4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    SanPham sp = new SanPham("", 0, 0);

    System.out.print("Nhập tên SP: ");
    sp.setTenSp(scanner.nextLine());

    System.out.print("Nhập đơn giá: ");
    sp.setDonGia(scanner.nextDouble());

    System.out.print("Nhập giảm giá: ");
    sp.setGiamGia(scanner.nextDouble());

    sp.xuat();
  }

}
import java.util.Scanner;

class SanPham {
  String ten;
  double gia;
  String hang;

  public SanPham(String ten, double gia, String hang) {
    this.ten = ten;
    this.gia = gia;
    this.hang = hang;
  }

  public void xuat() {
    System.out.println("Tên SP: " + this.ten);
    System.out.println("Giá: " + this.gia);
    System.out.println("Hãng: " + this.hang);
  }
}

public class Lab6Bai2 {

  public static void main(String[] args) {
    SanPham[] dsSP = new SanPham[5];
    Scanner scanner = new Scanner(System.in);

    // nhập danh sách sản phẩm
    for(int i = 0; i < dsSP.length; i++) {
      System.out.print("Nhập tên SP thứ " + (i+1) + ": ");
      String ten = scanner.nextLine();

      System.out.print("Nhập giá SP: ");
      double gia = scanner.nextDouble();

      System.out.print("Nhập hãng sản xuất: ");
      scanner.nextLine(); 
      String hang = scanner.nextLine();

      dsSP[i] = new SanPham(ten, gia, hang);
    }

    // lọc và xuất các SP của hãng Nokia
    for(SanPham sp : dsSP) {
      if(sp.hang.equals("Nokia")) {
        sp.xuat();
        System.out.println("");
      }
    }
  }

}
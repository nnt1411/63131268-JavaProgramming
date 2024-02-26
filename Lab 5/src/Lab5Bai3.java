import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {
  String ten;
  double gia;

  public SanPham(String ten, double gia) {
    this.ten = ten;
    this.gia = gia;
  }
}

public class Lab5Bai3 {

  public static void main(String[] args) {
    ArrayList<SanPham> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      showMenu();

      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          nhap(list, scanner);
          break;
        case 2:
          sapXepGiamDan(list);
          xuat(list);
          break;
        case 3:
          xoaTheoTen(list, scanner);
          break;
        case 4:
          tinhGiaTrungBinh(list);
          break;
        default:
          System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
      }
    }

  }

  public static void showMenu() {
    System.out.println("-----------------MENU-----------------");
    System.out.println("1. Nhập danh sách sản phẩm");
    System.out.println("2. Sắp xếp giảm dần theo giá và xuất danh sách");
    System.out.println("3. Xóa sản phẩm theo tên"); 
    System.out.println("4. Tính và xuất giá trung bình");
    System.out.println("5. Thoát");
    System.out.println("---------------------------------------");
    System.out.print("Lựa chọn: ");
  }

  public static void nhap(ArrayList<SanPham> list, Scanner scanner) {
    System.out.print("Nhập số lượng sản phẩm: ");
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print("Nhập tên sản phẩm: ");
      String ten = scanner.nextLine();
      System.out.print("Nhập giá sản phẩm: ");
      double gia = scanner.nextDouble();

      SanPham sp = new SanPham(ten, gia);
      list.add(sp);
    }
  }

  public static void xuat(ArrayList<SanPham> list) {
    for (SanPham sp : list) {
      System.out.println("Tên: " + sp.ten + " - Giá: " + sp.gia);
    }
  }

  public static void sapXepGiamDan(ArrayList<SanPham> list) {
    Collections.sort(list, new Comparator<SanPham>() {
      public int compare(SanPham sp1, SanPham sp2) {
        return Double.compare(sp2.gia, sp1.gia); 
      }
    });
  }

  public static void xoaTheoTen(ArrayList<SanPham> list, Scanner scanner) {
    System.out.print("Nhập tên cần xóa: ");
    String ten = scanner.nextLine();

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).ten.equalsIgnoreCase(ten)) {
        list.remove(i);
        System.out.println("Đã xóa sản phẩm có tên " + ten);
        return;
      }
    }

    System.out.println("Không tìm thấy sản phẩm có tên " + ten);
  }

  public static void tinhGiaTrungBinh(ArrayList<SanPham> list) {
    double tong = 0;
    for (SanPham sp : list) {
      tong += sp.gia;
    }
    double trungBinh = tong / list.size();
    System.out.printf("Giá trung bình: %.2f", trungBinh);
  }
}
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class SinhVien {
  private String hoTen;
  private String email;
  private String sdt;
  private String cmnd;

  public SinhVien(String hoTen, String email, String sdt, String cmnd) {
    this.hoTen = hoTen;
    this.email = email;
    this.sdt = sdt; 
    this.cmnd = cmnd;
  }

  public void xuat() {
    System.out.println("Họ tên: " + this.hoTen);
    System.out.println("Email: " + this.email);
    System.out.println("SĐT: " + this.sdt);
    System.out.println("CMND: " + this.cmnd);
  }
}

public class Lab6Bai3 {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    Pattern patternEmail = Pattern.compile("^[A-Za-z0-9.+_-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    Pattern patternSdt = Pattern.compile("^0\\d{9,10}$");
    Pattern patternCmnd = Pattern.compile("\\d{9}");

    SinhVien[] dsSV = new SinhVien[2];

    for (int i = 0; i < dsSV.length; i++) {
      String hoTen = nhapHoTen(scanner);
      String email = nhapEmail(scanner, patternEmail);  
      String sdt = nhapSDT(scanner, patternSdt);
      String cmnd = nhapCMND(scanner, patternCmnd);

      SinhVien sv = new SinhVien(hoTen, email, sdt, cmnd);
      dsSV[i] = sv;
    }

    // xuất thông tin sinh viên
    for (SinhVien sv : dsSV) {
      sv.xuat();
      System.out.println();
    }

    scanner.close();
  }

  public static String nhapHoTen(Scanner scanner) {
    System.out.print("Nhập họ tên: ");
    return scanner.nextLine();
  }

  public static String nhapEmail(Scanner scanner, Pattern pattern) {
    while (true) {
      System.out.print("Nhập email: ");
      String email = scanner.nextLine();

      Matcher matcher = pattern.matcher(email);
      if (matcher.matches()) {
        return email;
      }
      System.out.println("Email không hợp lệ. Vui lòng nhập lại!");
    }
  }

  public static String nhapSDT(Scanner scanner, Pattern pattern) {
    while (true) {
      System.out.print("Nhập SĐT: ");
      String sdt = scanner.nextLine();

      Matcher matcher = pattern.matcher(sdt);
      if (matcher.matches()) { 
        return sdt;
      }
      System.out.println("SĐT không hợp lệ. Vui lòng nhập lại!");
    }
  }

  public static String nhapCMND(Scanner scanner, Pattern pattern) {
    while (true) {
      System.out.print("Nhập CMND: ");
      String cmnd = scanner.nextLine();

      Matcher matcher = pattern.matcher(cmnd);
      if (matcher.matches()) {
        return cmnd;
      } 
      System.out.println("CMND không hợp lệ. Vui lòng nhập lại!");
    }
  }

}
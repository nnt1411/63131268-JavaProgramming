import java.util.ArrayList;
import java.util.Scanner;

public class Lab5Bai1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Double> list = new ArrayList<>();

    while (true) {
      System.out.print("Nhập số thực: ");
      double x = scanner.nextDouble();
      list.add(x);

      System.out.print("Nhập thêm (Y/N)?");
      if(scanner.next().equalsIgnoreCase("N")) {
        break;
      }
    }

    // Xuất danh sách
    System.out.println("Danh sách vừa nhập:");
    for(Double num : list) {
      System.out.print(num + " ");
    }

    // Tính tổng
    double tong = 0;
    for(Double num : list) {
      tong += num;
    }
    System.out.println("\nTổng = " + tong);
  }
}
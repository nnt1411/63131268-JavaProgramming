import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab5Bai2 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      showMenu();
      
      int choice = scanner.nextInt();
      scanner.nextLine();
      
      switch(choice) {
        case 1:
          nhap(list, scanner);
          break;
        case 2: 
          xuat(list);
          break;
        case 3:
          Collections.shuffle(list);
          xuat(list);
          break;
        case 4:
          sapXepGiamDan(list);
          xuat(list);
          break;
        case 5:
          xoaTheoTen(list, scanner);
          break;
        case 6:
          return;
        default:
          System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
      }
    }
  }
  
  public static void showMenu() {
    System.out.println("+-------------------------------------+"); 
    System.out.println("1. Nhập danh sách họ và tên");
    System.out.println("2. Xuất danh sách vừa nhập"); 
    System.out.println("3. Xuất danh sách ngẫu nhiên");
    System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
    System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
    System.out.println("6. Kết thúc");
    System.out.println("+-------------------------------------+");
    System.out.print("Chọn chức năng: ");
  }
  
  public static void nhap(ArrayList<String> list, Scanner scanner) {
    System.out.print("Nhập họ tên (nhập 'stop' để dừng): ");
    while (true) {
      String name = scanner.nextLine();
      if (name.equalsIgnoreCase("stop")) {
        break;
      }
      list.add(name);
      System.out.print("Nhập họ tên (nhập 'stop' để dừng): "); 
    }
  }
  
  public static void xuat(ArrayList<String> list) {
    for(String name : list) {
      System.out.println(name);
    }
  }
   
  public static void sapXepGiamDan(ArrayList<String> list) {
    Collections.sort(list); 
    Collections.reverse(list);
  }
   
  public static void xoaTheoTen(ArrayList<String> list, Scanner scanner) {
    System.out.print("Nhập tên cần xóa: ");
    String name = scanner.nextLine();
    
    for(int i = 0; i < list.size(); i++) {
      if(list.get(i).equalsIgnoreCase(name)) {
        list.remove(i);
        System.out.println("Đã xóa " + name);
        return;
      }
    }
    
    System.out.println(name + " không tồn tại trong danh sách!");
  }
}
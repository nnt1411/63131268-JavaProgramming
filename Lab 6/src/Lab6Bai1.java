import java.util.Scanner;

public class Lab6Bai1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Nhập họ và tên: ");
    String hoTen = scanner.nextLine();
    
    // tách chuỗi thành mảng các từ 
    String[] words = hoTen.split(" ");
    
    // lấy họ
    String ho = words[0];
    
    // lấy tên 
    String ten = words[words.length - 1];
    
    // lấy tên đệm
    String tenDem = "";
    if(words.length > 2) {
      tenDem = hoTen.substring(ho.length()+1, hoTen.length()-ten.length()-1); 
    }
    
    // in kết quả
    System.out.println("Họ: " + ho.toUpperCase());
    System.out.println("Tên đệm: " + tenDem);
    System.out.println("Tên: " + ten.toUpperCase());
  }
}
import java.util.Scanner;

public class Lab3Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số sinh viên: ");
        int n = scanner.nextInt();
        
        String[] hoTen = new String[n];
        double[] diem = new double[n];
        
        for(int i = 0; i < n; i++) {
            System.out.print("Họ tên sinh viên " + (i+1) + ": ");
            hoTen[i] = scanner.next();
            
            System.out.print("Điểm sinh viên " + (i+1) + ": ");    
            diem[i] = scanner.nextDouble();
        }
        
        // Xuất danh sách kèm xếp loại học lực
        for(int i = 0; i < n; i++) {
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            
            if(diem[i] < 5) {
                System.out.println("Học lực: Yếu");
            }
            else if(diem[i] < 6.5) {
                System.out.println("Học lực: Trung bình"); 
            }
            else if(diem[i] < 7.5) {
                System.out.println("Học lực: Khá");
            }
            else if(diem[i] < 9) {
                System.out.println("Học lực: Giỏi");
            }
            else {
                System.out.println("Học lực: Xuất sắc"); 
            }
            System.out.println();          
        }

        // Sắp xếp danh sách sinh viên theo điểm GIẢM DẦN
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(diem[i] < diem[j]) {
                    // Hoán đổi vị trí sinh viên trong 2 mảng song song
                    double temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;
                    
                    String tmp = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tmp;
                }
            }
        }
        
        // Xuất danh sách sau khi sắp xếp
        System.out.println("Danh sách sau khi sắp xếp:");
        for(int i = 0; i < n; i++) {
            System.out.println(hoTen[i] + " - " + diem[i]);
        }
    }

}
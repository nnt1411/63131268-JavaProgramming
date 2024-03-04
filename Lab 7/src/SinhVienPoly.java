public abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;
    
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc() {
        double diem = getDiem();
        if(diem < 5) return "Yếu";
        if(diem < 6.5) return "Trung bình";
        if(diem < 7.5) return "Khá"; 
        if(diem < 9) return "Giỏi";
        return "Xuất sắc";
    }
    
    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}
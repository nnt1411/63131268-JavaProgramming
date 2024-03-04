
public class XPoly {
	
	private XPoly() {}
    
    public static double sum(double... x) {
        double total = 0;
        for (double value : x) {
            total += value;
        }
        return total;
    }
    
    public static double min(double... x) {
        double min = Double.MAX_VALUE; // Khởi tạo min với giá trị lớn nhất
        for (double value : x) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    
    public static double max(double... x) {
        double max = Double.MIN_VALUE; // Khởi tạo max với giá trị nhỏ nhất
        for (double value : x) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}

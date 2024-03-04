
public class XPoly {
	
	private XPoly() {}
    
    public static double sum(double... x) {
        double total = 0;
        for (double value : x) {
            total += value;
        }
        return total;
    }

}

public class BmiService {
    public int calculate(int a, double b) {
        int result;
        int c = (int) (b * b);
        result = a / c;

        return result;
    }
}
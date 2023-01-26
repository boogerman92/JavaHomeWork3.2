public class BmiService {
    public int calculate(int weight, double height) {
        int result;
        int doubleHeight = (int) (height * height);
        result = weight / doubleHeight;

        return result;
    }
}

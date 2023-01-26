public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(60, 1.5);
        System.out.println("Индекс массы вашего тела равен " + bmi);

    }
}

import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int count = service.calcSqrAmount(99, 99);
        System.out.println("Количество чисел в диапозоне, при возведении в квадрат: " + count);
    }
}

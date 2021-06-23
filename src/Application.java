import domain.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("결과는 :" + calculator.Calculation());
    }
}

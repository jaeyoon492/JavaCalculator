package domain;

public class OutputPlace {
    Calculator calculator = new Calculator();

    public void outputView(){
        System.out.println("결과는 :" + calculator.Calculation());
    }
}

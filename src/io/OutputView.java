package io;

import domain.Calculator;

public class OutputView {
    Calculator calculator = new Calculator();

    public void outputView(){
        System.out.println("결과는 :" + calculator.Calculation());
    }
}

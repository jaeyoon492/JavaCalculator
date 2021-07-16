package domain;

import io.InputView;

public class Calculator {
    int result;
    int i;
    InputView inputView = new InputView();

    public int Calculation() {
        inputView.userInput();
        inputView.getOperations();

        for (i = 0; i < inputView.numberArr.length; i++) {
            switch (inputView.operatorArr[i]) {
                case "+":
                    result = inputView.numberArr[i] + inputView.numberArr[i + 1];
                    break;
                case "-":
                    result = inputView.numberArr[i] - inputView.numberArr[i + 1];
                    break;
                case "*":
                    result = inputView.numberArr[i] * inputView.numberArr[i + 1];
                    break;
                case "/":
                    result = inputView.numberArr[i] / inputView.numberArr[i + 1];
                    break;
            }
        }
        return result;
    }
}


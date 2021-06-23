package domain;

public class Calculator {
    InputPlace inputPlace = new InputPlace();
    public int numberArea = inputPlace.numberArr.length;

    public int Calculation() {
        int result = 0;
        inputPlace.setOperations();
        for (int i = 0; i < numberArea; i++) {
            switch (inputPlace.operatorArr[i]) {
                case "+":
                    result = inputPlace.numberArr[i] + inputPlace.numberArr[i + 1];
                    break;
                case "-":
                    result = inputPlace.numberArr[i] - inputPlace.numberArr[i + 1];
                    break;
                case "*":
                    result = inputPlace.numberArr[i] * inputPlace.numberArr[i + 1];
                    break;
                case "/":
                    result = inputPlace.numberArr[i] / inputPlace.numberArr[i + 1];
                    break;
            }
        }
        return result;
    }
}

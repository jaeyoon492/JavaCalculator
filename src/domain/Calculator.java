package domain;

public class Calculator {
    InputPlace inputPlace = new InputPlace();
    int numberArea = 0;

    public int Calculation() {
        int result = 0;
        inputPlace.setOperations();
        for (int i = 0; i < numberArea; i++) {  // 1 + 2 - 3 * 2
            for (int j = 1; j < 4; j++){
                switch (inputPlace.operatorArr[i]) {
                    case "+":
                        result = inputPlace.numberArr[i] + inputPlace.numberArr[i + j];
                        break;
                    case "-":
                        result = inputPlace.numberArr[i] - inputPlace.numberArr[i + j];
                        break;
                    case "*":
                        result = inputPlace.numberArr[i] * inputPlace.numberArr[i + j];
                        break;
                    case "/":
                        result = inputPlace.numberArr[i] / inputPlace.numberArr[i + j];
                        break;
                }
            }
        }
        return result;
    }
}

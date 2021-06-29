package domain;

public class Calculator {
    InputPlace inputPlace = new InputPlace();

    public int Calculation() {
        int result = 0;
        inputPlace.setOperations();
        inputPlace.getOperations();
        do {
            for (int i = 1; i < inputPlace.numberArr.length; i++){
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
        }while (i == inputPlace.numberArr.length -1);
        return result;
    }
}

package io;

import java.util.Arrays;
import java.util.Scanner;

public class InputView {
    private int a = 1;
    private int b = 1;
    public String[] Value;
    public int[] numberArr;
    public String[] operatorArr;
    Scanner scanner = new Scanner(System.in);

    public void userInput() {   // 1 + 2 + 3
        System.out.print("식을 입력해 주세요.[Ex : 1 + 2] : ");
        Value = scanner.nextLine().split("\\s");    //1+2+3
        System.out.println(Arrays.toString(Value));
    }

    private void getOddNumbers() {
        for (int i = 0; i < Value.length; i++) {
            if (i % 2 == 0) {
                a++;
            } else {
                b++;
            }
        }
    }

    public void getOperations() {
        getOddNumbers();
        numberArr = new int[a];
        operatorArr = new String[b];
        for (int i = 0; i < Value.length; i++) {
            if (i % 2 == 0) {
                numberArr[i] = Integer.parseInt(Value[i]);
            } else {
                operatorArr[i - 1] = Value[i];
            }
        }
    }
}


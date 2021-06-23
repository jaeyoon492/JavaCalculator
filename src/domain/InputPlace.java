package domain;

import java.util.Scanner;

public class InputPlace {
    int[] numberArr;
    String[] operatorArr;
    Scanner scanner = new Scanner(System.in);

    public void setOperations() { // 1 * 2
        System.out.print("식을 입력해 주세요.(Ex : 1 + 2) : ");
        String[] Value = scanner.nextLine().split("\\s");
        numberArr = new int[Value.length];

        for (int i = 0; i < Value.length; i++) {
            if (i % 2 == 0) {
                numberArr[i] = Integer.parseInt(Value[i]);
            } else {
                operatorArr[i - 1] = Value[i];
            }
        }
    }
}


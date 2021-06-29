package domain;

import java.util.Arrays;
import java.util.Scanner;

public class InputPlace {
    private int a;
    private int b;
    public String[] Value;
    public int[] numberArr;
    public String[] operatorArr;
    Scanner scanner = new Scanner(System.in);

    public void setOperations() {   // 1 + 2 + 3
        System.out.print("식을 입력해 주세요.[Ex : 1 + 2] : ");
        Value = scanner.nextLine().trim().split("\\s");    //1+2+3
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
        a+=1;
        b+=1;
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


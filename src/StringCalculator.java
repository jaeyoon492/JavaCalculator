import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// 1번 구현을 연습할지
// 2번 더 나은 프로그램을 짜는 방법을 공부할지.
public class StringCalculator {
    // 1차는 -> 구현 ->  |||| -> 메소드를 쪼개는 형태 -> 얘네중에 성격에 비슷한 애들을 묶어서 클래스 -> 다형성, 상속 .....

    public void run() {
        displayInputMessage();
        String userInput = getUserInput();
        int result = calculate(userInput);
        displayOutputMessage(result);
    }

    private int calculate(String userInput) {
        String programDefaultSplitDelimiter = " ";
        String[] userInputArray = userInput.split(programDefaultSplitDelimiter);

        List<String> operators = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        for (int index = 0; index < userInputArray.length; index++) {
            if (index % 2 == 0) {
                numbers.add(Integer.parseInt(userInputArray[index]));
            } else if (index % 2 == 1) {
                operators.add(userInputArray[index]);
            }
        }

        int result = numbers.get(0); // 1 + 3 - 4의 경우 1을 기준값으로 정하고, 뒤에 오는 값들을 계산합니다.
        for (int operatorIndex = 0; operatorIndex < operators.size(); operatorIndex++) {
            String operator = operators.get(operatorIndex);
            Integer targetNumber = numbers.get(operatorIndex + 1);
            switch (operator) {
                case "+":
                    result = result + targetNumber;
                    break;
                case "-":
                    result = result - targetNumber;
                    break;
                case "*":
                    result = result * targetNumber;
                    break;
                case "/":
                    result = result / targetNumber;
                    break;
            }
        }
        return result;
    }

    private String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

    private void displayOutputMessage(int result) {
        System.out.println("계산이 완료되었습니다! 결과는 : " + result);
        System.out.println("============================================");
    }

    private void displayInputMessage() {
        System.out.println("============================================");
        System.out.println("문자열 계산기 입니다! 계산하고 싶은 식을 입력하세요.");
        System.out.println("친절하게 바꿨다.");
        System.out.println("============================================");
    }
}
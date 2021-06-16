import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputPlace {
    Scanner scanner = new Scanner(System.in);
    List<Integer> valueList = new ArrayList<>();

    public void setValue(){
        System.out.print("값을 입력 하시오 : ");
        valueList.add(scanner.nextInt());
    }

}

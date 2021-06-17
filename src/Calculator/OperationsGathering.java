package Calculator;

import java.util.ArrayList;
import java.util.List;

public class OperationsGathering {
    List<Integer> valueList = new ArrayList<>();
    InputPlace inputPlace = new InputPlace();

    int n;
    int[] numberArrays = new int[n];

    void addNumberList(){
        valueList.add(inputPlace.scanner.nextInt());
        n++;
    }

}

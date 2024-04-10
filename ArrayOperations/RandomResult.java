package ArrayOperations;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomResult {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numberList = new ArrayList<>(200);
        int[] numberArray = new int[200];

        // Taking input from file
        Scanner sc = new Scanner(new FileReader("MOCK_DATA.txt"));
        while (sc.hasNext()) {
            numberList.add(sc.nextInt());
        }
        sc.close();

        // Storing value from ArrayList to Array
        for (int i = 0; i < numberList.size(); i++) {
            numberArray[i] = numberList.get(i);
        }

        RandomOperation randOp = new RandomOperation();

    }
}

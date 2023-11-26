package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateRandomNumber {

    public List<Integer> createNumber() {
        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < 9) {
            int number = rand.nextInt(7) + 1;

            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        }

        return numbers;
    }

}

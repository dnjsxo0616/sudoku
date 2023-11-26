package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumber {
    private static final Integer MIN_NUMBER = 1;
    private static final Integer MAX_NUMBER = 8;

    private final List<Integer> randomNumber;

    public RandomNumber() {
        this.randomNumber = createNumber();
    }


    private static List<Integer> createNumber() {
        List<Integer> numbers = IntStream.rangeClosed(MIN_NUMBER, MAX_NUMBER).boxed().collect(Collectors.toList());

        Collections.shuffle(numbers);

        return numbers;
    }

    public List<Integer> getRandomNumber() {
        return Collections.unmodifiableList(randomNumber);
    }

    public void changePosition(List<Integer> changeNumber) {

        int firstIndex = randomNumber.indexOf(changeNumber.get(0));
        int secondIndex = randomNumber.indexOf(changeNumber.get(1));

        Collections.swap(randomNumber, firstIndex, secondIndex);
    }

    public boolean checkNumber() {
        List<Integer> answerNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        return randomNumber.equals(answerNumber);
    }

}

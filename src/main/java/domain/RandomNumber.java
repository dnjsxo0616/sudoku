package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumber {

    private final List<Integer> randomNumber;

    public RandomNumber() {
        this.randomNumber = createNumber();
    }

    ;

    private static List<Integer> createNumber() {
        List<Integer> numbers = IntStream.rangeClosed(1, 8).boxed().collect(Collectors.toList());

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

    public boolean checkNumber(){
        List<Integer> answerNumber = Arrays.asList(1,2,3,4,5,6,7,8);
        return randomNumber.equals(answerNumber);
    }

}

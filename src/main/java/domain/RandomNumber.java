package domain;

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

}

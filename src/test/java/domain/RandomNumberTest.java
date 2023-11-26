package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RandomNumberTest {
    RandomNumber randomNumber = new RandomNumber();

    @Test
    void 중복_검사() {
        Set<Integer> validateNumber = new HashSet<>(randomNumber.getRandomNumber());
        Assertions.assertThat(randomNumber.getRandomNumber().size()).isEqualTo(validateNumber.size());
    }

}
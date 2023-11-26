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
        List<Integer> randomNumber = this.randomNumber.createNumber();
        Set<Integer> validateNumber = new HashSet<>(randomNumber);

        Assertions.assertThat(randomNumber.size()).isEqualTo(validateNumber.size());
    }

}
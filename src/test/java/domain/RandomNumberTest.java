package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RandomNumberTest {
    RandomNumber randomNumber = new RandomNumber();

    @Test
    void 중복_검사() {
        Set<Integer> validateNumber = new HashSet<>(randomNumber.getRandomNumber());
        Assertions.assertThat(randomNumber.getRandomNumber().size()).isEqualTo(validateNumber.size());
    }

    @Test
    public void 자리_변경_테스트() {
        List<Integer> beforeChange = new ArrayList<>(randomNumber.getRandomNumber());

        randomNumber.changePosition(new ChangeNumber("4, 7"));

        int beforeIndex4 = beforeChange.indexOf(4);
        int beforeIndex7 = beforeChange.indexOf(7);

        assertEquals(beforeIndex4, randomNumber.getRandomNumber().indexOf(7));
        assertEquals(beforeIndex7, randomNumber.getRandomNumber().indexOf(4));
    }

}
package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberParserTest {
    @Test
    void 숫자_변경_테스트() {
        NumberParser numberParser = new NumberParser();

        assertDoesNotThrow(() -> numberParser.parseNumber("2,3"));
    }

    @Test
    void 숫자_변경_오류_테스트() {
        NumberParser numberParser = new NumberParser();

        Assertions.assertThatThrownBy(()-> numberParser.parseNumber("d,3"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자로 변경할 수 없는 문자입니다.");
    }
}
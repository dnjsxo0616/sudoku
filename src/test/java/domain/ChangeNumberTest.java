package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ChangeNumberTest {

    @Test
    void ChangeNumber_생성_테스트() {
        assertDoesNotThrow(() -> new ChangeNumber("2,3"));
        assertDoesNotThrow(() -> new ChangeNumber("2, 3"));
    }

    @Test
    void ChangeNumber_생성_오류_테스트() {
        assertThrows(IllegalArgumentException.class, () -> new ChangeNumber(" 2,3"));
    }

    @Test
    void ChangeNumber_중복_오류_테스트() {
        assertThatThrownBy(() -> new ChangeNumber("2, 2")).isInstanceOf(IllegalArgumentException.class).hasMessage("중복된 숫자가 존재합니다.");
    }

    @Test
    void ChangeNubmer_숫자_범위_오류_테스트() {
        assertThatThrownBy(()-> new ChangeNumber("1,11"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자의 범위는 1~8이어야 합니다.");
    }

    @Test
    void changeNumber_숫자_입력_오류_테스트() {
        assertThatThrownBy(()-> new ChangeNumber("2"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("잘못 입력하셨습니다. 다시 입력해 주세요.");

        assertThatThrownBy(()-> new ChangeNumber("2,   3"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("잘못 입력하셨습니다. 다시 입력해 주세요.");
    }
}
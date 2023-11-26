package domain;

import java.util.*;
import java.util.stream.Collectors;

public class ChangeNumber {

    private static final Integer MIN_SIZE = 1;
    private static final Integer MAX_SIZE = 5;
    private static final Integer NUMBER_RANGE_MIX_SIZE = 1;
    private static final Integer NUMBER_RANGE_MAX_SIZE = 8;

    private final List<Integer> changeNumber;
    private final NumberParser numberParser = new NumberParser();

    public ChangeNumber(String input) {
        validateWhitespace(input);
        validateSize(input);
        List<Integer> numbers = numberParser.parseNumber(input);
        validateRange(numbers);
        validateDuplicate(numbers);
        this.changeNumber = numbers;
    }

    private static void validateSize(String input) {
        if (input.length() == MIN_SIZE || input.length() > MAX_SIZE) {
            throw new IllegalArgumentException("잘못 입력하셨습니다. 다시 입력해 주세요.");
        }
    }

    private static void validateWhitespace(String input) {
        if (input.startsWith(" ")) {
            throw new IllegalArgumentException("입력의 첫 문자 앞에 공백이 있습니다.");
        }
    }

    private static void validateRange(List<Integer> changeNumber) {
        for (int number : changeNumber) {
            if (number > NUMBER_RANGE_MAX_SIZE || number < NUMBER_RANGE_MIX_SIZE) {
                throw new IllegalArgumentException("숫자의 범위는 1~8이어야 합니다.");
            }
        }
    }

    private static void validateDuplicate(List<Integer> changeNumber) {
        Set<Integer> validateNumber = new HashSet<>(changeNumber);
        if (changeNumber.size() != validateNumber.size()) {
            throw new IllegalArgumentException("중복된 숫자가 존재합니다.");
        }
    }

    public List<Integer> getChangeNumber() {
        return changeNumber;
    }
}

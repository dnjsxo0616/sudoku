package domain;

import java.util.*;
import java.util.stream.Collectors;

public class ChangeNumber {

    private final List<Integer> changeNumber;

    public ChangeNumber(String input) {
        validateWhitespace(input);
        List<Integer> numbers = parseNumber(input);
        validateRange(numbers);
        validateDuplicate(numbers);
        this.changeNumber = numbers;
    }

    private List<Integer> parseNumber(String input) {
        List<Integer> parseNumber = new ArrayList<>();
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .map(ChangeNumber::validateParseInt)
                .collect(Collectors.toList());
    }

    private static Integer validateParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자로 변경할 수 없는 문자입니다.");
        }
    }

    private static void validateWhitespace(String input) {
        if (input.startsWith(" ")) {
            throw new IllegalArgumentException("입력의 첫 문자 앞에 공백이 있습니다.");
        }
    }

    private static void validateRange(List<Integer> changeNumber) {
        for (int number : changeNumber) {
            if (number > 8 || number < 1) {
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

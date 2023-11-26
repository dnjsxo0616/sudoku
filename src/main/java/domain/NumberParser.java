package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberParser {

    public List<Integer> parseNumber(String input) {
        List<Integer> parseNumber = new ArrayList<>();
        return Arrays.stream(input.split(","))
                .map(str -> str.trim())
                .map(NumberParser::validateParseInt)
                .collect(Collectors.toList());
    }

    private static Integer validateParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자로 변경할 수 없는 문자입니다.");
        }
    }
}

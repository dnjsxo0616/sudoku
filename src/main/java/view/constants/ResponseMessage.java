package view.constants;

import domain.CountRound;

public enum ResponseMessage {

    RESPONSE_MAIN_START("간단 숫자 퍼즐"),
    RESPONSE_CHANGE_NUMBER("교환할 두 숫자를 입력>"),
    RESPONSE_COMPLETE("축하합니다! 3턴만에 퍼즐을 완성하셨습니다!"),
    RESPONSE_TURN_COUNT("Turn %d");
    private final String message;

    ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getFormattedMessage(int count) {
        return String.format(message, count);
    }
}


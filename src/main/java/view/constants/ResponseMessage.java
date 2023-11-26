package view.constants;

public enum ResponseMessage {

    RESPONSE_MAIN_START("간단 숫자 퍼즐");
    private final String message;

    ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}


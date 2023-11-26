package view.output;

import view.constants.ResponseMessage;

public class OutputWriter {

    public static void println(ResponseMessage responseMessage) {
        System.out.println(responseMessage.getMessage());
    }

    public static void printNewLine() {
        System.out.println();
    }
}

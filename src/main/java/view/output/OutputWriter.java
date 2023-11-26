package view.output;

import view.constants.ResponseMessage;

public class OutputWriter {

    public static void println(ResponseMessage responseMessage) {
        System.out.println(responseMessage.getMessage());
    }

    public static void println(ResponseMessage responseMessage, int count){
        System.out.println(responseMessage.getFormattedMessage(count));
    }

    public static void printNewLine() {
        System.out.println();
    }
}

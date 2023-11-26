package controller;

import domain.ChangeNumber;
import domain.CountRound;
import domain.RandomNumber;
import view.constants.ResponseMessage;
import view.input.InputReader;
import view.output.OutputWriter;

public class Controller {
   public void start() {
       OutputWriter.println(ResponseMessage.RESPONSE_MAIN_START);

       RandomNumber randomNumber = new RandomNumber();
       CountRound countRound = new CountRound();

       while(!randomNumber.checkNumber()) {
           countRound.increaseCount();

           OutputWriter.println(ResponseMessage.RESPONSE_TURN_COUNT, countRound.getCount());
           System.out.println(randomNumber.getRandomNumber());
           OutputWriter.println(ResponseMessage.RESPONSE_CHANGE_NUMBER);

           boolean isValidInput = false;
           while(!isValidInput) {
               try {
                   ChangeNumber changeNumber = new ChangeNumber(InputReader.readInput());
                   randomNumber.changePosition(changeNumber.getChangeNumber());
                   isValidInput = true;
               } catch (IllegalArgumentException e) {
                   OutputWriter.println(e.getMessage());
               }
           }

           System.out.println(randomNumber.getRandomNumber());
           OutputWriter.printNewLine();
       }

       OutputWriter.println(ResponseMessage.RESPONSE_COMPLETE, countRound.getCount());

   }
}

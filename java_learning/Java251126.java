package java_learning;
import java.io.*;

class FoolException extends Exception {}

public class Java251126 {
    public void shouldBeRun() {
        System.out.println("ok thanks");
    }
    public void sayNick(String nick) throws FoolException {
        // try {
            if("바보".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 " + nick + " 입니다.");
        // } 
        // catch(FoolException e) {
        //     System.err.println("FoolException이 발생했습니다.");

        // }
    }
    public static void main(String[] args) {
        Java251126 java251126 = new Java251126();
        try {

            java251126.sayNick("바보");
            java251126.sayNick("헬로");
        } catch (FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }

        // Exceptions have 2 types. 
        // The first exceptions are RuntimeException. They occur at runtime
        // The Second exceptions are literally Exception. They occur when they are at compile time
  
    }
}

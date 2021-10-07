package tarleton.answerquestion;

import edu.tarleton.logging.Logger;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author Joe Meier
 */
public class Main {
     public static void main(String[] args) throws IOException {
         Logger logger = new Logger("app.log");
         LocalDateTime dt = LocalDateTime.now();
         System.out.println("How old is Java?");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         if(num == 26){
             System.out.println("Correct.");
         }
         else{
             System.out.println("Java is 26.");
         }
         logger.log("Application Executed: "+ dt.toString());
     }
}

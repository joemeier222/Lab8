package tarleton.guessthenumber;

import edu.tarleton.logging.Logger;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joe Meier
 */
public class Main {
     public static void main(String[] args) throws IOException {
         Logger logger = new Logger("app.log");
         LocalDateTime dt = LocalDateTime.now();
         System.out.println("Guess the number(1-10)");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         Random rand = new Random();
         int ans = rand.nextInt(10)+1;
         if(num == ans){
             System.out.println("You guessed right.");
         }
         else{
             System.out.printf("You guessed: %d. The number was: %d%n",num,ans);
         }
         logger.log("Application Executed: "+ dt.toString());
     }
}

import java.util.Scanner;

public class Scores {

     public static void printName (String name){
          System.out.println(name + " scores are: ");
     }

     public int getnumber() {
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter number of Subjects to Input: ");
           return scan.nextInt();
     }

     public String[] getscores (int thenumber) {
            Scanner scan = new Scanner(System.in);
          String[] scores = new String[thenumber];
          for (int i = 0; i < scores.length; i++) {
               System.out.println("Score: " + i + 1);
               scores[i] = scan.nextLine();
          }
          return scores;
     }

     public void displayscores (String[] scores){
          Scanner scan = new Scanner(System.in);
          System.out.println("Please enter Name ");
          String name = scan.nextLine();
          printName(name);
          for (String score: scores){
               System.out.println(score);
          }

     }
}

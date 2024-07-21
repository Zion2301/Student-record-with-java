import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scores allscores = new Scores();
int num = allscores.getnumber();
String[] myscores = allscores.getscores(num);
allscores.displayscores(myscores);
    }
}
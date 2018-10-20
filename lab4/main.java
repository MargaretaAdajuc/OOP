import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class main {

    public static void main(String[] args) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get("C:/Users/ritad/Documents/OOP/git-test/lab4/out/production/lab4/one_expression.txt")));
        String[] arrayOfStrings = content.split("\n");

        BracketCheck bracketsCheck1 = new BracketCheck(arrayOfStrings[0]); //reads each new line of the .txt file and finds out if the string expression is balanced or not
        bracketsCheck1.checkExpression();

        BracketCheck bracketsCheck2 = new BracketCheck(arrayOfStrings[1]);
        bracketsCheck2.checkExpression();

        BracketCheck bracketsCheck3 = new BracketCheck(arrayOfStrings[2]);
        bracketsCheck3.checkExpression();

        BracketCheck bracketsCheck4 = new BracketCheck(arrayOfStrings[3]);
        bracketsCheck4.checkExpression();
   }
}
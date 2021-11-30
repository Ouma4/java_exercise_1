import java.io.InputStream;
import java.util.Scanner;

public class launcher {

    public static void main(String[] args) {

        System.out.println("bienvenue");
        System.out.println("Put a variable ^^");
        Scanner newVariable = new Scanner(System.in);
        String x = newVariable.nextLine();
        while (!x.equals("quit")){
            System.out.println("Unknown");
        }
    }

}


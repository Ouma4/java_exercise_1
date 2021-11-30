import java.io.InputStream;
import java.util.Scanner;

public class launcher {

    public static void main(String[] args) {

        System.out.println("bienvenue");
        System.out.println("Put a variable ^^");
        Scanner newVariable = new Scanner(System.in);
        String x = newVariable.nextLine();
        while (!x.equals("quit")){
            System.out.println("Unknown command");
        }

        //The Fibonacci
        System.out.println("*******");
        System.out.println("suite de Fibonacci ");
        System.out.println("Fibo :donner un nombre n");
        Scanner N = new Scanner(System.in);
        //We should have an integer
        int c = Integer.parseInt("N");
        //c = input.nextInt();
        int n1 = 0,n2 = 1,n3 = 0;
        if (c > 0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println("F(0) = "+n1);
        }else{
            
        }




    }

}



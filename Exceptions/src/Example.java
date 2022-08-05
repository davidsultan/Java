import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try{
            int result = divide();
            System.out.println(result);
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }

    }
    private static int divide(){
        int x, y;
        try{
            x = getInt();
            y = getInt();
            System.out.println("X is " + x + " Y is "+ y);
            return x/y;
        }catch(NoSuchElementException e){
            throw new ArithmeticException("no suitable input");
        }catch(ArithmeticException e){
            throw new ArithmeticException("Idiot! You can't divide by zero!");
        }
    }
    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a numbre");
        while(true){
            try{
                return s.nextInt();
            }catch(InputMismatchException e){
                // Go round again. Read the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using digits 0 to 9");
            }
        }

    }
}

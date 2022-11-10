import java.util.*;
import java.io.*;

class Main {
    public static boolean MathChallenge(int num) {
        // code goes here
        double x = (double)num;

        if(x%2==0){

            while(x >= 2.0){
                x /= 2.0;
            }

        }else{
            return false;
        }

        if(x == 1.0){
            return true;
        }else{
            return false;
        }
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(MathChallenge(s.nextInt()));
    }
}

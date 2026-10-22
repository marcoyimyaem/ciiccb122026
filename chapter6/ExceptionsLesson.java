package chapter6;

import java.util.Scanner;

public class ExceptionsLesson {
    public static void main(String[] args) {
        try {
            // System.out.println(args[1]);
            System.out.println("Enter a number:");
            Scanner input = new Scanner(System.in);
            int z = 0 + input.nextInt() + 21;
            System.out.println(z);
            System.out.println("end of program");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
        }
        catch( java.util.InputMismatchException e){
            System.out.println(e.getLocalizedMessage());

        }
        finally{
            System.out.println("finally!!!!!");
        }
        System.out.println("EOP");
    }

}

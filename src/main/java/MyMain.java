import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {
        // Write some code here!
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.next();
        System.out.println("Hello " + name +"! It is nice to meet you");
        
        System.out.print("What is your favorite sport? ");
        String sport = scan.next();
        System.out.println("Oh, I like " +sport+ " too.");

        System.out.print("What is your favorite movie? ");
        String movie = scan.next();
        System.out.println("I think that " + movie + " is a great movie too");

        System.out.print("What is your favorite food? ");
        String food = scan.next();
        System.out.println(food +" is really good, but I like pizza the most!");

        System.out.print("What is your favorite song? ");
        String song = scan.next();
        System.out.println("I have never heard " + song + ", but I will have to listen to it.");

    }   
}

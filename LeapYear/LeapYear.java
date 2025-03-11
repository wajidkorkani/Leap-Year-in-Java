import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args){
        LeapYearFinder();
    }

    // I don't likle System.out.println 
    // and I don't want to write it again and again 
    // so that is why I wrote this greet function and I call it output easy peasy :)
    public static void output(String value){
        System.out.println(value);
    }

    public static void LeapYearFinder(){
        Scanner scanner = new Scanner(System.in);
        output("Enter year");
        int year = scanner.nextInt();
        output("Working");
    }
}
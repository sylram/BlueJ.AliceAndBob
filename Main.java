/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        String name;
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        if(name.equals("Bob")||name.equals("Alice")){
        System.out.println("Hello "+name+" how are you today?");
        
    } else {System.out.println("You're not Bob or Alice");
};
}
}
        
    


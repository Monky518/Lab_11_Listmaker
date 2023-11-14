import java.util.ArrayList;
import java.util.Scanner;

public class OldMain
{
    public static ArrayList<String> myArrList = new ArrayList<>();

    public static void main(String[] args)
    {
        // testing();
        Scanner scan = new Scanner(System.in);
        String userInput = "";
        int userInt = -1;
        boolean done = false;

        do
        {
            System.out.println("A - add an item to the list");
            System.out.println("D - delete (remove) an item to the list");
            System.out.println("P - print (get) an item to the list");
            System.out.println("Q - quit the program");

            userInput = SafeInput.getRegExString(scan, "What would you like to do?", "[AaDdPpQq]");
            if (userInput.matches("Aa"))
                add(scan);
            else if (userInput.matches("Dd"))
                delete(scan);
            else if (userInput.matches("Pp"))
                print(scan);
            else
                done = quit(scan);
        } while(!done);
    }

    public static void add(Scanner scan)
    {
        String userInput = SafeInput.getNonZeroLenString(scan, "What would you like to add?");
        myArrList.add(userInput);
    }

    public static void delete(Scanner scan)
    {
        String userInput = SafeInput.getNonZeroLenString(scan, "What would you like to delete?");
        boolean validInput = false;
        for(String i : myArrList)
        {
            if (i.matches(userInput))
                validInput = true;
        }
        myArrList.remove(userInput);
    }

    public static void print(Scanner scan)
    {
        int userInt = SafeInput.getRangedInt(scan, "Which item do you want to see?", 1, myArrList.size()) - 1;
        System.out.println(myArrList.get(userInt));
    }

    public static boolean quit(Scanner scan)
    {
        return false;
    }

    public static void testing()
    {
        int m = 0;

        // note the diamond notation on the type parameter <>
        ArrayList<String> myArrList = new ArrayList<>();

        myArrList.add("Some String");

        // again m is the index which is zero based as in the arrays
        String var = myArrList.get(m);

        // again m is an index like an array
        myArrList.add(m, "Some String");

        myArrList.size();

        myArrList.set(m, "New String Value");
    }
}
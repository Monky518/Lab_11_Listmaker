import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static ArrayList<String> myArrList = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        String userInput;
        boolean done = false;

        do
        {
            showMenu();
            userInput = SafeInput.getRegExString(scan, "What would you like to do?", "[AaDdPpQq]");
            if (userInput.equalsIgnoreCase("A"))
                add();
            else if (userInput.equalsIgnoreCase("D"))
                delete();
            else if (userInput.equalsIgnoreCase("P"))
                print();
            else if (userInput.equalsIgnoreCase("Q"))
                done = quit();
            else
                System.out.println("\nERROR: This should not be an options\n");
        } while(!done);
    }

    public static void showMenu()
    {
        System.out.println("----------------------------------------");
        System.out.println("A – Add an item to the list");
        System.out.println("D – Delete an item from the list");
        System.out.println("P – Print (i.e. display) the list");
        System.out.println("Q – Quit the program");
        System.out.println("----------------------------------------");
    }

    public static void add()
    {
        String userInput = SafeInput.getNonZeroLenString(scan, "What would you like to add?");
        int userInt = 0;
        if (!myArrList.isEmpty())
        {
            print(); // shows the current list to set placement
            userInt = SafeInput.getRangedInt(scan, "Where would you like to add " + userInput, 0, myArrList.size() - 1);
        }
        myArrList.add(userInt, userInput);
    }

    public static void delete()
    {
        print(); // shows the current list to delete specific item
        if (myArrList.isEmpty())
            System.out.println("\nERROR: Your list is empty right now\n");
        else
        {
            int userInt = SafeInput.getRangedInt(scan, "Which item do you want to delete", 0, myArrList.size() - 1);
            myArrList.remove(userInt);
        }
    }

    public static void print()
    {
        if (myArrList.isEmpty())
            System.out.println("\nERROR: Your list is empty right now\n");
        else
        {
            for (int i = 0; i < myArrList.size(); i++)
            {
                System.out.println(i + " - " + myArrList.get(i));
            }
        }
    }

    public static boolean quit()
    {
        return SafeInput.getYNConfirm(scan, "Are you sure you want to quit?");
    }
}

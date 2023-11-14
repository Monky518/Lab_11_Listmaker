public class Main
{
    public static void main(String[] args)
    {
        String userInput = "";
        boolean done = false;

        do
        {
            showList(); // do I need this to show every time?
            showMenu();
            if (userInput.matches("Aa"))
                add();
            else if (userInput.matches("Dd"))
                delete();
            else if (userInput.matches("Pp"))
                print();
            else
                quit();
        } while(!done);
    }

    public static void showMenu()
    {
        // show the entire menu options
    }

    public static void showList()
    {
        // display the entire list
    }

    public static void add()
    {
        // ask what to add and where
    }

    public static void delete()
    {
        // You need to display a numbered version of the list to allow users to pick list elements for deletion
        // Here the user looks at the display and then indicates the item to delete by the number

        // check for empty list
        // ask what to delete
    }

    public static void print()
    {
        // check for empty list
        // ask what to print
    }

    public static void quit()
    {
        // ask to confirm
        // stop the function
    }
}

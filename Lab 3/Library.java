
/**
 * This class adds books to the library
 * and prints out the book information.
 * 
 * @Lauren Graham
 * @version 1.0
 */
public class Library
{
    private String book;
    /**
     *Creates new Library
     *Allows you to name your Library
     *Example: "Boston Public Library"
     */
    public Library(String AddBook)
    {
     book = AddBook;
    }
    
    /**
     * Prints out Book Information
     * from the AddBook class.
     */
    public void printBookInfo()
    {
     AddBook.print();
    }
}

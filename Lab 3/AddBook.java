
/**
 * This class allows the user to enter and change the book
 * information. It also won't allow the page number to be
 * lower then 10 pages.
 * 
 * @Lauren Graham
 * @version 1.0
 */
public class AddBook
{
    //author last name
    private static String last;
    //author first name
    private static String first;
    //book name
    private static String book;
    //book ISBN
    private static String isbnNum;
    //book publication date
    private static String publication;
    //book page count
    private static int pages;
    /**
     * Add a new book and author.
     * Example: "The Horse Whisperer"
     */
    public AddBook(String lastName, String firstName, String bookName)
    {
     last = lastName;
     first = firstName;
     book = bookName;
    }
    
    /**
     * Add book ISBN, publication date.
     * Example: "12/12/12"
     */
    public void addBookInfo(String isbn, String pubDate)
    {
      isbnNum = isbn;
      publication = pubDate;  
    }
    
    /**
     * Add page count.
     */
    public void addPages(int numPages)
    {
     pages = numPages;
     if(pages <= 10)
     {
      System.out.println("There is not enough pages in this book");
     }
    }
    
    /**
     * Update the page count.
     */
    public void changeNumPages(int replacePageNum)
    {
     pages = replacePageNum;
    }
    
    /**
     * Shows the entered book name.
     */
    public String getBookName()
    {
     return book;   
    }
    
    /**
     * Replaces the entered book name.
     */
    public String changeBookName(String replaceBookName)
    {
     book = replaceBookName; 
     return book;
    }
    
    /**
     * Shows the entered last name.
     */
    public String getAuthorLast()
    {
     return last;
    }
    
    /**
     * Shows the entered first name.
     */
    public String getAuthorFirst()
    {
     return first;
    }
    
    /**
     * Replaces the entered author name.
     */
    public String changeAuthor(String replaceLast, String replaceFirst)
    {
     last = replaceLast;
     first = replaceFirst;
     return book;
    }
    
    /**
     * Prints out all of the book data.
     * Also rejects any books under 10 pages.
     */
    public static void print()
    {
     if(pages <= 10)
     {
      System.out.println("This book is not valid.");
     }
     else
     {
      System.out.println(book + " by " + last + ", " + first);
      System.out.println("The ISBN is: " + isbnNum);
      System.out.println("The Publication Date is: " + publication);
      System.out.println("The number of pages is: " + pages);
     }
    }
}

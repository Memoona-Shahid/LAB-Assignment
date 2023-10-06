public class Magazine extends LibraryItem{
    private int issueNumber;
    public Magazine(int issueNumber, String title, String author, int year, boolean isBorrowed, LibraryItem itemType) {

        super(title, author, year, isBorrowed, itemType);
        this.issueNumber = issueNumber;

    }
}

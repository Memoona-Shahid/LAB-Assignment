public class LibraryItem {
    private String title;
    private String author;
    private int year;
    boolean isBorrowed;
    public LibraryItem itemType;

    public LibraryItem(String title, String author, int year, boolean isBorrowed, LibraryItem itemType)
    {
        this.title=title;
        this.author= author;
        this.year=year;
        this.isBorrowed= isBorrowed;
        this.itemType= itemType;
    }
    public Boolean getisBorrowed() {
        return isBorrowed;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public LibraryItem getItemType() {
        return itemType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void setItemType(LibraryItem itemType) {
        this.itemType = itemType;
    }
}

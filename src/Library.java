import java.util.ArrayList;
public class Library {
    LibraryItem[] items= new LibraryItem[100];
    private int counter=0;




    public void addItem(LibraryItem item) {
        for(counter= 0 ;counter< items.length; counter++)
        if (counter < items.length) {
            items[counter] = item;
            counter++;
        } else {
            System.out.println("CAN NOT ADD BOOK");
        }
    }
        public void borrowItem(LibraryItem item){
            for (int i = 0; i < items.length; i++) {
                if(items[i]==item)
                {
                    items[i].setBorrowed(true);
                }
                else{
                    System.out.println("NO BOOK FOUND");
                }
            }
        }
            public void displayAvailableItems () {
                System.out.println("Available Items:");
                for (int i = 0; i < items.length; i++) {
                    if(!items[i].getisBorrowed())
                        System.out.println("Title: " + items[i].getTitle() + ", Author: " + items[i].getAuthor() + ", Year: " + items[i].getYear());
                }
            }
           public void displayBorrowedItems () {
                System.out.println("Available Items:");
                for (int i = 0; i < counter; i++) {
                    if(items[i].getisBorrowed())
                            System.out.println("Title: " + items[i].getTitle() + ", Author: " + items[i].getAuthor() + ", Year: " + items[i].getYear());
            }
           }
           public void returnItem(LibraryItem item) {
                for (int i = 0; i < counter; i++) {
                   if (items[i] == item) {
                   items[i].setBorrowed(false);
                  System.out.println("Item returned successfully.");
                  return;
                   }
                }
                System.out.println("Item not found or already returned.");
               }










}







































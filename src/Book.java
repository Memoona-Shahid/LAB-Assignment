        public class Book extends LibraryItem {
        private int pageCount;
        public Book( String title, String author, int year,int pageCount, boolean isBorrowed,LibraryItem itemType) {

            super(title, author, year, isBorrowed, itemType);
            this.pageCount = pageCount;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }
    }








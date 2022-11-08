public class Librarian_Edit extends data {
    public String BookName;
    public String newBookName;
    public String newWriterName;

    public Librarian_Edit(String bookName, String newBookName, String newWriterName) {
        this.BookName = bookName;
        this.newBookName = newBookName;
        this.newWriterName = newWriterName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getNewBookName() {
        return newBookName;
    }

    public void setNewBookName(String newBookName) {
        this.newBookName = newBookName;
    }

    public String getNewWriterName() {
        return newWriterName;
    }

    public void setNewWriterName(String newWriterName) {
        this.newWriterName = newWriterName;
    }
}
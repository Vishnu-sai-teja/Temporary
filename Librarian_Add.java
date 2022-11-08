public class Librarian_Add extends data {
    public String BookName;
    public String WriterName;

    public Librarian_Add(String bookName, String writerName) {
        BookName = bookName;
        WriterName = writerName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getWriterName() {
        return WriterName;
    }

    public void setWriterName(String writerName) {
        WriterName = writerName;
    }
}
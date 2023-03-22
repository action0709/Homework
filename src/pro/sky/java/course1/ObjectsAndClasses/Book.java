package pro.sky.java.course1.ObjectsAndClasses;

public class Book {
    String TitleBook;
    String Autor;
    int YearPublication;
    public static Book Book(String TitleBook, String Autor, int Year) {
        Book book = new Book();
        book.TitleBook = TitleBook;
        book.Autor = Autor;
        book.YearPublication = Year;
        return book;
    }


}

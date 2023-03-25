package pro.sky.java.course1.ObjectsAndClasses;

import java.util.Objects;

public class Book {
    private String TitleBook;
    private String Autor;
    private int YearPublication;
    public Book (String TitleBook, String Autor, int Year) {
        this.TitleBook = TitleBook;
        this.Autor = Autor;
        this.YearPublication = Year;
    }
public String getTitleBook(){
    return this.TitleBook;
}
    public String getAutor(){
        return this.Autor;
    }
    public int getYearPublication(){
        return this.YearPublication;
    }
    public void setYearPublication(int Year) {
        this.YearPublication = Year;
    }

    public String toString() {
        return "Наименование книги: " + this.TitleBook + ", Автор: " + this.Autor + ", Год издания: " + this.YearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return YearPublication == book.YearPublication && Objects.equals(TitleBook, book.TitleBook) && Objects.equals(Autor, book.Autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TitleBook, Autor, YearPublication);
    }
}

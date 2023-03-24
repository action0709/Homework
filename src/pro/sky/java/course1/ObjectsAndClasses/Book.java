package pro.sky.java.course1.ObjectsAndClasses;

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
    public boolean equals(Book newBook) {
        if (this.TitleBook.equals(newBook.TitleBook) && this.Autor.equals(newBook.Autor) && this.YearPublication == newBook.YearPublication) {

                    return true;
        }else
        {return false;}
    }
    public int hashCode() {
        return java.util.Objects.hash(TitleBook, Autor, YearPublication);
    }

}

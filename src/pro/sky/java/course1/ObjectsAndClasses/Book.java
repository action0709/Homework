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
}

package pro.sky.java.course1.ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Book BookGarry = Book.Book("Гарри Поттер и узник Азкабана","Джоан Роулинг",2019);
        System.out.println("BookGarry = " + BookGarry.TitleBook+BookGarry.Autor+BookGarry.YearPublication);
        Book BookKing = Book.Book("Зелена миля", "Стивен Кинг", 2014);
        System.out.println("BookKing = " + BookKing.Autor+BookKing.TitleBook+BookKing.YearPublication);


    }

}

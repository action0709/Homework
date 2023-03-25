package pro.sky.java.course1.MetodsObject;

import pro.sky.java.course1.ObjectsAndClasses.Autor;
import pro.sky.java.course1.ObjectsAndClasses.Book;

public class Main {
    public static void main(String[] args) {
        Autor Rouling = new Autor("Джоан", "Роулинг");
        Autor King = new Autor("Стивен", "Кинг");
        Book BookGarry = new Book("Гарри Поттер и узник Азкабана", Rouling.getName() + " " + Rouling.getSurname(), 2019);
        Book BookKing = new Book("Зелена миля", King.getName() + " " + King.getSurname(), 2014);
        BookGarry.setYearPublication(2020);
        System.out.println(BookGarry);
        System.out.println(BookKing);
        System.out.println(Rouling);
        System.out.println(King);
        Autor Rouling1 = new Autor("Джоанa", "Роулинг");
        if (Rouling.equals(Rouling1)) {
            System.out.println("Автор тот же");
        } else {
            System.out.println("Авторы разные");
        }
        Book bookKing1 = new Book("Сияние", King.getName() + " " + King.getSurname(), 1977);
        if (BookKing.equals(bookKing1)) {
            System.out.println("Книга та же");
        } else {
            System.out.println("Книги разные");
        }
    }
}

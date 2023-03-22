package pro.sky.java.course1.ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Book BookGarry = new Book("Гарри Поттер и узник Азкабана","Джоан Роулинг",2019);
        System.out.println("BookGarry = " + BookGarry.getTitleBook()+", "+BookGarry.getAutor()+", "+BookGarry.getYearPublication());
        Book BookKing = new Book("Зелена миля", "Стивен Кинг", 2014);
        System.out.println("BookKing = " + BookKing.getAutor()+", "+BookKing.getTitleBook()+", "+BookKing.getYearPublication());
        Autor King = new Autor("Стивен", "Кинг");
        System.out.println("King = " + King.getName()+King.getSurname());
        BookGarry.setYearPublication(2020);
        System.out.println("BookGarry = " + BookGarry.getTitleBook()+", "+BookGarry.getAutor()+", "+BookGarry.getYearPublication());

    }

}

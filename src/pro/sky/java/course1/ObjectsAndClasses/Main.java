package pro.sky.java.course1.ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Autor Rouling = new Autor("Джоан", "Роулинг");
        System.out.println("Rouling = " + Rouling.getName()+" "+Rouling.getSurname());
        Autor King = new Autor("Стивен", "Кинг");
        System.out.println("King = " + King.getName()+" "+King.getSurname());
        Book BookGarry = new Book("Гарри Поттер и узник Азкабана", Rouling.getName()+" "+Rouling.getSurname(), 2019);
        System.out.println("BookGarry = " + BookGarry.getTitleBook()+", "+BookGarry.getAutor()+", "+BookGarry.getYearPublication());
        Book BookKing = new Book("Зелена миля", King.getName()+" "+ King.getSurname(), 2014);
        System.out.println("BookKing = " + BookKing.getTitleBook()+", "+BookKing.getAutor()+", "+BookKing.getYearPublication());
        BookGarry.setYearPublication(2020);
        System.out.println("BookGarry = " + BookGarry.getTitleBook()+", "+BookGarry.getAutor()+", "+BookGarry.getYearPublication());

    }

}

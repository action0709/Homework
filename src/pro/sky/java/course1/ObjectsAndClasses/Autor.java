package pro.sky.java.course1.ObjectsAndClasses;

public class Autor {
    private String Name;
    private String Surname;

    public Autor(String Name, String Surname) {
        this.Name = Name;
        this.Surname = Surname;
    }

    public String getName() {
        return this.Name;
    }
    public String getSurname() {
            return this.Surname;
    }

}
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

    public String toString() {
        return "Имя автора: " + this.Name + ", Фамилия автора: " + this.Surname;
    }

      public boolean equals(Autor newAutor) {
        if (this.Name.equals(newAutor.Name) && this.Surname.equals(newAutor.Surname)) {
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(Name,Surname);
    }
}
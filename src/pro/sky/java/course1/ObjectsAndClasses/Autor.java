package pro.sky.java.course1.ObjectsAndClasses;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(Name, autor.Name) && Objects.equals(Surname, autor.Surname);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(Name,Surname);
    }

    }


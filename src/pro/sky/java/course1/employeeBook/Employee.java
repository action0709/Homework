package pro.sky.java.course1.employeeBook;

public class Employee {
    private String name;
    private int departament;
    private float salary;
    private static int counter;
    private int id;

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
    public int getDepartament() {
        return this.departament;
    }

    public float getSalary() {
        return this.salary;
    }
    public Employee(String name, int departament, float salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
        this.id = counter;
        counter = counter + 1;
    }

    public String toString() {
        return "ID: " + this.id + " Ф.И.О. сотрудника: " + this.name + ", Департамент: " + this.departament + ", Зарплата: " + this.salary;
    }

}

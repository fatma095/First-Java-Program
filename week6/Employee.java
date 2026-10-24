public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Employee(int id, String name, double salary) {
        this(id, name, salary, "Unassigned");
    }

    public Employee(int id, String name) {
        this(id, name, 25000.0);
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            this.salary += amount;
            System.out.println(name + " received a raise. New salary: " + this.salary);
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name +
                " | Salary: " + salary + " | Dept: " + department);
    }
}
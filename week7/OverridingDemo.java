class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: KSh " + baseSalary);
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        double base = super.calculateSalary();
        return base + bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: KSh " + bonus);
        System.out.println("Total Salary: KSh " + calculateSalary());
    }

    public void printNameDirectly() {
        System.out.println("Direct access to name: " + name);
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        System.out.println("=== EMPLOYEE ===");
        emp.displayInfo();
        System.out.println("Calculated Salary: " + emp.calculateSalary());

        System.out.println();

        Manager mgr = new Manager("Bob", 80000, 20000);
        System.out.println("=== MANAGER ===");
        mgr.displayInfo();
        System.out.println("Calculated Salary: " + mgr.calculateSalary());

        mgr.printNameDirectly();
    }
}
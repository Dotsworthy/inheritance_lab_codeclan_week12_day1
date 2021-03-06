package staff;

public abstract class Employee {

    private String name;
    private int NINumber;
    protected double salary;

    public Employee(String name, int NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName == null) {
            return;
        } else {
        this.name = newName;}
    }

    public int getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }
    }

    public double payBonus() {
        double bonus;
        bonus = this.salary / 100;
        return bonus;
    }
}

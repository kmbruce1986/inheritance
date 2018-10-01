package Staff.Management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String NInumber, double salary, String deptName, double budget) {
        super(name, NInumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}

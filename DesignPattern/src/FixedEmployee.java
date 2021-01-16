public class FixedEmployee implements Employee {

    private int id;
    private String name;
    private double salary;

    public FixedEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getTotalSalary() {
        return salary;
    }
}

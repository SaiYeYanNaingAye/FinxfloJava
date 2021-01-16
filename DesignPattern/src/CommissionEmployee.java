public class CommissionEmployee implements Employee {
    private int id;
    private String name;
    private double commissionRate;
    private double saleVolume;

    public CommissionEmployee(int id, String name, double commissionRate, double saleVolume) {
        this.id = id;
        this.name = name;
        this.commissionRate = commissionRate;
        this.saleVolume = saleVolume;
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

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getSaleVolume() {
        return saleVolume;
    }

    public void setSaleVolume(double saleVolume) {
        this.saleVolume = saleVolume;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getTotalSalary() {
        return saleVolume * commissionRate /100;
    }
}

import com.google.gson.Gson;

public class FinanceVisitor implements Visitor{
    @Override
    public double visit(FixedEmployee fixedEmployee) {
        Gson gson = new Gson();
        String json = gson.toJson(fixedEmployee);
        System.out.println(json);
        return fixedEmployee.getTotalSalary();
    }

    @Override
    public double visit(CommissionEmployee commissionEmployee) {
        Gson gson = new Gson();
        String json = gson.toJson(commissionEmployee);
        System.out.println(json);
        return commissionEmployee.getTotalSalary();
    }

    @Override
    public double visit(MixedEmployee mixedEmployee) {
        Gson gson = new Gson();
        String json = gson.toJson(mixedEmployee);
        System.out.println(json);
        return mixedEmployee.getTotalSalary();
    }
}

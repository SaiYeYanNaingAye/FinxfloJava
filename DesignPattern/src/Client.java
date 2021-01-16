import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //prepare test data
        List<FixedEmployee> fixedEmployeeList = new ArrayList<>();
        FixedEmployee emp1, emp2, emp3;
        emp1 = new FixedEmployee(1, "John Doe", 1000);
        emp2 = new FixedEmployee(2, "Edward", 1350);
        emp3 = new FixedEmployee(3, "Carrie", 800);
        fixedEmployeeList.add(emp1);
        fixedEmployeeList.add(emp2);
        fixedEmployeeList.add(emp3);

        List<CommissionEmployee> commissionEmployeeList = new ArrayList<>();
        CommissionEmployee emp4, emp5, emp6;
        emp4 = new CommissionEmployee(4,"Mary", 10, 500);
        emp5 = new CommissionEmployee(5,"Paul", 8.5, 300);
        emp6 = new CommissionEmployee(6,"Lucy", 5, 200);
        commissionEmployeeList.add(emp4);
        commissionEmployeeList.add(emp5);
        commissionEmployeeList.add(emp6);

        List<MixedEmployee> mixedEmployeeList = new ArrayList<>();
        MixedEmployee emp7,emp8, emp9;
        emp7 = new MixedEmployee(7, "Harry", 1000, 10, 300);
        emp8 = new MixedEmployee(8, "Stanley", 300, 5, 10);
        emp9 = new MixedEmployee(9, "Carol", 1500, 8, 400);
        mixedEmployeeList.add(emp7);
        mixedEmployeeList.add(emp8);
        mixedEmployeeList.add(emp9);

        FinanceVisitor visitor = new FinanceVisitor();

        double totalSalaryForFixedEmp = 0;
        System.out.println("FixedEmployee List");
        for(Employee employee : fixedEmployeeList){
            totalSalaryForFixedEmp += employee.accept(visitor);
        }
        System.out.println("Total Salary of Fixed Employees = " + totalSalaryForFixedEmp);

        double totaleSalaryForCommEmp = 0;
        System.out.println("CommissionEmployee List");
        for(Employee employee : commissionEmployeeList){
            totaleSalaryForCommEmp += employee.accept(visitor);
        }
        System.out.println("Total Salary of Commission Employees = " + totaleSalaryForCommEmp);

        double totaleSalaryForMixedEmp = 0;
        System.out.println("MixedEmployee List");
        for(Employee employee : mixedEmployeeList){
            totaleSalaryForMixedEmp += employee.accept(visitor);
        }

        System.out.println("Total Salary of Mixed Employees = " + totaleSalaryForMixedEmp);
    }
}

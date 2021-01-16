public interface Visitor {
    double visit (FixedEmployee fixedEmployee);

    double visit(CommissionEmployee commissionEmployee);

    double visit(MixedEmployee mixedEmployee);
}

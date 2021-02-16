public class BasePlusCommissionEmployee extends CommissionEmployee{

    //instance variable
    private double baseSalary;

    //constructor with 6 parameters
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialInsuranceNumber,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialInsuranceNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    //setter and getter for baseSalary
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    //earnings method of BasePlusCommissionEmployee
    //Company rewards BasePlusCommissionEmployee by adding 10% to base salary
    @Override
    public double earnings(){
        return (super.earnings() + baseSalary * 1.1); //commissionRate * grossSales + baseSalary * 1.1
    }

    //toString method for displaying info of BasePlusCommissionEmployee
    @Override
    public String toString(){
        return String.format("%s %s%n%s: %.2f", "Base Salaried", super.toString(),
                "Base salary", baseSalary);
    }
}

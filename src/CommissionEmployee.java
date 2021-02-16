public class CommissionEmployee extends Employee{

    //instance variables
    private double grossSales;
    private double commissionRate;

    //constructor with 5 parameters
    public CommissionEmployee(String firstName, String lastName, String socialInsuranceNumber,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, socialInsuranceNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    //setters
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    //getters
    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    //earnings method of CommissionEmployee
    @Override
    public double earnings() {
        return (commissionRate * grossSales);
    }

    //toString method for displaying info of CommissionEmployee
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %.2f%n%s: %.2f",
                "Commission Employee", super.toString(),
                "Gross sales", grossSales, "Commission rate", commissionRate);
    }
}

public class SalariedEmployee extends Employee{

    //instance variable
    private double weeklySalary;

    //constructor with 4 parameters
    public SalariedEmployee(String firstName, String lastName, String socialInsuranceNumber,
                            double weeklySalary) {
        super(firstName, lastName, socialInsuranceNumber);
        this.weeklySalary = weeklySalary;
    }

    //setter and getter for weeklySalary
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    //earnings method of SalariedEmployee
    @Override
    public double earnings() {
        return weeklySalary;
    }

    //toString method for displaying info of SalariedEmployee
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %.2f","Salaried Employee", super.toString(),
                "Weekly salary", weeklySalary);
    }
}

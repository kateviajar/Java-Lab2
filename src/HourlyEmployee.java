public class HourlyEmployee extends Employee{

    //instance variables
    private double wage;
    private int hours;

    //constructor with 5 parameters
    public HourlyEmployee(String firstName, String lastName, String socialInsuranceNumber,
                          double wage, int hours) {
        super(firstName, lastName, socialInsuranceNumber);
        this.wage = wage;
        this.hours = hours;
    }

    //Setters
    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    //getters
    public double getWage() {
        return wage;
    }

    public int getHours() {
        return hours;
    }

    //earnings method of HourlyEmployee
    @Override
    public double earnings() {
        double salary = 0;
        if (hours <= 40){
            salary = wage * hours;
        }
        else if (hours > 40){
            salary = 40 * wage + (hours - 40) * wage * 1.5;
        }
        return salary;
    }

    //toString method for displaying info of HourlyEmployee
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %.2f%n%s: %d","Hourly Employee",
                super.toString(), "Hourly wage", wage, "Hours worked", hours);
    }
}

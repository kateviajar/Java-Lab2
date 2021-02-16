public abstract class Employee {

    //instance variables
    private String firstName;
    private String lastName;
    private String socialInsuranceNumber;

    //constructor with 3 parameters
    public Employee(String firstName, String lastName, String socialInsuranceNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialInsuranceNumber = socialInsuranceNumber;
    }

    //create an abstract method called earnings
    public abstract double earnings();

    //override a toString method
    //Output firstName LastName, and SIN
    @Override
    public String toString(){
        return String.format("%s %s%n%s: %s", firstName, lastName,
                "Social Insurance Number", socialInsuranceNumber);
    }
}

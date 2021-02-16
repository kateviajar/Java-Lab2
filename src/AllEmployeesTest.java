public class AllEmployeesTest {
    public static void main(String [] args){

        //instantiate objects of 4 employee types
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith",
                "111222333", 950);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Tim", "Cooper",
                "123123123", 14.25, 45);

        CommissionEmployee commissionEmployee = new CommissionEmployee("Nancy", "Bell",
                "234567890", 3000, 0.08);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Joan","Wells",
                "222444666", 3500, 0.05, 400);

        //Display the info and earnings of the salariedEmployee
        System.out.println(salariedEmployee.toString());
        System.out.printf("Earnings: %.2f%n%n", salariedEmployee.earnings());

        //Display the info and earnings of the hourlyEmployee
        System.out.println(hourlyEmployee.toString());
        System.out.printf("Earnings: %.2f%n%n", hourlyEmployee.earnings());

        //Display the info and earnings of the commissionEmployee
        System.out.println(commissionEmployee.toString());
        System.out.printf("Earnings: %.2f%n%n", commissionEmployee.earnings());

        //Display the info and earnings of the basePlusCommissionEmployee
        System.out.println(basePlusCommissionEmployee.toString());
        System.out.printf("Earnings: %.2f%n%n", basePlusCommissionEmployee.earnings());
    }
}

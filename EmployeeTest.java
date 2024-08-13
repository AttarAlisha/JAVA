//Employee.java
public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Get method for monthly salary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give a 10% raise in salary
    public void giveRaise() {
        this.monthlySalary *= 1.1;
    }
}


//EmployeeTest.java

public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Alisha", "Attar", 3400);
        Employee emp2 = new Employee("Sanika", "Patil", 3500);

        // Display 
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s yearly salary: Rs" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s yearly salary: Rs" + emp2.getYearlySalary());

        emp1.giveRaise();
        emp2.giveRaise();

        // Display each employee's yearly salary after the raise
        System.out.println("\nAfter 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s yearly salary: Rs" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s yearly salary: Rs" + emp2.getYearlySalary());
    }
}


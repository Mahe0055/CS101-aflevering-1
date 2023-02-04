public class Employee {
    private String firstName;
    private String lastName;
    private int salary;

    //constructor
    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getHigherSalary() {
        return this.salary + (salary/100*10);
    }
}
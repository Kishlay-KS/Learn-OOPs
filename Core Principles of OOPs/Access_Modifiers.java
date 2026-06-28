/*
Design a class Employee to manage employee details securely using proper encapsulation and access modifiers. The class should implement the following attributes and methods :

Attributes :

name (string) : public, Represents the name of employee.
employeeId (Integer) : protected, Represents the unique Id of the employee.
salary (double) : private, Represents the salary of the employee.
Methods :

setSalary (double salary) : Sets the salary value, If salary is negative then print "Invalid salary" and set the salary to 0.
getSalary() : Return the salary value.
parameterised constructor to initialize the attributes. (If salary is negative then print "Invalid salary" and set the salary to 0.)
displayEmployeeDetails() : Display the employee details in format specified below :
*/

class Employee{
    public String name;
    protected Integer employeeId;
    private double salary;

    public void setSalary(double salary){
        if(salary < 0){
            System.out.println("Invalid salary");
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public double getSalary(){
        return this.salary;
    }

    public Employee(String name, Integer employeeId, double salary){
        this.name = name;
        this.employeeId = employeeId;
        if(salary < 0){
            System.out.println("Invalid salary");
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public void displayEmployeeDetails(){
        System.out.printf("Name : %s\n", this.name);
        System.out.printf("Employee Id : %d\n", this.employeeId);
        System.out.printf("Salary : %.2f\n", this.salary);
    }
}
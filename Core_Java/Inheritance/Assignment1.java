package Core_Java.Inheritance;


class Employee {
      
    //Implement your code here 
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    /*
    public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }
    */
    private int employeeId;
    private String employeeName;
    private double salary;

    // Constructor
    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    // Getter and Setter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and Setter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


class PermanentEmployee extends Employee {
      
    //Implement your code here 
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    /*
    public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }
    */
    
    private double basicPay;
    private double hra;
    private float experience;

    // Constructor
    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
        super(empId, name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }

    // Calculate Monthly Salary
    public void calculateMonthlySalary() {
        double variableComponent = 0;

        if (experience < 3) {
            variableComponent = 0;
        } else if (experience >= 3 && experience < 5) {
            variableComponent =  basicPay * 0.05 ;
        } else if (experience >= 5 && experience < 10) {
            variableComponent =  basicPay * 0.07 ;
        } else if (experience >= 10) {
            variableComponent =  basicPay * 0.12 ;
        }

        double totalSalary = basicPay + hra + variableComponent;
        setSalary(totalSalary); // rounding off salary
    }

    // Getter and Setter for basicPay
    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    // Getter and Setter for hra
    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    // Getter and Setter for experience
    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}


class ContractEmployee extends Employee {
     
    //Implement your code here 
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    /*
    public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }
    */
    
    private double wage;
    private float hoursWorked;

    // Constructor
    public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
        super(empId, name);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    // Calculate Salary
    public void calculateSalary() {
        double totalSalary = wage * hoursWorked;
        setSalary(totalSalary);
    }

    // Getter and Setter for wage
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    // Getter and Setter for hoursWorked
    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

class Tester {
      
    public static void main(String[] args) {
      
        PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1855, 115, 3.5f);
	    permanentEmployee.calculateMonthlySalary();
	    System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+permanentEmployee.getSalary());
	            
	    ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
	    contractEmployee.calculateSalary();
	    System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+contractEmployee.getSalary());
	        
	    //Create more objects for testing your code
    }
      
}



/*✅ Step 1: Understand UML Diagram

The UML diagram shows three classes:

1. Employee (Base Class)

Attributes:

employeeId: int

employeeName: String

salary: double

Constructor: Employee(employeeId, employeeName)

Methods:

getEmployeeId()

setEmployeeId(int)

getEmployeeName()

setEmployeeName(String)

getSalary()

setSalary(double)

2. ContractEmployee (Derived from Employee)

Attributes:

wage: double

hoursWorked: float

Constructor: (empId, name, wage, hoursWorked)

Methods:

calculateSalary() → sets salary = wage * hoursWorked

Getter & Setter for wage and hoursWorked

3. PermanentEmployee (Derived from Employee)

Attributes:

basicPay: double

hra: double

experience: float

Constructor: (empId, name, basicPay, hra, experience)

Methods:

calculateMonthlySalary() → salary = basicPay + hra + bonus

Bonus rules:

If experience < 5 → bonus = 0

If 5 ≤ experience < 10 → bonus = 0.05 * basicPay

If experience ≥ 10 → bonus = 0.10 * basicPay

Getter & Setter for basicPay, hra, experiencen  */

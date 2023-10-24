package exercises;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee (int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            double raiseAmount = ((percent / 100) * salary);
            salary += raiseAmount;
            System.out.println(name + "'s salary has been increased by " + percent + "%.");
            System.out.println("New salary: " + salary);
        } else {
            System.out.println("Invalid percentage. Salary not increased.");
        }
    }

}



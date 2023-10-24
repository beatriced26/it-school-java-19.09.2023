package exercises;

public class Main {
            public static void main(String[] args) {
                //1

                Employee employee = new Employee(3, "Ana", 1232);
                System.out.println("Salary of " + employee.getName() + " is: " + employee.getSalary());

                employee.raiseSalary(6);

                //2

                InvoiceItem item = new InvoiceItem(61009762, "Set 4 Prosoape corp hotelier Alb 550gr/mp", 2, 159.99);
                System.out.println("Total cost for invoice " + item.getId() + " which consists of " + item.getDescription() + " is: " + item.getTotal());

                //3

                Date todayDate = new Date(23, 10, 2023);
                System.out.print("The date is: " );
                todayDate.printDate();

            }
        }

package employees;

public class Main {
    public static void main(String[] args) {
        //tablica z danymi pracowników
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Jan Kowalski", 5000, 0);
        employees[1] = new Worker("Jan Nowak ", 56000, "inżynier");
        employees[2] = new Employee("Jim Beam", 4000);
        employees[3] = new Worker("Jack Daniels", 3500, "mechanik");
        employees[4] = new Worker("Donald Trump", 899200, "prezes");

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
package employees;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Jan Kowalski", 5000, 0);
        employees[1] = new Worker("Jan Nowak ", 56000, "inżynier");
        employees[2] = new Employee("Jim Beam", 4000);
        employees[3] = new Worker("Jack Daniels", 3500, "mechanik");
        employees[4] = new Worker("Donald Trump", 899200, "prezes");

        // Zliczanie pracowników, którzy nie są instancją klasy Manager
        int nonManagerCount = 0;
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                nonManagerCount++;
            }
        }

        // Ustawienie liczby podwładnych i nowej pensji dla Managera na indeksie 0
        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
            employees[0].setSalary(7500);
        }

        // Wyświetlanie informacji o wszystkich pracownikach
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
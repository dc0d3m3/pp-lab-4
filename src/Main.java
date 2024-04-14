package employees;

public class Main {
    public static void main(String[] args) {
        // Rozszerzona tablica do 7 pracowników
        Employee[] employees = new Employee[7];
        employees[0] = new Manager("Jan Kowalski", 5000, 0);
        employees[1] = new Worker("Jan Nowak", 56000, "inżynier");
        employees[2] = new Worker("Jim Beam", 4000, "Mistrz");
        employees[3] = new Worker("Jack Daniels", 3500, "mechanik");
        employees[4] = new Worker("Donald Trump", 899200, "prezes");
        // Dodawanie kolejnego menedżera i pracownika
        employees[5] = new Manager("Anna Nowak", 6500, 0);
        employees[6] = new Worker("Steve Jobs", 7200, "GURU");

        // Wyświetlenie informacji o pracownikach przed modyfikacją
        System.out.println("Przed modyfikacją:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Zwiększenie pensji wszystkim pracownikom o 500
        for (Employee emp : employees) {
            emp.setSalary(emp.getSalary() + 500);
        }

        // Ustawienie nowych wartości dla obu menedżerów
        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(4);  // Zakładając, że są 4 pracownicy (nie-menadżerowie)
            employees[0].setSalary(7500);
        }
        if (employees[5] instanceof Manager) {
            ((Manager) employees[5]).setNumberOfSubordinates(4);  // Zakładając, że są 4 pracownicy (nie-menadżerowie)
            employees[5].setSalary(7500);
        }

        // Wyświetlenie zaktualizowanych informacji o pracownikach po modyfikacji
        System.out.println("\nPo modyfikacji:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
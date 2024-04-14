public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Dodawanie pięciu pracowników
        employees[0] = new Employee("Jan kowalski", 50500);
        employees[1] = new Employee("Jan Nowak", 52100);
        employees[2] = new Employee("Grzegorz Brzęczyszczykiewicz", 55000);
        employees[3] = new Employee("Bob Marley", 42200);
        employees[4] = new Employee("Donald Trump ", 6668000);

        // Wyświetlenie danych pracownika o indeksie 3
        System.out.println(employees[3]);

        // Modyfikacja salary dla pracownika o indeksie 3
        employees[3].setSalary(50000);

        // Wyświetlenie danych wszystkich pracowników
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
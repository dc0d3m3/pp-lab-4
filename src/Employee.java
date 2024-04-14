package employees;

public class Employee {
    private String fullName;
    private double salary;

    public Employee(String fullName, double salary) {
        setfullName(fullName);
        setSalary(salary);
    }

    public String getfullName() {
        return fullName;
    }
    public void setfullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("nazwa musi zawierać jakąś zawartość");
        }
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Zmienna salary nie może być ujemna");
        }
        this.salary = salary;
    }
}
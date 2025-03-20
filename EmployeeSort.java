import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + '}';
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 50000));
        employees.add(new Employee("Bob", 25, 60000));
        employees.add(new Employee("Charlie", 35, 55000));
        employees.add(new Employee("David", 28, 75000));

        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("Sorted by name:");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        System.out.println("\nSorted by age:");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println("\nSorted by salary:");
        employees.forEach(System.out::println);
    }
}

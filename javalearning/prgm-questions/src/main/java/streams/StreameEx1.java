package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;


/**
 * Progrma to get max salary earning employee from each dept from list of employees
 */
public class StreameEx1 {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("laptop1", 1, 1000),
                new Employee("laptop2", 1, 8000),
                new Employee("laptop3", 2, 2000),
                new Employee("laptop4", 2, 3000),
                new Employee("laptop5", 3, 4000),
                new Employee("laptop6", 3, 5000),
                new Employee("laptop7", 4, 6000),
                new Employee("laptop8", 4, 7000),
                new Employee("laptop9", 5, 5000),
                new Employee("laptop10", 5, 12000)
        );

        Map<Integer, Optional<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::dept, maxBy(Comparator.comparingInt(Employee::salary))));
        collect.keySet().stream().forEach(key -> {
            System.out.println(key);
            System.out.println(collect.get(key).get().salary());});
    }
}

record Employee(String firstName, int dept, int salary) {
}

package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx2 {
    public static void main(String[] args) {
        // traverse through from index 5 - 10;
        List<Employee> employees = List.of(
                new Employee("laptop", 1, 1000),
                new Employee("laptop", 1, 8000),
                new Employee("laptop", 2, 2000),
                new Employee("laptop", 3, 3000),
                new Employee("laptop", 4, 4000),
                new Employee("laptop", 5, 5000),
                new Employee("laptop", 6, 6000)
        );

        IntStream.range(3, 6).forEach(index -> System.out.println(employees.get(index)));

        employees.stream().skip(3).forEach(System.out::println);

        IntStream generate = IntStream.generate(() -> 1);
        //generate.forEach(System.out::println);

        Map<Integer, Integer> map = employees.stream().collect(Collectors.toMap(Employee::dept, employee -> employee.salary()));
        System.out.println(map.values());

    }
}

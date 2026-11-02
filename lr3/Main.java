package lr3;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[]{
                new Employee("Кучук К.А.", 2340.00),
                new Employee("Золотухо М.О.", 12000.00),
                new Employee("Кисель Е.В.", 4500.00),
                new Employee("Шагава А.В.", 5000.00)
        };

        Report.generateReport(employee);
    }
}
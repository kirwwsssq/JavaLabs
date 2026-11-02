package lr3;

class Report {
    public static void generateReport(Employee[] employee) {
        System.out.println("зп всех сотрудников");
        for (Employee e : employee) {
            System.out.printf("%-15s %10.2f%n", e.fullname, e.salary);
        }
    }
}

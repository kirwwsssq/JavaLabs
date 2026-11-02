package lr3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class l {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер:");
        int t = scanner.nextInt();
        switch (t) {
            case 1:
                System.out.print("Введите строку:");
                String s = scanner.nextLine();

                int last = s.lastIndexOf('o');
                if (last != -1) {
                    System.out.println("Последнего вхождения 'о': " + last);
                } else {
                    System.out.println("Символ о в строке не найден");
                }
                break;
            case 2:
                System.out.print("Введите почту:");
                String email = scanner.nextLine();

                int at = email.indexOf('@');
                int dot = email.lastIndexOf('.');
                if (at != -1 && dot != -1 && dot > at) {
                    System.out.println("Email корректный @: " + at + "индекс точки: " + dot);
                } else {
                    System.out.println("Email некорректный ");
                }
                break;
            case 3:
                Employee[] employee = new Employee[]{
                        new Employee("Кучук К.А.", 2340.00),
                        new Employee("Золотухо М.О.", 12000.00),
                        new Employee("Кисель Е.В.", 4500.00),
                        new Employee("Шагава А.В.", 5000.00)
                };

                Report.generateReport(employee);
                break;
            case 4:
                String input = "a1a a22a a333a a4444a a55555a";
                Pattern pattern = Pattern.compile("a[2-5]+a");
                Matcher matcher = pattern.matcher(input);
                System.out.println("строки:");
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
                break;
            default:
                System.out.println("error");
                break;
        }
        scanner.close();
    }
}

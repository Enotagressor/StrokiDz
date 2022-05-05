import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    public static void task1() {
        //Zadanie 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println(fullName);

        //Zadanie2

        String fullNameReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameReport);

    }

    public static void task2() {
        //Zadanie 3

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
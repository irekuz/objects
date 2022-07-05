import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задание №1
        int year = 2000;
        main1(year);

        //Задание №2
        int clientOs = 1;
        int clientDeviceYear = 2014;
        main2(clientOs, clientDeviceYear);

        //Задание №3
        int deliveryDistance = 95;
        System.out.println("Требуется дней для доставка " + main3(deliveryDistance));
    }

    public static void main1(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("Год является високосным");
        else
            System.out.println("Год не является високосным");
    }

    public static void main2(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static int main3(int distance) {
        int days = 0;
        if(distance >=0 && distance <40)
            days+=1;
        if(distance >=40 && distance <60)
            days+=2;
        if(distance >=60 && distance <80)
            days+=3;
        if(distance >=80)
            days+=4;
        return days;


    }
}
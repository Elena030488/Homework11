public class Main {
    public static void printTask1() {
        System.out.println("Задача 1");
    }
    public static void printTask2() {
        System.out.println("Задача 2");
    }
    public static void printTask3() {
        System.out.println("Задача 3");
    }
    //Задача 1
    public static void checkYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    //Задача 2
    public static void checkDevice (int clientDeviceYear, char clientOS) {
        char iOS = '0';
        char android = '1';
        int currentYear = 2023;
        if (clientOS == iOS) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == android) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Версии программы для данной операционной системы не существует. Пожалуйста, выберите устройство на iOS или Android");
        }
    }
    //Задача 3
    public static String delivery (int deliveryDistance) {
        int deliveryDays;
        if (deliveryDistance > 100) {
            return "Доставки нет";
        } else if (deliveryDistance > 60) {
            deliveryDays = 3;
            return "Потребуется дней: " + deliveryDays;
        } else if (deliveryDistance > 20) {
            deliveryDays = 2;
            return "Потребуется дней: " + deliveryDays;
        } else {
            deliveryDays = 1;
            return "Потребуется дней: " + deliveryDays;
        }
    }
    public static void main (String[] args) {
        printTask1();
        int year = 2003;
        checkYear(year);
        printTask2();
        int clientDeviceYear = 2022;
        char clientOS = '0';
        checkDevice(clientDeviceYear, clientOS);
        printTask3();
        int deliveryDistance = 45;
        String deliveryDays = delivery(deliveryDistance);
        System.out.println(deliveryDays);
    }
}
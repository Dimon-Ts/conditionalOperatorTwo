public class Main {
    public static void main(String[] args) {
        // Домашнее задание 4
        // Задание 1
        System.out.println("Домашнее задание 4");
        System.out.println("Задание 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");
        short clientDeviceYear = 2014;
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию");
        }
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию");
        }

        byte clientOSAI = 0;
        if (clientOSAI == 1) {
            System.out.println("приложения для iOS по ссылке");
        } else {
            System.out.println("приложения для Android по ссылке");
        }


        // Задание 3
        System.out.println("Задание 3");
        System.out.println("Программа-определитель високосного года");
        int year = 2028;
        if (year % 400 == 0) {
            System.out.println(year+ " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year+ " год является не високосным");
        } else if (year % 4 == 0) {
            System.out.println(year+ " год является високосным");
        } else {
            System.out.println(year+ " год не является високосным");
        }

        // Задание 4
        System.out.println("Задание 4");
        System.out.println("Расчёт времени доставки:");
        int deliveryDistance = 100;
        if(deliveryDistance < 20){
            System.out.println("Для доставки Вашей карты потребуется 1 день.");
        }
        if(deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Для доставки Вашей карты потребуется 2 дня");
        }
        if(deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("Для доставки Вашей карты потребуется 3 дня");
        }
        if(deliveryDistance >= 100){
            System.out.println("На доставку Вашей карты потребуется больше 3-х дней.Как только карта прибудет " +
                    "в Ваш населённый пунт,мы вас известим!");
        }

        // Задание 5
        System.out.println("Задание 5");
        System.out.println("Программа определитель сезона года");
        int monthNumber = 12;
        System.out.println("Месяц: " + monthNumber);
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }



    }
}
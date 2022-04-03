package ru.converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите величину, которую хотите конвертировать из одной системы в другую. " +
                    "Для выхода введите -1:");
            for (int i = 1; i <= converter.getUnits().size(); i++)
                System.out.println(i + ". " + converter.getUnits().get(i - 1));
            int unit = scanner.nextInt();
            if (unit == -1)
                break;

            System.out.println("Из какой системы будем переводить?");
            for (int i = 1; i <= converter.getSystems().size(); i++)
                System.out.println(i + ". " + converter.getSystems().get(i - 1));
            int from = scanner.nextInt();
            System.out.println("В какую систему будем переводить?");
            for (int i = 1; i <= converter.getSystems().size(); i++)
                System.out.println(i + ". " + converter.getSystems().get(i - 1));
            int to = scanner.nextInt();
            System.out.print("Конвертируемое значение: ");
            double value = scanner.nextDouble();

            double result = 0;
            switch(converter.getSystems().get(from - 1)) {
                case "Американская система":
                    if (converter.getUnits().get(unit - 1).equals("Единица длины"))
                        result = converter.getLengthFromAmerican(to, value);
                    else if (converter.getUnits().get(unit - 1).equals("Единица массы"))
                        result = converter.getWeightFromAmerican(to, value);
                case "Старорусская система":
                    if (converter.getUnits().get(unit - 1).equals("Единица длины"))
                        result = converter.getLengthFromRussian(to, value);
                    else if (converter.getUnits().get(unit - 1).equals("Единица массы"))
                        result = converter.getLengthFromRussian(to, value);
                case "Международная система":
                    if (converter.getUnits().get(unit - 1).equals("Единица длины"))
                        result = converter.getLengthFromInternational(to, value);
                    else if (converter.getUnits().get(unit - 1).equals("Единица массы"))
                        result = converter.getLengthFromInternational(to, value);
            }

            String strFrom = getRightStringForOutput(converter, from, unit),
                    strTo = getRightStringForOutput(converter, to, unit);
            System.out.println(value + " " + strFrom + " = " + result + " " + strTo);
        }
    }

    private static String getRightStringForOutput(Converter converter, int sys, int unt) {
        String system = converter.getSystems().get(sys - 1);
        String unit = converter.getUnits().get(unt - 1);
        if (unit.equals("Единица длины"))
            switch (system) {
                case "Американская система":
                    return "миля";
                case "Старорусская система":
                    return "сажень";
                case "Международная система":
                    return "метр";
            }
        else if (unit.equals("Единица массы"))
            switch (system) {
                case "Американская система":
                    return "фунт";
                case "Старорусская система":
                    return "пуд";
                case "Международная система":
                    return "килограмм";
            }

        return "";
    }
}

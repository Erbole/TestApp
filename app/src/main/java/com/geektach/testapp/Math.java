package com.geektach.testapp;

public class Math {

    public String add(String a, String b) {
        String result;
        if (a == null || b == null) {
            result = "Поле не должно быть пустым";
        } else if (a.contains(" ") || b.contains(" ")) {
            result = "C пробелами нельзя";
        } else if (isNumeric(a) && isNumeric(b)) {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            if (num1 == Math.ceil(num1) || num2 == Math.ceil(num2)) {
                result = "Только целые числа";
            } else if (num1 < 0 || num2 < 0) {
                result = "Отрицательное нельзя";
            } else {
                result = String.valueOf(num1 + num2);
            }
        } else {
            result = "Буквы складывать нельзя";
        }
        return result;
    }

    private static int ceil(int num1) {
        return 0;
    }

    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public String division(String c, String d) {
        String result;
        if (c == null || d == null) {
            result = "Поле не должно быть пустым";
        } else if (c.contains(" ") || d.contains(" ")) {
            result = "C пробелами нельзя";
        } else if (numeric(c) && numeric(d)) {
            int num3 = Integer.parseInt(c);
            int num4 = Integer.parseInt(d);
            if (num3 == Math.divceil(num3) || num4 == Math.divceil(num4)) {
                result = "Только целые числа";
            } else if (num3 == 0 || num4 == 0) {
                result = "На ноль делить нельзя";
            } else if (num3 < 0 || num4 < 0) {
                result = "Отрицательное нельзя";
            } else {
                result = String.valueOf(num3 / num4);
            }
        } else {
            result = "Буквы складывать нельзя";
        }
        return result;
    }

    private static int divceil(int num3) {
        return 0;
    }

    public boolean numeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
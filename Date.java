package project;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    static Scanner input = new Scanner(System.in);

    Date(int day,int month,int year) {

        if(checkDate(day, month, year)){
            setDay(day);
            setMonth(month);
            setYear(year);
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public static boolean checkYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }

    public static int checkMonth(int month, int year) {   //try catch: bắt lỗi
        try {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    if (checkYear(year)) {
                        return 29;
                    }
                    else {
                        return 28;
                    }
                default: {
                    return 0;
                }
            }
        }
        catch (Exception e) {
            System.out.println("Error");
            return 0;
        }

    }
    public static boolean checkDate(int day, int month, int year) {
        if ((day <= 0 && (month <= 0 || month > 12) && year < 0)) {
            return false;
        }
        if (checkMonth(month, year) < day) {
            return false;
        }
        return true;
    }

}

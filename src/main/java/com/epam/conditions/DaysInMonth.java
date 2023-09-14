package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if((year<=0) || ((month>=12) || (month<0))){
            System.out.println("invalid date");
        }else {
            int countDays = (int) (28 + ((month + Math.floor(month / 8)) % 2) + 2 % month +
                    Math.floor((1 + (1 - (year % 4 + 2) % (year % 4 + 1)) * ((year % 100 + 2) % (year % 100 + 1)) +
                            (1 - (year % 400 + 2) % (year % 400 + 1))) / month) + Math.floor(1 / month) -
                    Math.floor(((1 - (year % 4 + 2) % (year % 4 + 1)) * ((year % 100 + 2) % (year % 100 + 1)) +
                            (1 - (year % 400 + 2) % (year % 400 + 1))) / month));
            System.out.println(countDays);
        }
    }

}

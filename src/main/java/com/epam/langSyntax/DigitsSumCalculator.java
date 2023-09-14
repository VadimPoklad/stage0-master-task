package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        char[] arr= Integer.toString(number).toCharArray();
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=Integer.parseInt(Character.toString(arr[i]));
        }
        System.out.println(sum);
    }
}

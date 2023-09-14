package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        char[] arr= Integer.toString(number).toCharArray();

        char temp = arr[0];
        arr[0]=arr[2];
        arr[2]=temp;

        System.out.println(new String(arr));
    }
}

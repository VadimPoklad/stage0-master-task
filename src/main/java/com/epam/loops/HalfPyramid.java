package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        String pyramid="";
        String padding="";

        for(int i=1; i<cathetusLength+1; i++){
            String temp="";
            for (int j = cathetusLength+1-i ; j>0; j--){
                temp+="*";
            }
            pyramid=padding+temp+"\n"+pyramid;

            padding+=" ";
        }
        System.out.print(pyramid);
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}

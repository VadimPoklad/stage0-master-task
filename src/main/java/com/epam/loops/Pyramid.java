package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        String pyramid="";
        String layer="";
        String indent="";
        int limit = cathetusLength;

        for (int i=0; i<cathetusLength; i++){

            int temp=limit;

            while (temp!=1){
                layer+=temp;
                temp--;
            }
            while (temp<=limit){
                layer+=temp;
                temp++;
            }
            layer=indent+layer;
            pyramid=layer+"\n"+pyramid;

            indent+=" ";
            limit--;
            layer="";
        }
        System.out.print(pyramid);
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}

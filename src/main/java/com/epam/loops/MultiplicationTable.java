package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        String table ="%d x %d = %d";
        for (int i=1; i<11; i++){
            System.out.println(String.format(table,i,numberTableToPrint,i*numberTableToPrint));
        }
    }

}

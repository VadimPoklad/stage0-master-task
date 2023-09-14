package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String massage= "This animal is mostly %s. It has %d paw%s and %s fur.";
        String hasFur;
        String countPaws="";

        if (this.hasFur)hasFur="a";
        else hasFur="no";

        if(numberOfPaws!=1){countPaws="s";}

        return String.format(massage,color,numberOfPaws,countPaws,hasFur);
    }

}

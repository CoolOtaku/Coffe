package com.example.coffe;

import java.util.Arrays;

public class Drink {

   private String name;
    private String desctiption;
    private int imageDesourceld;

    Drink(String name, String desctiption, int imageDesourceld){
        this.name=name;
        this.desctiption=desctiption;
        this.imageDesourceld=imageDesourceld;
    }

    public String getName(){
        return name;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public int getImageDesourceld(){
        return imageDesourceld;
    }
    public static Drink drinks[]= { new Drink("Горілка", "Алкоголь", R.drawable.vodka),
    new Drink("Вино","Алкоголь",R.drawable.vino),
    new Drink("Пивко","Алкоголь під футбол",R.drawable.pivo),
    new Drink("Лате","Кава",R.drawable.late)
    };

    @Override
    public String toString() {
        return name +" "+desctiption +" "+ imageDesourceld;
    }
}

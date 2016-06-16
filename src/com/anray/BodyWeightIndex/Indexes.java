package com.anray.BodyWeightIndex;

/**
 * Created by anray on 16.06.2016.
 */
public enum Indexes {
    one("Выраженный дефицит массы тела",0,16),
            two("Недостаточная масса тела",16,18.5f),
            three("Нормальная масса тела",18.5f,25),
            four("Избыточная масса тела (предожирение)",25,30),
            five("Ожирение 1-ой степени",30,35),
            six("Ожирение 2-ой степени",35,40),
            seven("Ожирение 3-ой степени",40,9999999999999999999f);

    private final String title;
    private final float start;
    private final float end;

    Indexes(String title, float start, float end){
        this.title = title;
        this.start = start;
        this.end = end;
    }

    public String getTitle(){
        return this.title;
    }

    public float getStart(){
        return this.start;
    }

    public float getEnd(){
        return this.end;
    }
}

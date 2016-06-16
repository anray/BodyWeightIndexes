package com.anray.BodyWeightIndex;

/**
 * Created by anray on 16.06.2016.
 */
public class Calculations {

    public float doCalculation(float weight, float height){
        return weight/(height*height);
    }

    public String doComparision(float calculationResult){
        String result = null;
        for(Indexes n : Indexes.values()){
            if(n.getStart() <= calculationResult && calculationResult < n.getEnd()){

                result = n.getTitle();
                break;
            }
            //хочу узнать выходит ли после break из цикла
            int i=0;
            i++;
            System.out.println(i);
        }
        return result;
    }
}

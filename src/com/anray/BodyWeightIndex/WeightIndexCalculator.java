package com.anray.BodyWeightIndex;

/**
 * Created by anray on 16.06.2016.
 */
public class WeightIndexCalculator {

    public static float calculateWeightIndex(float weight, float height){
        return weight/(height*height/10000);
    }

    public static String getWeightIndexTitle(float calculationResult){
        String result = null;
        int i=0;
        for(Indexes n : Indexes.values()){
            if(n.getStart() <= calculationResult && calculationResult < n.getEnd()){

                result = n.getTitle();
                break;
            }
            //хочу узнать выходит ли после break из цикла - Да, выжодит
/*
            i++;
            System.out.println(i);
            */
        }
        return result;
    }
}

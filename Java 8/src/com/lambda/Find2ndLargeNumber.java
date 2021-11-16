package com.lambda;

import java.util.Arrays;

public class Find2ndLargeNumber {
    public static void main(String[] args) {

        int save3Numbers=0;
        int save5Numbers=0;
        int total=0;

        for (int i = 0; i <= 100; i++) {
            if(i%3==0){
                System.out.println("print 3= "+i);
                save3Numbers=save3Numbers+i;

            }else if(i%5==0){
                System.out.println("print 5= "+i);
                save5Numbers=save5Numbers+i;

            }total=save3Numbers+save5Numbers;
        }
        System.out.println(total);


}
}
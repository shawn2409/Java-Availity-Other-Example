package com.lambda;

import java.util.*;
import java.util.stream.Stream;

public class StreamApiEx {

    public static void main(String[] args) {
        {
            // string stream filter shorted
            String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
            Arrays.stream(names).filter(x -> x.startsWith("S")).sorted().forEach(r -> System.out.println(r));

            List<Integer> num = Arrays.asList(3, 5, 4, 6);
            Collections.sort(num);
          /*  for (Integer b : num) {
                System.out.println(b);
            }*/
            num.stream().sorted().forEach(a->{
                System.out.println(a);
            });

            Arrays.stream(names).filter(x->x.startsWith("A")).sorted().forEach(p->{
                System.out.println(p);
            });


        }

    }
}

package com.company;

import java.util.Arrays;

public class Main {
            public static void main(String[] args) {

                String a="forfcef";
                char []c=a.toCharArray();
int count = 0;
char k='K';

StringBuffer str= new StringBuffer(a);


                for (int i = 0; i <c.length; i++) {

                if(c[i]=='f'){

                    count=i;

                    System.out.println(count);
                    str.insert(count,'K');


                }

                  }


                    }
                }






package com.lambda;

public interface Drawable {

    //public void draw();

   // public String say(String name);
public  String num(String a,String b);



}


class B{

   public static void main(String[] args) {

      Drawable d= (a,b)->{

         return a+b;
      };
      System.out.println(d.num("as","df"));

   }


        }

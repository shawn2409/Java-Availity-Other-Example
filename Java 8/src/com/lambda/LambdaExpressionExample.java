package com.lambda;

public interface LambdaExpressionExample {

   public int add(int a, int b);

}

class  Name {

    public static void main(String[] args) {

    LambdaExpressionExample lm =(a,b)->{
      return a+b;
    };

        System.out.println(lm.add(2,3));

    }
}
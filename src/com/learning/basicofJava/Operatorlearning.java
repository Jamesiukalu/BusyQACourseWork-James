package com.learning.basicofJava;

public class Operatorlearning {
	public static void main(String[] args) {
		int a = 11;
		int b = 5;
//		int sum = a+b;
//		int subtraction = a-b;
//		int multiply = a*b;
//		int divide = a/b;
//		int modulus = a%b;
//		System.out.println("Addition of A and B equals: "+ sum);
//		System.out.println("Substraction of B From A equals: "+ subtraction);
//		System.out.println("Multiplication of B and A equals: "+ multiply);
//		System.out.println("Division of A by B equals: "+ divide);
//		System.out.println("Modulus of A by B equals: "+ modulus);
//		
//      System.out.println("increment value of A equals: "+ a++);
//      System.out.println("increment value of A equals: "+ a);
//      System.out.println("increment value of A equals: "+ ++a);
//      System.out.println("increment value of A equals: "+ a);
		//RelATIONAL OPERATORS
		a = 5;
		b = 6;
		int c = 5;
//		boolean isEqual = (a == b); //5==6
//        boolean isNotEqual = (a != b); //5!=6
//        boolean isGreaterThan = (a > b); //5>6
//        boolean isLessThan = (a < b); //5<6
//        boolean isGreaterOrEqual = (a >= b); //5>=6
//        boolean isLessOrEqual = (a <= b); //5<=6
//        
//        System.out.println("condition value equals check: isEqual :" + isEqual);
//        System.out.println("condition value equals check: isNotEqual :" + isNotEqual);
//        System.out.println("condition value equals check: isGreaterThan :" + isGreaterThan);
//        System.out.println("condition value equals check: isLessThan :" + isLessThan);
//        System.out.println("condition value equals check: isGreaterOrEqual :" + isGreaterOrEqual);
//        System.out.println("condition value equals check: isLessOrEqual :" + isLessOrEqual);
        
        //LOGICAL OPERATORS
        
        boolean logAnd = ((a==c) && (a<b));
		boolean logAndfalse = ((a!=c) && (a<b));
		boolean logicalOr = ((a==c) || (a<b));
		boolean logicalOrfasle = ((a!=c) || (a>b));
		boolean logicalnot = (!(a==c));
		boolean logicalnot2 = (!(a==b));
		
		System.out.println("condition value equals check: logAnd :" + logAnd);
		System.out.println("condition value equals check: logAndfalse :" + logAndfalse);
		System.out.println("condition value equals check: logicalOr :" + logicalOr);
		System.out.println("condition value equals check: logicalOrfasle :" + logicalOrfasle);
		System.out.println("condition value equals check: logicalnot :" + logicalnot);
		System.out.println("condition value equals check: logicalnot2 :" + logicalnot2);
	}
}

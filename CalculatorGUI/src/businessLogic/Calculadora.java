/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;
/**
 *
 * @author Anabel
 * @author Juliana
 * @author Fabio
 */ 
public class Calculadora {
    
    public static float add(float a, float b)
    {
        return a+b;
    }
    
    public static float substract(float a, float b)
    {
        return a-b;
    }
    
    public static float multiply(float a, float b)
    {
        return a*b;
    }
    
    public static float div(float a, float b)
    {
        return a/b;
    }

    public static float mod(float a, float b) {
        float result;

        result = a%b;
        if(Float.isNaN(result)){
            throw new ArithmeticException("Is NaN");
        }else{
            return result;
        }
    }

    public static float sign(float a) {
        System.out.println(a*-1);
        return ((-1)*a);
    }

    public static double powOfTen(float a) {return Math.pow(a,10);}

    public static double sqrt(float a){
        double result = Math.sqrt(a);

        if(Double.isNaN(result)){
            throw new ArithmeticException("Is imaginary");
        }else{
            return result;
        }
    }

    public static double factorial(float a) {

        int fact=1;

        for(int i=1; i<=a;i++){
            fact*=i;
        }

        return fact;

    }

    public static  double log(float a){return  Math.log(a);}

    public static String deleteL(String str){
        if(str.length() > 1){
            return str.substring(0,str.length()-1);
        }
        return "";
    }

    public static boolean justNumber(String s){
        return s.matches("[0-9]+[0-9]*");
    }
}


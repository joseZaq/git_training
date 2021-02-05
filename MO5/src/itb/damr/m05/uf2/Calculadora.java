package itb.damr.m05.uf2;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //VARs
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int a=scanner.nextInt();
        int b= scanner.nextInt();
        //actions
    }
    public  int suma(int a,int b){
        return (a+b);
    }
    public  int resta(int a,int b){
        return (a-b);
    }
    public  int multiplication(int a,int b){
        return (a*b);
    }
    public  int division(int a,int b){
        return (a/b);
    }
}

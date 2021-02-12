package M05;

public class Calc {
    public int suma(int a, int b){
        return (a+b);
    }
    public int resta(int a, int b){
        return (a-b);
    }
    public int mult(int a, int b){
        //return (a*b);
        int result = 0;
        if(b < 0 ){
            b*=-1;
            a*=-1;
        }
        for (int i = 0; i < b; i++) {
                result += a;
        }
        return result;
    }
    public int div(int a, int b){
        return (a/b);
    }
}

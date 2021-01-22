package itb.damr.m05;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class buscaminas {
    //hacer un buscaminas
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);
        //imprime el titulo y la petición
        System.out.print("            BUSCAMINAS\nIngresa las filas y columnas del buscaminas:\n m x n = ");
        System.out.println();
        //solocita filas(m) y columnas(n) de la matriz del buscaminas
        int m=scanner.nextInt();
        int n=scanner.nextInt();
        int[][] mapaMinas=new int[m][n];
        //poner minas
        for(int i=0;i<mapaMinas.length;i++){
            for(int j=0;j<mapaMinas[i].length;j++){
                mapaMinas[i][j]= (int)(-2*Math.random());
            }
        }
        System.out.println(Arrays.deepToString(mapaMinas));
        //colocar numeros propios de cada casilla
        int valorCasilla=0;
        for(int i=1;i<mapaMinas.length-1;i++){
            for(int j=1;j<mapaMinas[i].length-1;j++){
                valorCasilla=0;
                //lados
                if(mapaMinas[i][j+1]==-1) valorCasilla++;
                if(mapaMinas[i][j-1]==-1) valorCasilla++;
                if(mapaMinas[i+1][j]==-1) valorCasilla++;
                if(mapaMinas[i-1][j]==-1) valorCasilla++;
                //esquinas
                if(mapaMinas[i+1][j+1]==-1) valorCasilla++;
                if(mapaMinas[i+1][j-1]==-1) valorCasilla++;
                if(mapaMinas[i-1][j+1]==-1) valorCasilla++;
                if(mapaMinas[i-1][j-1]==-1) valorCasilla++;
                mapaMinas[i][j]=valorCasilla;
            }
        }
        for (int i = 0; i < mapaMinas.length; i++) {
            for (int j = 0; j < mapaMinas[i].length; j++) {
                if(mapaMinas[i][j] == -1) System.out.print("\u26FD ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(mapaMinas));
    }
}

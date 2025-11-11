/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_paso_referencia;

import java.util.Scanner;

/**
 *
 * @author licce
 */
public class EVA3_5_Paso_Referencia {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int valor[] = new int [1];//new --> objetos
        System.out.println("Mete un número");
        valor [0] = 5;
         System.out.println(valor);
        System.out.println("valor (antes) = " + valor[0]);
        incrementar(valor);
        System.out.println("valor (despues) = " + valor[0]);
    }
    public static void incrementar(int[] val){
        System.out.println(val);
    for(int i = 0; i < val.length; i++){
    val [i] = val[i] + 1;
    //val[i]++;
    }
    }
}

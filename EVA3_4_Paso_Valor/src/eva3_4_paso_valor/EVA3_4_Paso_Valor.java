/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_paso_valor;

/**
 *
 * @author licce
 */
public class EVA3_4_Paso_Valor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int valor = 5;
        System.out.println("Valor (antes) = " + valor);
        incrementar(valor);
        System.out.println("Valor (después) = " + valor);
    }
    public static void incrementar(int val){
    val = val + 1;
    //Val++
    }
}

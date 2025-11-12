/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_paso_referencia;

import java.util.Scanner;

/**
 *
 * @author licce
 */
public class EVA3_7_Paso_Referencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cliente[] = new String[5];
        double credito[] = new double[5];
      
        capturarClientes(cliente, credito);
        imprimir(cliente, credito);
        
        
    }
    public static void capturarClientes(String[] nombre, double[] credito){
    Scanner captu = new Scanner (System.in);
    for(int i = 0; i < credito.length; i++){
        System.out.print("Nombre del cliente: ");
        nombre[i] = captu.nextLine();
        System.out.print("Crédito del cliente: ");
        credito[i] = captu.nextInt();
        captu.nextLine();
       }
    }
    public static void imprimir(String[] nombre, double[] credito){
      System.out.println("--------------------------------------------------");
        for(int i = 0; i < credito.length; i++){
        
        System.out.println("Nombre: " + nombre[i] + 
                " Crédito: $" + credito[i]);
      }
      System.out.println("--------------------------------------------------");
    }
}

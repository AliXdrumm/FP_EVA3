/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_menu;

import java.util.Scanner;

/**
 *
 * @author licce
 */
public class EVA3_3_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int opcion;
        
        do{
        imprimirMenu();
        opcion = input.nextInt();
        if(opcion == 1){
            
        calcularPotencia();
        
        }else if(opcion == 2){
        
            darNumeros();
        }else
                System.out.println("Gracias por usar el sistema!!!!!");
        }while(opcion != 3);
    }
    public static void imprimirMenu(){
        System.out.println("Bienvienido al sistema");
        System.out.println("1.Calcular una potencia");
        System.out.println("2.Sumar dos números");
        System.out.println("3.Salir del sistema");
        System.out.println("Seleccione la opción: ");
    }
    public static void calcularPotencia(){
    Scanner input = new Scanner(System.in);
    int base, exponente;
        System.out.println("********CALCULO DE POTENCIAS**********");
        System.out.println("Captura la base:");
        base = input.nextInt();
        System.out.println("Captura el exponente:");
        exponente = input.nextInt();
        System.out.println(base + " Elevado a " + exponente + " = " + potenciaDada(base, exponente));
        
    }
    public static int potenciaDada(int base, int exponente){
    int resu = 1;
        for(int i = 1; i <= exponente; i++){
    resu = resu * base;
       }
        return resu;
    }
    public static int darNumeros(){
        Scanner input = new Scanner (System.in);
        System.out.println("********SUMA DE NUMEROS*******");
        System.out.println("Introduce el primer número");
        int num1 = input.nextInt();
        System.out.println("Introduce el segundo número");
        int num2 = input.nextInt();
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + sumarNumeros(num1,num2));
        return 0;
    }
    public static int sumarNumeros(int num1, int num2){
    int resu = num1 + num2;
        return resu;
    }
}

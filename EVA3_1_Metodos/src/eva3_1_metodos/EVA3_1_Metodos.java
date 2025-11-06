/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author licce
 */
public class EVA3_1_Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val1 = 5, val2 = 10;
        //1. Si necesito guardar el valor de retorno
        int resu = sumaEnteros(val1, val2);//Invocar el método
        System.out.println("Suma de " + val1 + " y " + val2 + " Es: " + resu);
        //2. No necesito el guardar el valor solo lo voy a usar una vez
        System.out.println("Suma de 5 + 10 es: " + sumaEnteros(val1, val2));
        //3. Solo necesito ejecutar el método, no interesa el resultado
        sumaEnteros(val1, val2);

    }
    //METODOS PARA SUMAR ENTEROS
    //Llama a sus metodos usando verbos y escritura canelCase(Primero una minuscula)
    //1.Modificadores de acceso: public, protected, privated, dominated
    //2.Static---> Para usarlos dentro del main
    //3.Valor de retorno: cualquier tipo de dato
    //Void---> Si no quiere regresar un valor
    //4.Nombre del método
    //5.Lista de parámetros; pueden ser 0 o N cantidad
    //1      2      3     4     5
    public static int sumaEnteros(int num1, int num2){
    int suma = num1 + num2;
    return suma;
    
    
    
    }
}

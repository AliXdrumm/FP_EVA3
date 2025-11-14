/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_areas;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA3_9_Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("----------BIENVENIDO A LA CALCULADORA DE ÁREAS---------");
        
       int opcion;
        do{
            seleccionMenu();
            
       opcion = input.nextInt();
       
       if(opcion == 1){
           
       calcularArea();
       
       }else if(opcion == 2){
           
       calculaArea();
       
       }else if(opcion == 3){
       
       calcArea();
               
       }
       
       }while(opcion != 4);
        System.out.println(" ");
        System.out.println("-------------------------------");
        System.out.println("Muchas gracias por usarnos!!");
        System.out.println("-------------------------------");
    }
    public static void seleccionMenu(){
      
        System.out.println(" ");
        System.out.println("1 para Círculo");
        System.out.println("2 para Rectangulo");
        System.out.println("3 para Trapecio");
        System.out.println("4 para Salir");
        System.out.println("-------------------------------");
    }
       public static void calcularArea(){
        Scanner input = new Scanner(System.in);
        System.out.println("--------AREA DEL CIRCULO--------");
        System.out.print("Introduzca el valor del radio: ");
        double rad = input.nextDouble();
        
        System.out.println("-------------------------------");
        System.out.println("El área del círculo de radio " + rad + " es: " + areaCirculo(rad));
        System.out.println("-------------------------------");
    }

    public static double areaCirculo(double rad){
        double area = (rad * rad) * 3.1416;
        return area; 
    }
    public static void calculaArea(){
    Scanner input = new Scanner(System.in);
        System.out.println("--------AREA DEL TRIANGULO--------");
        System.out.print("Introduzca el valor de la base: ");
        double base = input.nextDouble();
         System.out.print("Introduzca el valor de la altura: ");
         double altura = input.nextDouble();
         
         System.out.println("-------------------------------");
         System.out.println("El rectangulo de base " + base + " y de altura " + altura + " es: " + rectanguloArea(base, altura));
         System.out.println("-------------------------------");
    }
    public static double rectanguloArea(double base, double altura){
    double area;
    area = (base * altura);
    return area;
    }
    public static void calcArea(){
        Scanner input = new Scanner(System.in);
    System.out.println("--------AREA DEL TRAPECIO--------");
        System.out.print("Introduzca el valor de la base mayor: ");
        double base1 = input.nextDouble();
         System.out.print("Introduzca el valor de la base menor: ");
         double base2 = input.nextDouble();
         System.out.print("Introduzca el valor de la base altura: ");
         double altura = input.nextDouble();
         
         System.out.println("-------------------------------");
         System.out.println("El área del trapecio es de: " + trapecioArea(base1, base2, altura));
         System.out.println("-------------------------------");
    }
    public static double trapecioArea(double base1, double base2, double altura){
    double area;
    area = ((base1 + base2) * altura) / 2;
    return area;
    }
}

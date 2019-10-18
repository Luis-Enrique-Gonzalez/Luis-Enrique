/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luis;
import java.util.Scanner;

public class Main 
{

 public static int leerEntero(String texto)
 {
  Scanner leer=new Scanner(System.in);
  System.out.println(texto);
  int dato=leer.nextInt();
  return dato;
 }
 
 public static int menu()
 {
  System.out.println("---Menu---");
  System.out.println("1.- Imprimir lista");
  System.out.println("2.- Eliminar nodos que superen un valor dado");
  System.out.println("3.- Salir");
  
 
  int seleccion=leerEntero("Seleccione una opción: ");
  return seleccion;
 }
 
 public static void main(String[] args) 
 {
  Lista coleccion=new Lista();
  int opcion;
  
  
  coleccion.agregarFin(10);
  coleccion.agregarFin(55);
  coleccion.agregarFin(22);
  coleccion.agregarFin(5);
  coleccion.agregarFin(7);
  coleccion.agregarFin(12);
  
  do
  {
   opcion=menu();
   switch(opcion)
   {
   case 1:
    
    System.out.println("Lista Ingresada:");
    coleccion.imprimir();
    break;
   
   case 2:
    int exp=leerEntero("Ingrese el numero base para eliminar datos");
    coleccion.eliminar(exp);
    break;
    
   
   default:
    System.out.println("FIN DEL PROGRAMA");
    break; 
   }
  }while(opcion!=3);

 }

}

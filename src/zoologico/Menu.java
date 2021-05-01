/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import java.util.Scanner;

public class Menu 
{
    static Zoologico zo = new Zoologico(); //Objeto Zoologico creado.
    //ingreso por consola.
    public static Scanner inp = new Scanner(System.in);
    public static int opcion;
    public static boolean exist = false;
        
    private static void validaExistencia(){
        if(zo.getNOMBRE()==null)
            System.out.println("Sin zoologicos por el momento, favor de agregar.");
        else
            exist = true;
    }
    
    //Agregar Datos al objeto Zoologico
    public static void subMenuAgregarNuevo()    {
        //Limpiamos el input.
        inp.next();
        System.out.println("Ingrese los datos del Zoologico: ");
        System.out.println("\n Nombre: ");
        System.out.println("\n Ciudad: ");
        System.out.println("\n Pais: ");
        System.out.println("\n Estado actual: ");
        System.out.println("\n Encargado: ");
        System.out.println("Ingrese los datos del Encargado: ");
    }
    
    public static void subMenuMostrar() {
        Menu.validaExistencia();
    }
    
    public static void subMenuMostrarSegunEstado()  {
        Menu.validaExistencia();
    }
    
    public static void subMenuModificar(){}

    public static void Menu(int op){
        switch(op){
            case 1:
                Menu.subMenuAgregarNuevo();
                break;
            case 2:
                Menu.subMenuMostrar();
                break;
            case 3:
                break;
            case 4:
                Menu.subMenuMostrarSegunEstado();
                break;
            case 5:
                inp.close();
                break;
            default:
                System.out.println("Ingrese una opción valida.");
        }
    }
    
    public static void ImprimeMenu(){
        while(opcion!=5) {
                System.out.print("\n ************************************** \n");
                System.out.println("\n _.: - - - - - Menu de opciones. - - - - - :._"      + 
                        "\n---------------------------------------" +
                        "\n[1].-Agregar Zoologico Nuevo."           +
                        "\n[2].-Mostrar Zoologicos."                +
                        "\n[3].-Modificar Zoologico Existente."     +
                        "\n[4].-Mostrar Zoologicos [Segun estado]"  +
                        "\n---------------------------------------" +
                        "\n[5].-Salir.");
                System.out.print("\n ************************************** \n");
                System.out.print("\n Ingrese una opcion[1-5]->:");
                opcion = inp.nextInt();
                Menu.Menu(opcion);
        }
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ImprimeMenu();
        
    }
}

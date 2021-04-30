/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import zoologico.*;

public class Menu {
    
    public void Menu(){}
    public void SubMenu(){}
    
    public static void ImprimeMenu(){
        System.out.println(" _.: - - - - - Menu de opciones. - - - - - :._"      + 
                "\n---------------------------------------" +
                "\n[1].-Agregar Zoologico Nuevo."           +
                "\n[2].-Mostrar Zoologicos."                +
                "\n[3].-Modificar Zoologico Existente."     +
                "\n[4].-Mostrar Zoologicos [Segun estado]"  +
                "\n---------------------------------------" +
                "\n[5].-Salir.");
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Zoologico zo = new Zoologico(); //Objeto Zoologico creado.
        System.out.print("\n ************************************** \n");
        ImprimeMenu();
        System.out.print("\n ************************************** \n");
    }
}

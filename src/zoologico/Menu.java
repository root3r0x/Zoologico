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
    public static Scanner curp = new Scanner(System.in);
    public static Scanner datos = new Scanner(System.in);
    
    public static int opcion;
    public static boolean firstRun = true;
    
    public static void closeScanners(){
        inp.close();
        datos.close();
        curp.close();
    }
    public static void clearScanners(){
        datos.next();
        curp.next();
    }
    public static void validaExistencia(int menu){
        if(zo.getNOMBRE()==null)
            System.out.println("\n Sin zoologicos por el momento," +
                    "\n favor de agregar datos.");
        if(menu==2){}
            
    }
    
    //Agregar Datos al objeto Zoologico
    public static void subMenuAgregarNuevo()    {
        
        //zo = new Zoologico(); //Creamos el objeto.
        
        if(firstRun!=false){
            System.out.println("\n Precione enter para continuar...\n");
            inp.nextLine();
            datos.nextLine();
            System.out.println();
            firstRun = true;
        }
        
        String nombreZo, ciudadZo, paisZo, nombreEncargado, curpEncargado;
        int estadoActZo;
        double areaZo, presupuestoAnual;
        
        System.out.print("Ingrese los datos del Zoologico: ");
        System.out.print("\n Nombre: ");
        nombreZo = curp.nextLine();
        System.out.print("\n Ciudad: ");
        ciudadZo = datos.nextLine();
        System.out.print("\n Pais: ");
        paisZo = datos.nextLine();
        System.out.println("\n [1]Abierto al publico [2] En remodelacion [3] Cerrado");
        System.out.print(" Estado actual: ");
        estadoActZo = datos.nextInt();
        System.out.print("\n Area del Zoologico: ");
        areaZo = datos.nextDouble();
        System.out.print("\n Presupuesto anual del Zoologico: $");
        presupuestoAnual = datos.nextDouble();
        System.out.print("\n Ingrese los datos del Encargado de este Zoologico: ");
        System.out.print("\n Nombre del Encargado:");
        nombreEncargado = curp.nextLine();
        System.out.print("\n Curp del Encargado:");
        curpEncargado = curp.nextLine();
        
        System.out.println("\n Nombre: " + nombreZo + 
                " \n Ciudad: " + ciudadZo + 
                " \n Pais: " + paisZo +
                " \n Estado actual: " + estadoActZo +
                " \n Area del zoo: " + areaZo + " mts" +
                " \n Presupuesto: " + presupuestoAnual +
                " \n -- Datos encargado --- " +
                " \n Nombre Encargado: " + nombreEncargado +
                " \n Curp Encargado: " + curpEncargado);
        
        //Asignamos los datos al objeto.
        zo.setNOMBRE(nombreZo);
        zo.setCIUDAD(ciudadZo);
        zo.setPAIS(paisZo);
        zo.setESTADO_ACTUAL(estadoActZo);
        zo.setAREA(areaZo);
        zo.setPRESUPUESTO_ANUAL(presupuestoAnual);
        zo.setENCARGADO(nombreEncargado);
        zo.setCURPENCARGADO(curpEncargado);
        Menu.subMenuMostrar(); //Confirmamos los datos del objeto.
                
    }
    
    public static void subMenuMostrar() {
        
        Menu.validaExistencia(2);
        
        String nombreZo = zo.getNOMBRE();
        String ciudadZo = zo.getCIUDAD();
        String paisZo = zo.getPAIS();
        String nombreEncargado = zo.getENCARGADO();
        String curpEncargado = zo.getCURP();
        String estadoActZo = zo.getESTADO_ACTUAL();
        double areaZo = zo.getAREA();
        double presupuestoAnual = zo.getPRESUPUESTO_ANUAL();
        
        System.out.println("\n Nombre: " + nombreZo +
                "\n Ciudad: " + ciudadZo + 
                "\n Pais: " + paisZo +
                "\n Estado actual: " + estadoActZo +
                "\n Area del zoo: " + areaZo +
                "\n Presupuesto: " + presupuestoAnual +
                "\n -- Datos encargado --- " +
                "\n Nombre Encargado: " + nombreEncargado +
                "\n Curp Encargado: " + curpEncargado);    
    }
    
    public static void subMenuMostrarSegunEstado()  {
        Menu.validaExistencia(4);
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
        closeScanners();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

public class Zoologico {
    private String NOMBRE;
    private String CIUDAD;
    private String PAIS;
    private double AREA; //M^2 -> Tamaño
    private double PRESUPUESTO_ANUAL;
    private final String[] ESTADO;
    
    private String ENCARGADO;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public Zoologico() {
        this.ESTADO = new String[]{" ", " ", " "};
    }
    
}

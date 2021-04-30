/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//    public Zoologico (String nombre,String ciudad, String pais,double area, double presupuesto_anual){
//        this.NOMBRE                 = nombre;
//        this.CIUDAD                 = ciudad;
//        this.PAIS                   = pais;
//        this.AREA                   = area;
//        this.PRESUPUESTO_ANUAL    = presupuesto_anual;
//    }
// 

package zoologico;

import javafx.scene.layout.Region;

public class Zoologico {
    
    private String NOMBRE;
    private String CIUDAD;
    private String PAIS;
    private String ESTADO_ACTUAL;
    private final String[] ESTADO = {"Abierto al publico.", "En Remodelacion.", "Cerrado."};
    private String ENCARGADO;
    private String PERIODO;
    
    private double AREA; //M^2 -> Tamaño
    private double PRESUPUESTO_ANUAL;    
    
    public Zoologico() {
        super();
    }
     
    /**
     * @param ESTADO the ESTADO actual del zoologico.
     */
    public void setESTADO_ACTUAL(int estado){
        switch(estado)  
        { 
            case 0:
                this.ESTADO_ACTUAL = this.ESTADO[0]; //Abierto al publico.
                break;
            case 1:
                this.ESTADO_ACTUAL = this.ESTADO[1] = "En remodelacion."; //En Remodelacion.
                break;
            case 2:
                this.ESTADO_ACTUAL = this.ESTADO[2] = "Cerrado."; //Cerrado.
                break;
        }
    }
    /**
     * 
     * @return ESTADO_ACTUAL the Estado actual del zoologico.
     * @return 1) Abierto al publico.
     * @return 2) En remodelacion.
     * @return 3) Cerrado 
     */
    public String getESTADO_ACTUAL(){
        return this.ESTADO_ACTUAL;
    }
    /**
     * @return the NOMBRE
     */
    public String getNOMBRE() {
        return NOMBRE;
    }

    /**
     * @param NOMBRE the NOMBRE to set
     */
    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }
  
    /**
     * @return the CIUDAD
     */
    public String getCIUDAD() {
        return CIUDAD;
    }

    /**
     * @param CIUDAD the CIUDAD to set
     */
    public void setCIUDAD(String CIUDAD) {
        this.CIUDAD = CIUDAD;
    }

    /**
     * @return the PAIS
     */
    public String getPAIS() {
        return PAIS;
    }

    /**
     * @param PAIS the PAIS to set
     */
    public void setPAIS(String PAIS) {
        this.PAIS = PAIS;
    }

    /**
     * @return the ENCARGADO
     */
    public String getENCARGADO() {
        return ENCARGADO;
    }

    /**
     * @param ENCARGADO the ENCARGADO to set
     */
    public void setENCARGADO(String ENCARGADO) {
        this.ENCARGADO = ENCARGADO;
    }

    /**
     * @return the AREA
     */
    public double getAREA() {
        return AREA;
    }

    /**
     * @param AREA the AREA to set
     */
    public void setAREA(double AREA) {
        this.AREA = AREA;
    }

    /**
     * @return the PRESUPUESTO_ANUAL
     */
    public double getPRESUPUESTO_ANUAL() {
        return PRESUPUESTO_ANUAL;
    }

    /**
     * @param PRESUPUESTO_ANUAL the PRESUPUESTO_ANUAL to set
     */
    public void setPRESUPUESTO_ANUAL(double PRESUPUESTO_ANUAL) {
        this.PRESUPUESTO_ANUAL = PRESUPUESTO_ANUAL;
    }

    /**
     * @return the PERIODO
     */
    public String getPERIODO() {
        return PERIODO;
    }

    /**
     * @param PERIODO the PERIODO to set
     */
    public void setPERIODO(String PERIODO) {
        this.PERIODO = PERIODO;
    }
    
}

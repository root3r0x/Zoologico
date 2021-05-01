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
package zoologico;

public class Zoologico {
    
    private String NOMBRE;
    private String CIUDAD;
    private String PAIS;
    private String ESTADO_ACTUAL;
    private final String[] ESTADO = {"Abierto al publico.", "En Remodelacion.", "Cerrado."};
    private String ENCARGADO;
    private String ENCARGADO_CURP;
    private String FECHA_APERTURA;
    private String FECHA_CIERRE;
    
    private double AREA; //M^2 -> Tamaño
    private double PRESUPUESTO_ANUAL;    
    
    public Zoologico() {
        super();
    }
         
    /**
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
     * @param ENCARGADO the ENCARGADO_NOMBRE to set
     * @param 
     */
    public void setENCARGADO(String ENCARGADO) {
        this.ENCARGADO = ENCARGADO;
    }
    /**
     * @param CURP_ENCARGADO the ENCARGADO_CURP to set
     */
    public void setCURPENCARGADO(String CURP_ENCARGADO) {
        this.ENCARGADO_CURP = CURP_ENCARGADO;
    }
    /**
     * @return the ENCARGADO
     */
    public String getCURP() {
        return ENCARGADO_CURP;
    }
    
    /**
     * @return the FECHA_APERTURA
     */
    public String getFECHA_APERTURA() {
        return FECHA_APERTURA;
    }

    /**
     * @param FECHA_APERTURA the FECHA_APERTURA to set
     */
    public void setFECHA_APERTURA(String FECHA_APERTURA) {
        this.FECHA_APERTURA = FECHA_APERTURA;
    }

    /**
     * @return the FECHA_CIERRE
     */
    public String getFECHA_CIERRE() {
        return FECHA_CIERRE;
    }

    /**
     * @param FECHA_CIERRE the FECHA_CIERRE to set
     */
    public void setFECHA_CIERRE(String FECHA_CIERRE) {
        this.FECHA_CIERRE = FECHA_CIERRE;
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
    
}

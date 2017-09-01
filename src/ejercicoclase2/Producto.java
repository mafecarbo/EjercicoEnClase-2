/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicoclase2;

/**
 *
 * @author myd.abogados
 */
public class Producto {
    private String nombreP;
    private int cantidadP;
    private int contadorP;
    private double ivaP;
    private int minimo;
    private String tipo;
    private double precio;

    public Producto(String nombreP, int cantidadP, double ivaP, int minimo, String tipo, double precio) {
        this.nombreP = nombreP;
        this.cantidadP = cantidadP;
        this.ivaP = ivaP;
        this.minimo = minimo;
        this.tipo = tipo;
        this.precio = precio;
        this.contadorP= 0;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getCantidadP() {
        return cantidadP;
    }

    public void setCantidadP(int cantidadP) {
        this.cantidadP = cantidadP;
    }

    public int getContadorP() {
        return contadorP;
    }

    public void setContadorP(int contadorP) {
        this.contadorP = contadorP;
    }

    public double getIvaP() {
        return ivaP;
    }

    public void setIvaP(double ivaP) {
        this.ivaP = ivaP;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean vender(int a){
        if(a>0){
            if (this.cantidadP>a){
            this.cantidadP=this.cantidadP-a;
            this.contadorP=this.contadorP+a;
            return true;
            }
            else{
               return false; 
            }
            
        }
        else{
          return false;  
        } 
    }
    
    public void pedido(){
        if(this.cantidadP<=this.minimo){
            System.out.println("Ya ha llegado a la minima cantidad de su producto: "+this.nombreP+" asi que le recomiendo que pida mas al distribuidor.");
        }
        else{
           System.out.println("Aun no ha llegado a la minima cantidad de su producto: "+this.nombreP+" asi que no hay necesidad de hacer un pedido aun"); 
        }
    }
    public void pedir (int a){
        if(a>0){
            this.cantidadP=this.cantidadP+a;
            System.out.println("Proceso exitoso, ha realizado el pedido");
        }
        else{
           System.out.println("Proceso incorrecto, ha se ha podido realizar el pedido"); 
        }
    }
    public double precioconIva(){
        return this.precio+(this.precio*this.ivaP);
        
    }
    
    
}

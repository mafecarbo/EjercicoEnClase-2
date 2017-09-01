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
public class Tienda {
    private final String nombreT;
    private final int nit;
    private Producto[] productos;

    public Tienda(String nombreT, int nit) {
        this.nombreT = nombreT;
        this.nit = nit;
        this.productos=new Producto[4];
    }
    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public String getNombreT() {
        return nombreT;
    }

    public int getNit() {
        return nit;
    }
    public void masVendido(){
        if(this.productos[0].getContadorP()>=this.productos[1].getContadorP() && this.productos[0].getContadorP()>=this.productos[2].getContadorP() && this.productos[0].getContadorP()>=this.productos[3].getContadorP()){
            System.out.println("El producto que mas se ha vendido fue: "+this.productos[0].getNombreP());
        }
        if(this.productos[1].getContadorP()>=this.productos[0].getContadorP() && this.productos[1].getContadorP()>=this.productos[2].getContadorP() && this.productos[1].getContadorP()>=this.productos[3].getContadorP()){
            System.out.println("El producto que mas se ha vendido fue: "+this.productos[1].getNombreP());
        }
        if(this.productos[2].getContadorP()>=this.productos[1].getContadorP() && this.productos[2].getContadorP()>=this.productos[0].getContadorP() && this.productos[2].getContadorP()>=this.productos[3].getContadorP()){
            System.out.println("El producto que mas se ha vendido fue: "+this.productos[2].getNombreP());
        }
        if(this.productos[3].getContadorP()>=this.productos[1].getContadorP() && this.productos[3].getContadorP()>=this.productos[2].getContadorP() && this.productos[3].getContadorP()>=this.productos[0].getContadorP()){
            System.out.println("El producto que mas se ha vendido fue: "+this.productos[3].getNombreP());
        }
    }
    public void menosVendido(){
        if(this.productos[0].getContadorP()<=this.productos[1].getContadorP() && this.productos[0].getContadorP()<=this.productos[2].getContadorP() && this.productos[0].getContadorP()<=this.productos[3].getContadorP()){
            System.out.println("El producto que menos se ha vendido fue: "+this.productos[0].getNombreP());
        }
        if(this.productos[1].getContadorP()<=this.productos[0].getContadorP() && this.productos[1].getContadorP()<=this.productos[2].getContadorP() && this.productos[1].getContadorP()<=this.productos[3].getContadorP()){
            System.out.println("El producto que menos se ha vendido fue: "+this.productos[1].getNombreP());
        }
        if(this.productos[2].getContadorP()<=this.productos[1].getContadorP() && this.productos[2].getContadorP()<=this.productos[0].getContadorP() && this.productos[2].getContadorP()<=this.productos[3].getContadorP()){
            System.out.println("El producto que menos se ha vendido fue: "+this.productos[2].getNombreP());
        }
        if(this.productos[3].getContadorP()<= this.productos[1].getContadorP() && this.productos[3].getContadorP()<=this.productos[2].getContadorP() && this.productos[3].getContadorP()<=this.productos[0].getContadorP()){
            System.out.println("El producto que menos se ha vendido fue: "+this.productos[3].getNombreP());
        }
    }
    public void reconteo(){
        for (int i=0; i<4; i++){
            this.productos[i].setContadorP(0);
        }
    }
    public double ganancias (){
        return (this.productos[0].precioconIva()*this.productos[0].getContadorP())+(this.productos[1].precioconIva()*this.productos[1].getContadorP())+(this.productos[2].precioconIva()*this.productos[2].getContadorP())+(this.productos[3].precioconIva()*this.productos[3].getContadorP());
    }
    public double totalVentas(){
        return this.productos[0].getContadorP()+this.productos[1].getContadorP()+this.productos[2].getContadorP()+this.productos[3].getContadorP();
    }
    public double promedioVentas(){
        return this.ganancias()/this.totalVentas();
    } 
    
    
}

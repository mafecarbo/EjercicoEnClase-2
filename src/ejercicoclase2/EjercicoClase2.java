/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicoclase2;
import java.util.*;
/**
 *
 * @author ESTUDIANTE
 */
public class EjercicoClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tienda t =new Tienda("Donde Lucho", 33);
        Producto[] p= new Producto[4];
        p[0]= new Producto("Leche", 20, 0.04, 5, "SuperMercado", 3000);
        p[1]= new Producto("Huevos", 30, 0.04, 10, "SuperMercado", 300);
        p[2]= new Producto("Advil", 40, 0.12, 15, "Drogeria", 1000);
        p[3]= new Producto("Lapiz", 30, 0.16, 10, "Papeleria", 700);
        t.setProductos(p);
        boolean flag=true;
        while(flag==true){
            System.out.println("Bienvenido a 'Donde Lucho'.\nSeleccione la opcion que desea.\n1.Conocer los productos que vende la tienda.\n2.Desea verificar el inventario de los productos de la tienda.\n3.Desea mirar las estadisticas de la tienda.\nCualquier otro numero es para salir");
            int a;
            Scanner flujoEn =new Scanner(System.in);
            a=flujoEn.nextInt();
            switch(a){
                case 1: {
                    boolean flag1=true;
                    while(flag1==true){
                        System.out.println("Los productos que vende la tienda son: \n1. "+p[0].getNombreP()+" Cuesta: "+p[0].precioconIva()+" es de Tipo: "+p[0].getTipo()+".");
                        System.out.println("2. "+p[1].getNombreP()+" Cuesta: "+p[1].precioconIva()+" es de Tipo: "+p[1].getTipo()+".\n3. "+p[2].getNombreP()+" Cuesta: "+p[2].precioconIva()+" es de Tipo: "+p[2].getTipo()+".");
                        System.out.println("4. "+p[3].getNombreP()+" Cuesta: "+p[3].precioconIva()+" es de Tipo: "+p[3].getTipo()+".\nCualquier otro numero es para salir");
                        System.out.println("Si desea comprar alguno de estos productos oprima el numero del producto.");
                        int b;
                        b=flujoEn.nextInt();
                        switch(b){
                            case 1:{
                                int c;
                                boolean flag2=true;
                                while(flag2==true){
                                    System.out.println("Cuanto de este producto: "+p[0].getNombreP()+" desea.");
                                    c=flujoEn.nextInt();
                                    if(p[0].vender(c)==true){
                                        System.out.println("Procedimiento exitoso ha comprado: "+c+" unidades de : "+p[0].getNombreP()+"."); 
                                        System.out.println("Si desea comprar algo mas de la tienda tecle true, si por otro lado desea salir tecle false");
                                        flag1= flujoEn.nextBoolean();
                                        flag2=false;
                                        
                                    }else{
                                        System.out.println("Pocedimiento no efectuado correctamente, si desea volverlo a intentar tecle true, si desea salir tecle false");
                                        flag2=flujoEn.nextBoolean();
                                        
                                    }
                                    
                                }
                                break;
                            }
                            case 2:{
                                int c;
                                boolean flag2=true;
                                while(flag2==true){
                                    System.out.println("Cuanto de este producto: "+p[1].getNombreP()+" desea.");
                                    c=flujoEn.nextInt();
                                    if(p[1].vender(c)==true){
                                        System.out.println("Procedimiento exitoso ha comprado: "+c+" unidades de : "+p[1].getNombreP()+"."); 
                                        System.out.println("Si desea comprar algo mas de la tienda tecle true, si por otro lado desea salir tecle false");
                                        flag1=flujoEn.nextBoolean();
                                        flag2=false;
                                    }else{
                                        System.out.println("Pocedimiento no efectuado correctamente, Si desea volver a intentarlo tecle true, si por otro lado desea salir tecle false");
                                        flag2=flujoEn.nextBoolean();
                                    }
                                    
                                }
                                break;
                            }
                            case 3:{
                                int c;
                                boolean flag2=true;
                                while(flag2==true){
                                    System.out.println("Cuanto de este producto: "+p[2].getNombreP()+" desea.");
                                    c=flujoEn.nextInt();
                                    if(p[2].vender(c)==true){
                                        System.out.println("Procedimiento exitoso ha comprado: "+c+" unidades de : "+p[2].getNombreP()+"."); 
                                        System.out.println("Si desea comprar algo mas de la tienda tecle true, si por otro lado desea salir tecle false");
                                        flag1=flujoEn.nextBoolean();
                                        flag2=false;
                                    }else{
                                        System.out.println("Pocedimiento no efectuado correctamente, si desea volverlo a intentar tecle true, si por otro lado desea salir tecle false");
                                        flag2=flujoEn.nextBoolean();
                                    }
                                    
                                }
                                break;
                            }
                            case 4:{
                                int c;
                                boolean flag2=true;
                                while(flag2==true){
                                    System.out.println("Cuanto de este producto: "+p[4].getNombreP()+" desea.");
                                    c=flujoEn.nextInt();
                                    if(p[3].vender(c)==true){
                                        System.out.println("Procedimiento exitoso ha comprado: "+c+" unidades de : "+p[4].getNombreP()+"."); 
                                        System.out.println("Si desea comprar algo mas de la tienda tecle true, si por otro lado desea salir tecle false");
                                        flag1=flujoEn.nextBoolean();
                                        flag2=false;
                                    }else{
                                        System.out.println("Pocedimiento no efectuado correctamente, si desea volverlo a intentar tecle true, si por otro lado desea salir tecle false");
                                        flag2=flujoEn.nextBoolean();
                                    }
                                }
                                break;
                            }
                            default :{
                                System.out.println("Numero digitado no valido intente de nuevo tecle true, si por otro lado desea salir tecle false");
                                flag1=flujoEn.nextBoolean();
                                break;
                            }
                        
                        }
                    
                    }
                    System.out.println("Si desdea consultar otra opcion en el menu original teclee true, si desea salir teclee false");
                    flag=flujoEn.nextBoolean();
                    break;
                }
                case 2:{
                    boolean flag3=true;
                    while (flag3==true){
                        System.out.println("Los productos son: \n1. "+p[0].getNombreP()+".\n2. "+p[1].getNombreP()+".\n3. "+p[2].getNombreP()+".\n4. "+p[3].getNombreP()+"\nCualquier otro numero es para salir");
                        System.out.println("Si desea comprobar el ivantario de alguno de los productos oprima el numero del producto.");
                        int d;
                        d=flujoEn.nextInt();
                        switch(d){
                            case 1:{
                                boolean flag2=true;
                                while(flag2==true){
                                    System.out.println("De este producto: "+p[0].getNombreP());
                                    p[0].pedido();
                                    System.out.println("Desea realizar un pedido de reabastecimiento de este producto: "+p[0].getNombreP());
                                    boolean s;
                                    s= flujoEn.nextBoolean();
                                    if(s==true){
                                        System.out.println("cuantas unidades de : "+p[0].getNombreP()+" va a ordenar.");
                                        int e;
                                        e=flujoEn.nextInt();
                                        p[0].pedir(e);
                                        System.out.println("Si el procedimiendo de pedir el producto fue exitoso tecle true, si por otro lado no fue exitoso tecle false");
                                        flag2=flujoEn.nextBoolean();
                                        flag2=!flag2;
                                        System.out.println("Si desea verificar otro poducto tecle true, si por otro lado desea salir tecle false");
                                        flag3=flujoEn.nextBoolean(); 
                                    }else{
                                        System.out.println("Si desea verificar otro poducto tecle true, si por otro lado desea salir tecle false");
                                        flag2=false;
                                        flag3=flujoEn.nextBoolean();
                                    }
                                    
                                }
                                break;
                            }
                            case 2:{
                                boolean flag2=true;
                                while(flag2==true){
                                    System.out.println("De este producto: "+p[1].getNombreP());
                                    p[1].pedido();
                                    System.out.println("Desea realizar un pedido de reabastecimiento de este producto: "+p[1].getNombreP());
                                    boolean s;
                                    s= flujoEn.nextBoolean();
                                    if(s==true){
                                        System.out.println("cuantas unidades de : "+p[1].getNombreP()+" va a ordenar.");
                                        int e;
                                        e=flujoEn.nextInt();
                                        p[1].pedir(e);
                                        System.out.println("Si el procedimiendo de pedir el producto fue exitoso tecle true, si por otro lado no fue exitoso tecle false");
                                        flag2=flujoEn.nextBoolean();
                                        flag2=!flag2;
                                        System.out.println("Si desea verificar otro poducto tecle true, si por otro lado desea salir tecle false");
                                        flag3=flujoEn.nextBoolean(); 
                                    }else{
                                        System.out.println("Si desea verificar otro poducto tecle true, si por otro lado desea salir tecle false");
                                        flag2=false;
                                        flag3=flujoEn.nextBoolean();
                                    }
                                    
                                }
                                break;
                            }
                            case 3:{
                                boolean flag2=true;
                                while(flag2==true){
                                    System.out.println("De este producto: "+p[2].getNombreP());
                                    p[2].pedido();
                                    System.out.println("Desea realizar un pedido de reabastecimiento de este producto: "+p[2].getNombreP());
                                    boolean s;
                                    s= flujoEn.nextBoolean();
                                    if(s==true){
                                        System.out.println("cuantas unidades de : "+p[2].getNombreP()+" va a ordenar.");
                                        int e;
                                        e=flujoEn.nextInt();
                                        p[2].pedir(e);
                                        System.out.println("Si el procedimiendo de pedri el producto fue exitoso tecle true, si por otro lado no fue exitoso tecle false");
                                        flag2=flujoEn.nextBoolean();
                                        flag2=!flag2;
                                        System.out.println("Si desea verificar otro poducto tecle true, si por otro lado desea salir tecle false");
                                        flag3=flujoEn.nextBoolean(); 
                                    }else{
                                        System.out.println("Si desea verificar otro poducto tecle true, si por otro lado desea salir tecle false");
                                        flag3=flujoEn.nextBoolean();
                                        flag2=false;
                                    }
                                    
                                }
                                break;
                            }
                            case 4:{
                                boolean flag2=true;
                                while(flag2==true){
                                    System.out.println("De este producto: "+p[3].getNombreP());
                                    p[3].pedido();
                                    System.out.println("Desea realizar un pedido de reabastecimiento de este producto: "+p[3].getNombreP());
                                    boolean s;
                                    s= flujoEn.nextBoolean();
                                    if(s==true){
                                        System.out.println("cuantas unidades de : "+p[3].getNombreP()+" va a ordenar.");
                                        int e;
                                        e=flujoEn.nextInt();
                                        p[3].pedir(e);
                                        System.out.println("Si el procedimiendo de pedri el producto fue exitoso tecle true, si por otro lado no fue exitoso tecle false");
                                        flag2=flujoEn.nextBoolean();
                                        flag2=!flag2;
                                        System.out.println("Si desea verificar otro poducto tecle true, si por otro lado desea salir tecle false");
                                        flag3=flujoEn.nextBoolean(); 
                                    }else{
                                        System.out.println("Si desea verificar otro poducto tecle true, si por otro lado desea salir tecle false");
                                        flag3=flujoEn.nextBoolean();
                                        flag2=false;
                                    }
                                    
                                }
                                break;
                            }
                            default :{
                                System.out.println("Numero digitado no valido intente de nuevo tecle true, si por otro lado desea salir tecle false");
                                flag3=flujoEn.nextBoolean(); 
                                break;
                            }
                        
                        }
                    }
                    System.out.println("Si desdea consultar otra opcion en el menu original tecle true, si por otro lado desea salir tecle false");
                    flag=flujoEn.nextBoolean();
                    break;
                }
                case 3:{
                    boolean flag4=true;
                    while(flag4==true){
                        System.out.println("Las opciones de estadisticas son: \n1.Producto mas vendido.\n2.Producto menos vendido.\n3.Ganancias de la tienda.\n4.Total de ventas\n5.Promedio de ventas.\n6. Volver a iniciar con el conteo para el siguiente mes.\nCualquier otro numero es para salir");
                        System.out.println("Si desea consultar alguna de estas opciones oprima el numero del opcion.");
                        int f;
                        f=flujoEn.nextInt();
                        switch(f){
                            case 1:{
                                t.masVendido();
                                System.out.println("Si desea verificar otra estadistica tecle true, si por otro lado desea salir tecle false");
                                flag4=flujoEn.nextBoolean();
                                break;
                            }
                            case 2:{
                                t.menosVendido();
                                System.out.println("Si desea verificar otra estadistica tecle true, si por otro lado desea salir tecle false");
                                flag4=flujoEn.nextBoolean();
                                break;
                            }
                            case 3:{
                                System.out.println("Las ganancias fueron: "+t.ganancias());
                                System.out.println("Si desea verificar otra estadistica tecle true, si por otro lado desea salir tecle false");
                                flag4=flujoEn.nextBoolean();
                                break;
                            }
                            case 4:{
                                System.out.println("El total de ventas  fue: "+t.totalVentas());
                                System.out.println("Si desea verificar otra estadistica tecle true, si por otro lado desea salir tecle false");
                                flag4=flujoEn.nextBoolean();
                                break;
                            }
                            case 5:{
                                System.out.println("El promedio de ventas fue: "+t.promedioVentas());
                                System.out.println("Si desea verificar otra estadistica tecle true, si por otro lado desea salir tecle false");
                                flag4=flujoEn.nextBoolean();
                                break;
                            }
                            case 6:{
                                t.reconteo();
                                System.out.println("Si desea verificar otra estadistica tecle true, si por otro lado desea salir tecle false");
                                flag4=flujoEn.nextBoolean();
                                break;
                            }
                            default:{
                               System.out.println("Opcion no valida; Si desea verificar otra estadistica tecle true, si por otro lado desea salir tecle false");
                               flag4=flujoEn.nextBoolean();
                               break; 
                            }
                        }
                    }
                    System.out.println("Si desdea consultar otra opcion en el menu original tecle true, si por otro lado desea salir tecle false");
                    flag=flujoEn.nextBoolean();
                    break;
                }
                default:{
                    System.out.println("Opcion no valida; Si desdea consultar otra opcion en el menu original tecle true, si por otro lado desea salir tecle false");
                    flag=flujoEn.nextBoolean();
                    break;
                }
            }
        }
    }
    
}

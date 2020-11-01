/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Global.Utileria;

/**
 *
 * @author Francisco Back
 */
public class ItemOrden {
    private static int correlativoCodigo=1;
      private int Nolinea;
    private int Cantidad;
    Producto producto;
    private int subtotal;

    int aux=1;
    
// se crea los metodo constructores
    public static int sigIdOrden(int pNolinea,int aux) {
         return aux + pNolinea;
    }

    public ItemOrden(int pNolinea) {
       ItemOrden.sigIdOrden(pNolinea,aux);
       aux=pNolinea;
        this.Nolinea = pNolinea;
    }
    public ItemOrden(int pNolinea, int pCantidad, int pldproducto) {
       this(pNolinea);
       Cantidad = pCantidad;
       pldproducto=producto.getIdProducto();
    }

    public ItemOrden() {
        this.Nolinea = correlativoCodigo++;
        this.Cantidad = Cantidad;
        this.subtotal = subtotal;
    }
    

    // se crea los  metodos get y set
    public int getNolinea() {
        return Nolinea;
    }

    public void setNolinea(int Nolinea) {
        this.Nolinea = Nolinea;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public int TotalItem(){
        return producto.getPrecio()*Cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

 
    // se crea el nmetodo toString
    @Override
    public String toString() {
        Utileria utileria=new Utileria();
        return "["+utileria.getNombreClase(this.getClass().getName())+"]" + "Nolinea=" + Nolinea + ", Cantidad=" + Cantidad + ", producto=" + producto + '}';
    }
    
    
}

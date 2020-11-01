/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Francisco Back
 */
public class Compra {
    // se definen sus atributos

    private static int correlativo = 1;
    private int IdOrden;
    Cliente cliente;
    ItemOrden item1;
    ItemOrden item2;
    private Date FechaOrden;
    private double PrecioEnvio;
    private double Total;
    private String Envio;
    private String Codigo;
    private String Descripcion;
    private String Estado;
    private int precio;
    private int cantidad;
    private int subtotal;
    private int DiasEnvio;
    
    // se crea los metodos constructores

    public Compra() {

        Total = 0.0;
        FechaOrden = new Date();

    }

    public Compra(Date pfecha) {
        this();
        FechaOrden = pfecha;

    }

  
    
    

    public Compra(int pCliente, Date Pfecha) {
        this(Pfecha);
        IdOrden = pCliente;
    }

    public Compra(int IdOrden, Date FechaOrden, double PrecioEnvio, double Total, String Envio, String Codigo, String Descripcion, String Estado, int precio, int cantidad, int subtotal, int DiasEnvio) {
        this.IdOrden = IdOrden;
        this.FechaOrden = FechaOrden;
        this.PrecioEnvio = PrecioEnvio;
        this.Total = Total;
        this.Envio = Envio;
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Estado = Estado;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.DiasEnvio = DiasEnvio;
    }

    public int getIdOrden() {
        return IdOrden;
    }

    public void setIdOrden(int IdOrden) {
        this.IdOrden = IdOrden;
    }

    public ItemOrden getItem2() {
        return item2;
    }

    public void setItem2(ItemOrden item2) {
        this.item2 = item2;
    }

    public Date getFechaOrden() {
        return FechaOrden;
    }

    public void setFechaOrden(Date FechaOrden) {
        this.FechaOrden = FechaOrden;
    }

    public double getPrecioEnvio() {
        return PrecioEnvio;
    }

    public void setPrecioEnvio(double PrecioEnvio) {
        this.PrecioEnvio = PrecioEnvio;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String getEnvio() {
        return Envio;
    }

    public void setEnvio(String Envio) {
        this.Envio = Envio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getDiasEnvio() {
        return DiasEnvio;
    }

    public void setDiasEnvio(int DiasEnvio) {
        this.DiasEnvio = DiasEnvio;
    }

 



  
  
    

    
// no se crea los metodos get y set
 



//se crea el metodo toSring
    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + IdOrden + ", cliente=" + cliente + ", item1=" + item1 + ", item2=" + item2 + ", FechaOrden=" + FechaOrden + ", PrecioEnvio=" + PrecioEnvio + ", Total=" + Total + ", Envio=" + Envio + ", Estado=" + Estado + ", DiasEnvio=" + DiasEnvio + '}';
    }

}

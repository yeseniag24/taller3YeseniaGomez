package com.yeseniagomez.dominio;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

    public final byte capacidadYG = 74;
    private String nombreSupermercadoYG;
    private List<Producto> productosYG;

    //Constructor
    public Mercado(String nombreSupermercadoYG) {
        this.nombreSupermercadoYG = nombreSupermercadoYG;
        this.productosYG = new ArrayList<>();
    }



    //Métodos

    public void informacion(){
        System.out.println("Supermercado: "+nombreSupermercadoYG);
    }


    public boolean agregar(Producto p){
        for(Producto producto : productosYG){
            if (producto.getCodigoYG() == p.getCodigoYG()){
                return false;
            }
        }

        if (productosYG.size() >= capacidadYG){
            return false;
        }

        productosYG.add(p);
        return true;
    }


    public boolean retirar(String nombre){
        for (Producto producto: productosYG){
            if (producto.getNombreYG().equals(nombre)){
                productosYG.remove(producto);
                return true;
            }
        }
        return false;
    }


    public Producto buscarNombre(String nombre){
        for (Producto producto: productosYG){
            if (producto.getNombreYG().equals(nombre)){
                return producto;
            }
        }
        return null;
    }

    public Producto buscarCodigo(int codigo){
        for (Producto producto: productosYG){
            if (producto.getCodigoYG() == codigo){
                return producto;
            }
        }
        return null;
    }

    public List<Producto> buscarTipo(String tipo){
        List<Producto> productosPorTipo = new ArrayList<>();
        for (Producto producto: productosYG){
            if (producto.getTipoYG().equals(tipo)){
                productosPorTipo.add(producto);
            }
        }
        return productosPorTipo;
    }


    public int calcularTotal(){
        int total = 0;
        for (Producto producto: productosYG){
            total += producto.getPrecioYG();
        }
        return total;
    }

    public byte getCapacidadYG() {
        return capacidadYG;
    }

    public String getNombreSupermercadoYG() {
        return nombreSupermercadoYG;
    }

    public List<Producto> getProductosYG() {
        return productosYG;
    }

    public void setProductosYG(List<Producto> productosYG) {
        this.productosYG = productosYG;
    }
}

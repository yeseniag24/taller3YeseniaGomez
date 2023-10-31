package com.yeseniagomez.aplicacion;

import com.yeseniagomez.dominio.Mercado;
import com.yeseniagomez.dominio.Producto;
import com.yeseniagomez.dominio.TipoProducto;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Mercado mercado1 = new Mercado("Super Tienda");

        Producto producto1 = new Producto(1,"Churrasco",8,12000,TipoProducto.CARNE);
        Producto producto2 = new Producto(2,"Tomate",13,800,TipoProducto.VERDURA);
        Producto producto3 = new Producto(3,"Queso",8,4300,TipoProducto.LACTEO);
        Producto producto4 = new Producto(4,"Pera",12,2600,TipoProducto.FRUTA);
        Producto producto5 = new Producto(5,"Pan agridulce",7,2000,TipoProducto.PAN);
        Producto producto6 = new Producto(6,"Detergente",8,13000,TipoProducto.LIMPIEZA);
        Producto producto7 = new Producto(7,"Pechuga",2,10200,TipoProducto.POLLO);
        Producto producto8 = new Producto(8,"Shampoo",10,15000,TipoProducto.ASEO);


        mercado1.informacion();

        boolean agregar1 = mercado1.agregar(producto1);
        if (agregar1){
            System.out.println("\n"+producto1.getNombreYG()+" `Producto agregado con exito");
        }else {
            System.out.println("\nNo se agrego " +producto1.getNombreYG());
        }

        boolean agregar2 = mercado1.agregar(producto2);
        if (agregar2){
            System.out.println("\n"+producto2.getNombreYG()+" Producto agregado con exito");
        }else {
            System.out.println("\nNo se agrego " +producto2.getNombreYG());
        }

        boolean agregar3 = mercado1.agregar(producto3);
        if (agregar3){
            System.out.println("\n"+producto3.getNombreYG()+" Producto agregado con exito");
        }else {
            System.out.println("\nNo se agrego " +producto3.getNombreYG());
        }

        boolean agregar4 = mercado1.agregar(producto4);
        if (agregar4){
            System.out.println("\n"+producto4.getNombreYG()+" Producto agregado con exito");
        }else {
            System.out.println("\nNo se agrego " +producto4.getNombreYG());
        }

        boolean agregar5 = mercado1.agregar(producto5);
        if (agregar5){
            System.out.println("\n"+producto5.getNombreYG()+" Producto agregado con exito");
        }else {
            System.out.println("\nNo se agrego " +producto5.getNombreYG());
        }

        boolean agregar6 = mercado1.agregar(producto6);
        if (agregar6){
            System.out.println("\n"+producto6.getNombreYG()+" Producto agregado con exito");
        }else {
            System.out.println("\nNo se agrego " +producto6.getNombreYG());
        }

        boolean agregar7 = mercado1.agregar(producto7);
        if (agregar7){
            System.out.println("\n"+producto7.getNombreYG()+" Producto agregado con exito");
        }else {
            System.out.println("\nNo se agrego " +producto7.getNombreYG());
        }

        boolean agregar8 = mercado1.agregar(producto8);
        if (agregar8){
            System.out.println("\n"+producto8.getNombreYG()+" Producto agregado con exito");
        }else {
            System.out.println("\nNo se agrego " +producto8.getNombreYG());
        }



        boolean retirado = mercado1.retirar("Detergente");
        if (retirado){
            System.out.println("\n"+producto6.getNombreYG()+ " fue retirado exitosamente");
        }else {
            System.out.println("\nNo se pudo retirar el producto 2 o no existia en el Mercado");
        }


        Producto productoPorNombre = mercado1.buscarNombre("Shampoo");
        if (productoPorNombre != null){
            System.out.println("\nProducto encontrado: "+productoPorNombre.getNombreYG());
        }else {
            System.out.println("\nProducto no encontrado");
        }


        Producto productoPorCodigo = mercado1.buscarCodigo(7);
        if (productoPorCodigo != null){
            System.out.println("\nProducto encontrado: "+productoPorCodigo.getNombreYG());
        }else {
            System.out.println("\nProducto no encontrado");
        }

        List<Producto> productosPorTipo = mercado1.buscarTipo(TipoProducto.ASEO);
        if (!productosPorTipo.isEmpty()) {
            System.out.println("\nProductos de tipo ASEO encontrados: ");
            for (Producto producto : productosPorTipo) {
                System.out.println(producto.getNombreYG());
            }
        } else {
            System.out.println("\nNo se encontraron productos de tipo LACTEO");
        }

        int total = mercado1.calcularTotal();
        System.out.println("\nEl total del inventario es de: "+total);

    }
}
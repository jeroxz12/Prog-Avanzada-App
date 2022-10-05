package negocios;

import domain.Producto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaDeProductos {

    ArrayList<Producto> inventario = new ArrayList<Producto>();

    public boolean addProducto(Producto producto) {
        if (producto.getIdProducto() > 0) {

            char[] arrLetras = producto.getNombreDeProducto().toCharArray();
            if (arrLetras.length > 1 && arrLetras.length < 60) {
                arrLetras = producto.getNivelDeToxi().toCharArray();
                if (arrLetras.length > 0 && arrLetras.length <= 4) {
                    arrLetras = producto.getDetalle().toCharArray();
                    if (arrLetras.length > 5 && arrLetras.length < 200) {
                        if (producto.getPrecio() > 0) {
                            inventario.add(producto);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean borrarProducto(Integer idProducto) {
        if (idProducto > 0) {
            for (Producto p : this.inventario) {
                if (p.getIdProducto() == idProducto) {
                    inventario.remove(p);
                    return true;
                }
            }

        }
        return false;
    }
    public Producto buscarProducto(Integer idProducto){
        for (Producto p : this.inventario) {
            if (p.getIdProducto() == idProducto) {
                return p;
            }
        }
        return null;
    }

    public boolean editarProducto(Integer idProducto){
        for (Producto p : this.inventario) {
            if (p.getIdProducto() == idProducto) {

                return true;
            }
        }
        return false;
    }

    public void listarProductos () {
        for (Producto p : this.inventario) {
            System.out.println(p);
        }
    }
}


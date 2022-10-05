package IU;

import domain.Producto;
import negocios.ListaDeProductos;
import negocios.ListaDeUsuarios;

import javax.swing.*;

public class Interfaz {

    static ListaDeProductos inventario = new ListaDeProductos();

    public Interfaz() {
        imprimirMenu();
    }

    public void imprimirMenu () {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("A T E N C I O N \nPara acceder a la opcion ingrese el numero que corresponda " +
                "\n ➕   1 - Ingresar Producto \n \uD83D\uDC40️   2 - Consultar Inventario \n \uD83D\uDD0E   3 - Buscar Producto \n \uD83D\uDD1A   4- Salir" ));


        switch (opcion) {
            case 1:
                ingresarProducto();
                break;
            case 2:
                listarProductos();
                break;
            default:
                System.out.println("Se eligio una opci�n incorrecta volver a intentar");
                break;
        }
    }


    private void ingresarProducto() {
        int idProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo serial del producto"));
        String nombre = JOptionPane.showInputDialog("Ingrese Nombre del producto");
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio del producto"));
        String detalle = JOptionPane.showInputDialog("Ingrese detalle del producto");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de unidades"));
        String nivelDeToxicidad = JOptionPane.showInputDialog("Ingrese nivel de toxicidad // alto - bajo");

        Producto p = new Producto(idProducto, nombre, precio, detalle, cantidad, nivelDeToxicidad);

        if (inventario.addProducto(p)) {
            JOptionPane.showMessageDialog(null,"El producto se agrego correctamente al inventario");

        }else {
            JOptionPane.showMessageDialog(null,"error al agregar producto al inventario , revisa los datos ingresados");

        }
        imprimirMenu();

    }
    public void listarProductos () {
        inventario.listarProductos();
    }

}


package domain;

import java.util.Date;
import java.util.List;

public class Ticket {

    private Integer id;
    private List<Producto> listaProductos;
    private Date fecha;

    public Ticket() {
    }

    public Ticket(Integer id, List<Producto> listaProductos, Date fecha) {
        this.id = id;
        this.listaProductos = listaProductos;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", listaProductos=" + listaProductos +
                ", fecha=" + fecha +
                '}';
    }
}

package domain;

import java.util.List;

public class Deposito {

    private Integer id;
    private List<Producto> inventario;

    public Deposito() {
    }

    public Deposito(Integer id, List<Producto> inventario) {
        this.id = id;
        this.inventario = inventario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(List<Producto> inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "id=" + id +
                ", inventario=" + inventario +
                '}';
    }
}

package domain;

public abstract class Usuario {

    private Integer id;
    private String nombreDeUsuario;
    private String password;
    private Integer nivelPermisos;


    public Usuario() {
    }

    public Usuario(Integer id, String nombreDeUsuario, String password, Integer nivelPermisos) {
        this.id = id;
        this.nombreDeUsuario = nombreDeUsuario;
        this.password = password;
        this.nivelPermisos = nivelPermisos;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getNivelPermisos() {
        return nivelPermisos;
    }

    public void setNivelPermisos(Integer nivelPermisos) {
        this.nivelPermisos = nivelPermisos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombreDeUsuario='" + nombreDeUsuario + '\'' +
                ", password='" + password + '\'' +
                ", nivelPermisos=" + nivelPermisos +
                '}';
    }
}

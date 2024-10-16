package Modelo;

public class Usuario implements ClonableProcedure{
    private String idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private String tipoUsuario;

    public Usuario() {
    }

    public Usuario(String idUsuario, String nombre, String apellido, String email, String telefono, String direccion, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public Usuario setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Usuario setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Usuario setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Usuario setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Usuario setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public Usuario setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    @Override
    public ClonableProcedure clonar() {
        return new Usuario(idUsuario,nombre,apellido,email,telefono,direccion,tipoUsuario);
    }
}

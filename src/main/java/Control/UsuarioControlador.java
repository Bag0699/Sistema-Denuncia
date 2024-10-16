package Control;

import Modelo.ProcedurePrototype;
import Modelo.Usuario;

import java.sql.SQLException;

public class UsuarioControlador implements ControladorBase{
    private final ProcedurePrototype procedurePrototype;

    public UsuarioControlador() {
        procedurePrototype = new ProcedurePrototype();
    }

    public void crearUsuario(Usuario usuario) throws  SQLException {
        procedurePrototype.crearUsuario(usuario);
    }
    public Usuario leerUsuario(String idUsuario) throws SQLException {
        return procedurePrototype.leerUsuario(idUsuario);
    }

    public void actualizarUsuario(Usuario usuario) throws SQLException {
        procedurePrototype.actualizarUsuario(usuario);
    }

    public void eliminarUsuario(String idUsuario) throws SQLException {
        procedurePrototype.eliminarUsuario(idUsuario);
    }

    @Override
    public void ejecutarControlador() {
        System.out.println("Ejecutando el controlador de Usuario!!");
    }

}

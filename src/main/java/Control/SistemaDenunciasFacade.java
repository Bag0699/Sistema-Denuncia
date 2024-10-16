package Control;

import Decorator.Notificacion;
import Decorator.NotificacionConLog;
import Decorator.NotificacionEmail;
import Modelo.Denuncia;
import Modelo.Usuario;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class SistemaDenunciasFacade {
    ControladorFactory controladorFactory = new ControladorFactory();

    public List<Denuncia> obtenerDenunciaFec(Date fecha) throws SQLException {
        DenunciaControlador denunciaControlador = (DenunciaControlador) controladorFactory
                .obtenerControlador("denuncia");
        return denunciaControlador.getDenuncia(fecha);
    }
    public void crearDenuncia(Denuncia denuncia) throws SQLException {
        DenunciaControlador denunciaControlador = (DenunciaControlador) controladorFactory
                .obtenerControlador("denuncia");
        denunciaControlador.crearDenuncia(denuncia);

        Notificacion notificacion = new NotificacionEmail();
        Notificacion notificacionConLog = new NotificacionConLog(notificacion);
        notificacionConLog.enviar("prueba01@email.com");
    }

    public Denuncia leerDenuncia(String idDenuncia) throws  SQLException {
        DenunciaControlador denunciaControlador = (DenunciaControlador) controladorFactory
                .obtenerControlador("denuncia");
        return denunciaControlador.leerDenuncia(idDenuncia);
    }

    public void actualizarDenuncia(Denuncia denuncia) throws SQLException {
        DenunciaControlador denunciaControlador = (DenunciaControlador) controladorFactory
                .obtenerControlador("denuncia");
        denunciaControlador.actualizarDenuncia(denuncia);
    }

    public void eliminarDenuncia(String idDenuncia) throws SQLException {
        DenunciaControlador denunciaControlador = (DenunciaControlador) controladorFactory
                .obtenerControlador("denuncia");
        denunciaControlador.eliminarDenuncia(idDenuncia);
    }



    public void crearUsuario(Usuario usuario) throws SQLException {
        UsuarioControlador usuarioControlador = (UsuarioControlador) controladorFactory
                .obtenerControlador("usuario");
        usuarioControlador.crearUsuario(usuario);
    }

    public Usuario leerUsuario(String idUsuario) throws SQLException {
        UsuarioControlador usuarioControlador = (UsuarioControlador) controladorFactory
                .obtenerControlador("usuario");
        return usuarioControlador.leerUsuario(idUsuario);
    }

    public void actualizarUsuario(Usuario usuario) throws SQLException {
        UsuarioControlador usuarioControlador = (UsuarioControlador) controladorFactory
                .obtenerControlador("usuario");
        usuarioControlador.actualizarUsuario(usuario);
    }

    public void eliminarUsuario(String idUsuario) throws SQLException {
        UsuarioControlador usuarioControlador = (UsuarioControlador) controladorFactory
                .obtenerControlador("usuario");
        usuarioControlador.eliminarUsuario(idUsuario);
    }

}

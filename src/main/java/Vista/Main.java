package Vista;


import Control.SistemaDenunciasFacade;
import Decorator.Notificacion;
import Decorator.NotificacionConLog;
import Decorator.NotificacionEmail;
import Modelo.*;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        SistemaDenunciasFacade sistemaDenunciasFacade = new SistemaDenunciasFacade();


//        //Leer Denuncias por Fecha
//        Date fecha = Date.valueOf("2024-09-20");
//        List<Denuncia> denuncias = sistemaDenunciasFacade.obtenerDenunciaFec(fecha);
//
//        if (denuncias.isEmpty()) {
//            System.out.println("No se encontraron denuncias para la fecha: " + fecha);
//        } else {
//            System.out.println("Denuncias encontradas:");
//            for (Denuncia d : denuncias) {
//                System.out.println("Denuncia ID: " + d.getIdDenuncia());
//                System.out.println("Usuario ID: " + d.getId_usuario());
//                System.out.println("Agresor ID: " + d.getId_agresor());
//                System.out.println("Descripción: " + d.getDesc());
//                System.out.println("Estado: " + d.getEstado());
//                System.out.println("Tipo de Violencia: " + d.getTipo());
//                System.out.println("Relación con el denunciante: " + d.getRelDenc());
//                System.out.println("Fecha: " + d.getFec());
//                System.out.println("----------");
//            }
//        }
//
//
//        //Leer Denuncias - CRUD
//        String idDenuncia = "DN001";
//        Denuncia denuncia = sistemaDenunciasFacade.leerDenuncia(idDenuncia);
//        if (denuncia != null) {
//            System.out.println("Detalles de la Denuncia ID: " + denuncia.getIdDenuncia());
//            System.out.println("Usuario ID: " + denuncia.getId_usuario());
//            System.out.println("Agresor ID: " + denuncia.getId_agresor());
//            System.out.println("Descripción: " + denuncia.getDesc());
//            System.out.println("Estado: " + denuncia.getEstado());
//            System.out.println("Tipo de Violencia: " + denuncia.getTipo());
//            System.out.println("Relación con el denunciante: " + denuncia.getRelDenc());
//            System.out.println("Fecha: " + denuncia.getFec());
//        } else {
//            System.out.println("No se encontró la denuncia con ID: " + idDenuncia);
//        }

        //Crear Denuncia - CRUD
        Denuncia nuevaDenuncia = new Denuncia("DN003"
                , "AD003"
                , "AG002"
                , "Denuncia por acoso"
                , "Pendiente"
                , "Psicológica"
                , "Relación amical"
                , "2024-09-22");
        sistemaDenunciasFacade.crearDenuncia(nuevaDenuncia);


//        //Actualizar Denuncia - CRUD
//        sistemaDenunciasFacade.actualizarDenuncia(nuevaDenuncia);
//
//        //Eliminar Denuncia - CRUD
//        String idDenunciaEliminar = "DN003";
//        sistemaDenunciasFacade.eliminarDenuncia(idDenunciaEliminar);


//        //Crear Usuario - CRUD
//        Usuario nuevoUsuario = new Usuario("AD005"
//                , "Admin2"
//                , "Admin2"
//                , "admin2.admin2@email.com"
//                , "922486789"
//                , "Calle Verdadera 679"
//                , "Administrador");
//        sistemaDenunciasFacade.crearUsuario(nuevoUsuario);
//
//        //Leer Usuario - CRUD
//        String idUsuario = "AD004";
//        Usuario usuario = sistemaDenunciasFacade.leerUsuario(idUsuario);
//        if (usuario != null) {
//            System.out.println("\nDetalles del Usuario con ID: " + usuario.getIdUsuario());
//            System.out.println("Nombre: " + usuario.getNombre());
//            System.out.println("Apellido: " + usuario.getApellido());
//            System.out.println("Email: " + usuario.getEmail());
//            System.out.println("Teléfono: " + usuario.getTelefono());
//            System.out.println("Dirección: " + usuario.getDireccion());
//            System.out.println("Tipo de Usuario: " + usuario.getTipoUsuario());
//        } else {
//            System.out.println("No se encontró al usuario con ID: " + idUsuario);
//        }
//
//        //Actualizar Usuario - CRUD
//        Usuario actualizarUsuario =
//                new Usuario("AD004"
//                        , "Admin"
//                        , "Admin"
//                        , "admin.admin@email.com"
//                        , "923456789"
//                        , "Calle Verdadera 789"
//                        , "Administrador");
//        sistemaDenunciasFacade.actualizarUsuario(actualizarUsuario);
//
//        //Eliminar Usuario - CRUD
//        String idUsuarioEliminar = "AD005";
//        sistemaDenunciasFacade.eliminarUsuario(idUsuarioEliminar);
   }
}

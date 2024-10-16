
package Control;

import Modelo.*;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class DenunciaControlador  implements ControladorBase{
    private final ProcedurePrototype proceProto;

    public DenunciaControlador() {
        proceProto = new ProcedurePrototype();
    }

    public List<Denuncia> getDenuncia(Date fecha) throws SQLException {
        return proceProto.getDncFecha(fecha);
    }

    public void crearDenuncia(Denuncia denuncia) throws SQLException {
        proceProto.crearDenuncia(denuncia);
    }

    public Denuncia leerDenuncia(String idDenuncia) throws SQLException {
        return proceProto.leerDenuncia(idDenuncia);
    }

    public void actualizarDenuncia(Denuncia denuncia) throws SQLException{
        proceProto.actualizarDenuncia(denuncia);
    }

    public void eliminarDenuncia(String idDenuncia) throws SQLException {
        proceProto.eliminarDenuncia(idDenuncia);
    }


    @Override
    public void ejecutarControlador() {
        System.out.println("Ejecutado el controlador de Denuncias");
    }
}

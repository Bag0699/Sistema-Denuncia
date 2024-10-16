
package Control;

public class ControladorFactory {
    public ControladorBase obtenerControlador(String tipoControlador){
        if(tipoControlador.equalsIgnoreCase("denuncia")){
            return new DenunciaControlador();
        } else if (tipoControlador.equalsIgnoreCase("usuario")) {
            return new UsuarioControlador();
        }
        throw new IllegalArgumentException("Controlador no reconocido: "+ tipoControlador);
        
    }
}

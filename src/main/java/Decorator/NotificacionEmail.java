package Decorator;

public class NotificacionEmail implements Notificacion{

    @Override
    public void enviar(String email) {
        System.out.println("Registrando notificación al email " + email);
    }

}

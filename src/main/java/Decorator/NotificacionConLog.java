package Decorator;

public class NotificacionConLog extends NotifiacionDecorator{

    public NotificacionConLog(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String email) {
        super.enviar(email);
        System.out.println("Enviando notificación al email "+email);
    }

}

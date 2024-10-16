package Decorator;

public abstract class NotifiacionDecorator implements Notificacion{
    protected Notificacion notificacion;


    public NotifiacionDecorator(Notificacion notificacion){
        this.notificacion = notificacion;
    }

    @Override
    public void enviar(String email) {
        notificacion.enviar(email);
    }
}

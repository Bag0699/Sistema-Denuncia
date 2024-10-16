package Modelo;

public class Denuncia implements ClonableProcedure {

    private String idDenuncia;
    private String id_usuario;
    private String id_agresor;
    private String desc;
    private String estado;
    private String tipo;
    private String relDenc;
    private String fec;

    //DISEÑO DE PATRON BUILDER...
    public Denuncia() {
    }

    public Denuncia(String idDenuncia, String id_usuario, String id_agresor, String desc, String estado, String tipo, String relDenc, String fec) {
        this.idDenuncia = idDenuncia;
        this.id_usuario = id_usuario;
        this.id_agresor = id_agresor;
        this.desc = desc;
        this.estado = estado;
        this.tipo = tipo;
        this.relDenc = relDenc;
        this.fec = fec;
    }

  

    public String getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(String idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRelDenc() {
        return relDenc;
    }

    public void setRelDenc(String relDenc) {
        this.relDenc = relDenc;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getId_agresor() {
        return id_agresor;
    }

    public void setId_agresor(String id_agresor) {
        this.id_agresor = id_agresor;
    }

    @Override
    public ClonableProcedure clonar() {
        return new Denuncia(idDenuncia, id_usuario, id_agresor, desc, estado, tipo, relDenc, fec);
    }

}

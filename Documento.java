public class Documento {
    private String arquivo;
    private String usuario;
    private Object horario;

    public Documento(String arquivo) {
        this.arquivo = arquivo;
    }

    public Documento(String arquivo, String usuario) {
        this.arquivo = arquivo;
        this.usuario = usuario;
    }

    public Documento(String arquivo, String usuario, Object horario) {
        this.arquivo = arquivo;
        this.usuario = usuario;
        this.horario = horario;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Object getHorario() {
        return horario;
    }

    public void setHorario(Object horario) {
        this.horario = horario;
    }
}

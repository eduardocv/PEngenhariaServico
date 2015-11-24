package entity;

public class Remetente {

    private int idRemetente;
    private String nome;
    private String tipo;
    private String email;
    private String telefone;
    private boolean status;
    private String outrasInfo;

    @Override
    public String toString() {
        return tipo + " " + nome;
    }

    public String getOutrasInfo() {
        return outrasInfo;
    }

    public void setOutrasInfo(String outrasInfo) {
        this.outrasInfo = outrasInfo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getIdRemetente() {
        return idRemetente;
    }

    public void setIdRemetente(int idRemetente) {
        this.idRemetente = idRemetente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}

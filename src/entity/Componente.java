package entity;

/**
 *
 * @author Ruivinho
 */
public class Componente {

    private int idComponente;
    private String codComponente;
    private String componente;
    private String status;

    @Override
    public String toString() {
        return codComponente + "  " + componente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    public String getCodComponente() {
        return codComponente;
    }

    public void setCodComponente(String codComponente) {
        this.codComponente = codComponente;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

}

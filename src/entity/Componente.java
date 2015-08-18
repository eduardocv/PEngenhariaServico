
package entity;

/**
 *
 * @author Ruivinho
 */
public class Componente {

    private int idComponente;
    private String codComponente;
    private String componente;

    @Override
    public String toString() {
        return "Código: "  + codComponente + "  // Descrição: " + componente;
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

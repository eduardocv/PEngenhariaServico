

package entity;

/**
 *
 * @author eduardo.vieira
 */
public class DefeitoApresentado {
    private int idDefeitoApresentado;
    private String defeitoApresentado;

    @Override
    public String toString() {
        return  defeitoApresentado;
    }
        
    public int getIdDefeitoApresentado() {
        return idDefeitoApresentado;
    }

    public void setIdDefeitoApresentado(int idDefeitoApresentado) {
        this.idDefeitoApresentado = idDefeitoApresentado;
    }

    public String getDefeitoApresentado() {
        return defeitoApresentado;
    }

    public void setDefeitoApresentado(String defeitoApresentado) {
        this.defeitoApresentado = defeitoApresentado;
    }
    
    
}

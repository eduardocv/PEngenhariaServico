
package entity;

import java.util.List;
/**
 *
 * @author eduardo.vieira
 */
public class ManutLaboratorio {

    private int idManutLaboratorio;
    private String remetente;
    private String produto;
    private String defRelatado;
    private String defApresentado;
    private String data;
    private String numSerie;
    private String chamadoOat;
    private boolean corrigidoEmCampo;
    private String descAtividades;
    private List<Componente> componentes;
    private String tempoReparo;

    public int getIdManutLaboratorio() {
        return idManutLaboratorio;
    }

    public void setIdManutLaboratorio(int idManutLaboratorio) {
        this.idManutLaboratorio = idManutLaboratorio;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDefRelatado() {
        return defRelatado;
    }

    public void setDefRelatado(String defRelatado) {
        this.defRelatado = defRelatado;
    }

    public String getDefApresentado() {
        return defApresentado;
    }

    public void setDefApresentado(String defApresentado) {
        this.defApresentado = defApresentado;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getChamadoOat() {
        return chamadoOat;
    }

    public void setChamadoOat(String chamadoOat) {
        this.chamadoOat = chamadoOat;
    }

    public boolean isCorrigidoEmCampo() {
        return corrigidoEmCampo;
    }

    public void setCorrigidoEmCampo(boolean corrigidoEmCampo) {
        this.corrigidoEmCampo = corrigidoEmCampo;
    }

    public String getDescAtividades() {
        return descAtividades;
    }

    public void setDescAtividades(String descAtividades) {
        this.descAtividades = descAtividades;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

    public String getTempoReparo() {
        return tempoReparo;
    }

    public void setTempoReparo(String tempoReparo) {
        this.tempoReparo = tempoReparo;
    }

   

}

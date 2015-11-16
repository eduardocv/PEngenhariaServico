
package entity;

/**
 *
 * @author Eduardo C. Vieira
 */
public class Produto {

    private int idProduto;
    private String codProduto;
    private String produto;
    private boolean status;

    @Override
    public String toString() {
        return codProduto + " " + produto;
    }
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    
}

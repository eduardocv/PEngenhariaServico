
package entity;

/**
 *
 * @author eduardo.vieira
 */
public class Produto {

    private int idProduto;
    private String codProduto;
    private String produto;

    @Override
    public String toString() {
        return "Código: "  + codProduto + "  // Descrição: " + produto;
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

package dao;

import entity.Produto;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO extends MySQL {

    public boolean insert(Produto produto) {
        Connection c = this.getConnection();

        try {
            PreparedStatement ps = c.prepareStatement("insert into Produto ( codProduto, produto) "
                    + "values( ? , ? )");

            ps.setString(1, produto.getCodProduto());
            ps.setString(2, produto.getProduto());

            ps.execute();
            ps.close();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public boolean update(Produto produto) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("UPDATE Produto "
                    + "SET codProduto = ?, produto = ? WHERE idProduto = ?");
            ps.setString(1, produto.getCodProduto());
            ps.setString(2, produto.getProduto());
            ps.setInt(3, produto.getIdProduto());
            ps.execute();

            ps.close();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public boolean delete(int idProduto) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps
                    = c.prepareStatement("DELETE FROM Produto "
                            + "WHERE idProduto = ?");
            ps.setInt(1, idProduto);

            ps.execute();

            ps.close();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public java.util.List<Produto> listarProdutos() {
        Connection c = this.getConnection();
        java.util.List<Produto> listaProdutos = new ArrayList<Produto>();
        try {
            PreparedStatement ps = c.prepareStatement(" select idProduto, codProduto, produto from Produto");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Produto produto = new Produto();

                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setCodProduto(rs.getString("codProduto"));
                produto.setProduto(rs.getString("Produto"));

                listaProdutos.add(produto);
            }
            rs.close();
            ps.close();
            return listaProdutos;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    public java.util.List<Produto> buscarPorCod(String busca) {
        Connection c = this.getConnection();
        java.util.List<Produto> listaProdutos = new ArrayList<Produto>();

        try {
            PreparedStatement ps = c.prepareStatement(" select idProduto, codProduto, produto from Produto where codProduto like ?");

            ps.setString(1, "%" + busca + "%");
            ps.execute();

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Produto produto = new Produto();

                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setCodProduto(rs.getString("codProduto"));
                produto.setProduto(rs.getString("produto"));

                listaProdutos.add(produto);
            }
            rs.close();
            ps.close();
            return listaProdutos;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    public java.util.List<Produto> buscarPorDesc(String busca) {
        Connection c = this.getConnection();
        java.util.List<Produto> listaProdutos = new ArrayList<Produto>();

        try {
            PreparedStatement ps = c.prepareStatement(" select idProduto, codProduto, produto from Produto where produto like ?");

            ps.setString(1, "%" + busca + "%");
            ps.execute();

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Produto produto = new Produto();

                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setCodProduto(rs.getString("codProduto"));
                produto.setProduto(rs.getString("produto"));

                listaProdutos.add(produto);
            }
            rs.close();
            ps.close();
            return listaProdutos;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
}

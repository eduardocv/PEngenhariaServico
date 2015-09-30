
package dao;

import entity.Componente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ruivinho
 */
public class ComponenteDAO extends MySQL {
    public boolean insert(Componente componente) {
        Connection c = this.getConnection();

        try {
            PreparedStatement ps = c.prepareStatement("insert into Componente ( codComponente, componente, status) "
                    + "values( ? , ? , ? )");
            
            ps.setString(1, componente.getCodComponente());
            ps.setString(2, componente.getComponente());
            ps.setString(3, componente.getStatus());

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

   

    public boolean update(Componente componente) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("UPDATE Componente "
                    + "SET codComponente = ?, componente = ?, status = ? WHERE idComponente = ?");
            ps.setString(1, componente.getCodComponente());
            ps.setString(2, componente.getComponente());
            ps.setString(3, componente.getStatus());
            ps.setInt(4, componente.getIdComponente());
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

    public boolean delete(int idComponente) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps
                    = c.prepareStatement("DELETE FROM Componente "
                            + "WHERE idProduto = ?");
            ps.setInt(1, idComponente);

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
    public java.util.List<Componente> listarComponentes() {
        Connection c = this.getConnection();
        java.util.List<Componente> listaComponentes = new ArrayList<Componente>();
        try {
            PreparedStatement ps = c.prepareStatement(" select idComponente, codComponente, componente, status from Componente");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Componente componente = new Componente();

                componente.setIdComponente(rs.getInt("idComponente"));
                componente.setCodComponente(rs.getString("codComponente"));
                componente.setComponente(rs.getString("componente"));
                componente.setStatus(rs.getString("status"));
                
                listaComponentes.add(componente);
            }
            rs.close();
            ps.close();
            return listaComponentes;

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
    
    public Componente getComponenteById (int id) {
        Connection c = this.getConnection();
        Componente componente = null;
        try{
            PreparedStatement ps = c.prepareStatement("SELECT idComponente, codComponente, componente, status from Componente WHERE idComponente = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                componente = new Componente();
                componente.setIdComponente(rs.getInt("idComponente"));
                componente.setCodComponente(rs.getString("codComponente"));
                componente.setComponente(rs.getString("componente"));
                componente.setStatus(rs.getString("status"));
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return componente;
    }
        public java.util.List<Componente> buscarPorCod(String busca) {
        Connection c = this.getConnection();
        java.util.List<Componente> listaComponentes = new ArrayList<Componente>();

        try {
            PreparedStatement ps = c.prepareStatement(" select idComponente, codComponente, componente, status from Componente where codComponente like ?");

            ps.setString(1, "%" + busca + "%");
            ps.execute();

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Componente componente = new Componente();

                componente.setIdComponente(rs.getInt("idComponente"));
                componente.setCodComponente(rs.getString("codComponente"));
                componente.setComponente(rs.getString("componente"));
                 componente.setStatus(rs.getString("status"));
                
                
                listaComponentes.add(componente);
            }
            rs.close();
            ps.close();
            return listaComponentes;

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

 public java.util.List<Componente> buscarPorDesc(String busca) {
        Connection c = this.getConnection();
        java.util.List<Componente> listaComponentes = new ArrayList<Componente>();

        try {
            PreparedStatement ps = c.prepareStatement(" select idComponente, codComponente, componente, status from Componente where componente like ?");

            ps.setString(1, "%" + busca + "%");
            ps.execute();

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Componente componente = new Componente();

                componente.setIdComponente(rs.getInt("idComponente"));
                componente.setCodComponente(rs.getString("codComponente"));
                componente.setComponente(rs.getString("componente"));
                componente.setStatus(rs.getString("status"));
                
                listaComponentes.add(componente);
            }
            rs.close();
            ps.close();
            return listaComponentes;

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

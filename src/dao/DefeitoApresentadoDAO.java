
package dao;

import entity.DefeitoApresentado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ruivinho
 */
public class DefeitoApresentadoDAO extends MySQL{
    
    public boolean insert(DefeitoApresentado defeitoApresentado) {
        Connection c = this.getConnection();

        try {
            PreparedStatement ps = c.prepareStatement("insert into DefeitoApresentado ( defeitoApresentado ) "
                    + "values( ? )");

            ps.setString(1, defeitoApresentado.getDefeitoApresentado());
           

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

    public boolean update(DefeitoApresentado defeitoApresentado) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("UPDATE DefeitoApresentado "
                    + "SET defeitoApresentado = ? WHERE idDefeitoApresentado = ?");
            ps.setString(1, defeitoApresentado.getDefeitoApresentado());
            ps.setInt(2, defeitoApresentado.getIdDefeitoApresentado());
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

    public boolean delete(int idDefeitoApresentado) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps
                    = c.prepareStatement("DELETE FROM DefeitoApresentado "
                            + "WHERE idDefeitoApresentado = ?");
            ps.setInt(1, idDefeitoApresentado);

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
    
    public java.util.List<DefeitoApresentado> listarDefeitoApresentados() {
        Connection c = this.getConnection();
        java.util.List<DefeitoApresentado> listaDefeitoApresentados = new ArrayList<DefeitoApresentado>();
        try {
            PreparedStatement ps = c.prepareStatement(" select idDefeitoApresentado, defeitoApresentado from DefeitoApresentado");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                DefeitoApresentado defeitoApresentado = new DefeitoApresentado();

                defeitoApresentado.setIdDefeitoApresentado(rs.getInt("idDefeitoApresentado"));
                defeitoApresentado.setDefeitoApresentado(rs.getString("defeitoApresentado"));
               

                listaDefeitoApresentados.add(defeitoApresentado);
            }
            rs.close();
            ps.close();
            return listaDefeitoApresentados;

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

    public java.util.List<DefeitoApresentado> buscarPorDefeito(String busca) {
        Connection c = this.getConnection();
        java.util.List<DefeitoApresentado> listaDefeitoApresentados = new ArrayList<DefeitoApresentado>();

        try {
            PreparedStatement ps = c.prepareStatement(" select idDefeitoApresentado, defeitoApresentado "
                    + "from DefeitoApresentado where defeitoApresentado like ?");

            ps.setString(1, "%" + busca + "%");
            ps.execute();

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                DefeitoApresentado defeitoApresentado = new DefeitoApresentado();

                defeitoApresentado.setIdDefeitoApresentado(rs.getInt("idDefeitoApresentado"));
                defeitoApresentado.setDefeitoApresentado(rs.getString("defeitoApresentado"));
                

                listaDefeitoApresentados.add(defeitoApresentado);
            }
            rs.close();
            ps.close();
            return listaDefeitoApresentados;

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

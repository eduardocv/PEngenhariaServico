package dao;

import entity.Tecnico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Ruivinho
 */
public class TecnicoDAO extends MySQL {

    public boolean insert(Tecnico tecnico) {
        Connection c = this.getConnection();

        try {
            PreparedStatement ps = c.prepareStatement("insert into Tecnico (nome, email, status ) "
                    + "values(?,?,?)", Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, tecnico.getNome());
            ps.setString(2, tecnico.getEmail());
            ps.setString(3, tecnico.getStatus());

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

    public boolean update(Tecnico tecnico) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("UPDATE Tecnico "
                    + "SET nome = ?, email = ?, status = ? WHERE idTecnico = ?");
            ps.setString(1, tecnico.getNome());
            ps.setString(2, tecnico.getEmail());
            ps.setString(3, tecnico.getStatus());
            ps.setInt(4, tecnico.getIdTecnico());
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

    public boolean delete(int idTecnico) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps
                    = c.prepareStatement("DELETE FROM Tecnico "
                            + "WHERE idTecnico = ?");
            ps.setInt(1, idTecnico);

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

    public java.util.List<Tecnico> listarTecnicos() {
        Connection c = this.getConnection();
        java.util.List<Tecnico> listaTecnicos = new ArrayList<Tecnico>();
        try {
            PreparedStatement ps = c.prepareStatement(" select idTecnico, nome, email, status from Tecnico");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Tecnico tecnico = new Tecnico();

                tecnico.setIdTecnico(rs.getInt("idTecnico"));
                tecnico.setNome(rs.getString("nome"));
                tecnico.setEmail(rs.getString("email"));
                tecnico.setStatus(rs.getString("status"));

                listaTecnicos.add(tecnico);
            }
            rs.close();
            ps.close();
            return listaTecnicos;

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

    public Tecnico getTecnicoById(int id) {
        Connection c = this.getConnection();
        Tecnico tecnico = null;
        try {

            PreparedStatement ps = c.prepareStatement("SELECT idTecnico, nome, email, status from Tecnico"
                    + " WHERE idTecnico = ? ");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tecnico = new Tecnico();
                tecnico.setIdTecnico(rs.getInt("idTecnico"));
                tecnico.setNome(rs.getString("nome"));
                tecnico.setEmail(rs.getString("email"));
                tecnico.setStatus(rs.getString("status"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return tecnico;
    }

    public java.util.List<Tecnico> buscarPorTecnico(String busca) {
        Connection c = this.getConnection();
        java.util.List<Tecnico> listaTecnicos = new ArrayList<Tecnico>();

        try {
            PreparedStatement ps = c.prepareStatement(" select idTecnico, nome, email, status from Tecnico where nome like ?");

            ps.setString(1, "%" + busca + "%");
            ps.execute();

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Tecnico tecnico = new Tecnico();

                tecnico.setIdTecnico(rs.getInt("idTecnico"));
                tecnico.setNome(rs.getString("nome"));
                tecnico.setEmail(rs.getString("email"));
                tecnico.setStatus(rs.getString("status"));

                listaTecnicos.add(tecnico);
            }
            rs.close();
            ps.close();
            return listaTecnicos;

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

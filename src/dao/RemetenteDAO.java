package dao;

import entity.Remetente;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eduardo.vieira
 */
public class RemetenteDAO extends MySQL {

    public boolean insert(Remetente remetente) {
        Connection c = this.getConnection();

        try {
            PreparedStatement ps = c.prepareStatement("insert into Remetente ( nome, email, tipo, telefone, status) "
                    + "values( ? , ? , ? , ? , ? )");
            ps.setString(1, remetente.getNome());
            ps.setString(2, remetente.getEmail());
            ps.setString(3, remetente.getTipo().toString());
            ps.setString(4, remetente.getTelefone());
            ps.setString(5, remetente.getStatus());

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

    public boolean update(Remetente remetente) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("UPDATE Remetente "
                    + "SET nome = ?, email = ?, tipo = ?, telefone = ?, status = ? WHERE idRemetente = ?");
            ps.setString(1, remetente.getNome());
            ps.setString(2, remetente.getEmail());
            ps.setString(3, remetente.getTipo().toString());
            ps.setString(4, remetente.getTelefone());
            ps.setString(5, remetente.getStatus());
            ps.setInt(6, remetente.getIdRemetente());
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

    public boolean delete(int idRemetente) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps
                    = c.prepareStatement("DELETE FROM Remetente "
                            + "WHERE idRemetente = ?");
            ps.setInt(1, idRemetente);

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

    public java.util.List<Remetente> listaRemetentes() {
        Connection c = this.getConnection();
        java.util.List<Remetente> listaRemetentes = new ArrayList<Remetente>();
        try {
            PreparedStatement ps = c.prepareStatement(" select idRemetente, nome, email, tipo, telefone, status from Remetente");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Remetente remetente = new Remetente();

                remetente.setIdRemetente(rs.getInt("idRemetente"));
                remetente.setNome(rs.getString("nome"));
                remetente.setEmail(rs.getString("email"));
                remetente.setTipo(rs.getString("tipo"));
                remetente.setTelefone(rs.getString("telefone"));
                remetente.setStatus(rs.getString("status"));

                listaRemetentes.add(remetente);
            }
            rs.close();
            ps.close();
            return listaRemetentes;

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

    public java.util.List<Remetente> listarRemetentes() {
        Connection c = this.getConnection();
        java.util.List<Remetente> listaRemetentes = new ArrayList<Remetente>();
        try {
            PreparedStatement ps = c.prepareStatement(" select idRemetente, nome, email, tipo, telefone from Remetente");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Remetente remetente = new Remetente();

                remetente.setIdRemetente(rs.getInt("idRemetente"));
                remetente.setNome(rs.getString("nome"));
                remetente.setEmail(rs.getString("email"));
                remetente.setTipo(rs.getString("tipo"));
                remetente.setTelefone(rs.getString("telefone"));

                listaRemetentes.add(remetente);
            }
            rs.close();
            ps.close();
            return listaRemetentes;

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
public Remetente getRemetenteById(int id) {
        Connection c = this.getConnection();
        Remetente remetente = null;
        try {

            PreparedStatement ps = c.prepareStatement("SELECT idTecnico, nome, email, status from Tecnico"
                    + " WHERE idTecnico = ? ");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                remetente = new Remetente();
                remetente.setIdRemetente(rs.getInt("idRemetente"));
                remetente.setNome(rs.getString("nome"));
                remetente.setEmail(rs.getString("email"));
                remetente.setStatus(rs.getString("status"));
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
        return remetente;
    }

    public java.util.List<Remetente> buscarPorRemetente(String busca) {
        Connection c = this.getConnection();
        java.util.List<Remetente> listaRemetentes = new ArrayList<Remetente>();

        try {
            PreparedStatement ps = c.prepareStatement(" select idRemetente, nome, email, tipo, telefone, status from Remetente where nome like ?");

            ps.setString(1, "%" + busca + "%");
            ps.execute();

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Remetente remetente = new Remetente();

                remetente.setIdRemetente(rs.getInt("idRemetente"));
                remetente.setNome(rs.getString("nome"));
                remetente.setEmail(rs.getString("email"));
                remetente.setTipo(rs.getString("tipo"));
                remetente.setTelefone(rs.getString("telefone"));
                remetente.setStatus(rs.getString("status"));

                listaRemetentes.add(remetente);
            }
            rs.close();
            ps.close();
            return listaRemetentes;

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

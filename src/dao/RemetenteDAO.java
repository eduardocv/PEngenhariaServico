package dao;

import entity.Remetente;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RemetenteDAO extends MySQL {

    public boolean insert(Remetente remetente) {
        Connection c = this.getConnection();

        try {
            PreparedStatement ps = c.prepareStatement("insert into Remetente ( nome, tipo, email, telefone, status, outrasInfo) "
                    + "values( ? , ? , ? , ? , ? , ? )");
            ps.setString(1, remetente.getNome());
            ps.setString(2, remetente.getTipo());
            ps.setString(3, remetente.getEmail());
            ps.setString(4, remetente.getTelefone());
            ps.setBoolean(5, remetente.isStatus());
            ps.setString(6, remetente.getOutrasInfo());

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
                    + "SET nome = ?, tipo = ?, email = ?, telefone = ?, status = ?, outrasInfo = ? WHERE idRemetente = ?");
            ps.setString(1, remetente.getNome());
            ps.setString(2, remetente.getTipo());
            ps.setString(3, remetente.getEmail());
            ps.setString(4, remetente.getTelefone());
            ps.setBoolean(5, remetente.isStatus());
            ps.setString(6, remetente.getOutrasInfo());
            ps.setInt(7, remetente.getIdRemetente());
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

    public java.util.List<Remetente> listarRemetentes() {
        Connection c = this.getConnection();
        java.util.List<Remetente> listaRemetentes = new ArrayList<Remetente>();
        try {
            PreparedStatement ps = c.prepareStatement(" select idRemetente, nome, tipo, email, telefone, status, outrasInfo from Remetente");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Remetente remetente = new Remetente();

                remetente.setIdRemetente(rs.getInt("idRemetente"));
                remetente.setNome(rs.getString("nome"));
                remetente.setTipo(rs.getString("tipo"));
                remetente.setEmail(rs.getString("email"));
                remetente.setTelefone(rs.getString("telefone"));
                remetente.setStatus(rs.getBoolean("status"));
                remetente.setOutrasInfo(rs.getString("outrasInfo"));

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

            PreparedStatement ps = c.prepareStatement("SELECT idRemetente, nome, tipo, email, telefone, status, outrasInfo from Remetente"
                    + " WHERE idRemetente = ? ");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                remetente = new Remetente();
                remetente.setIdRemetente(rs.getInt("idRemetente"));
                remetente.setNome(rs.getString("nome"));
                remetente.setTipo(rs.getString("tipo"));
                remetente.setEmail(rs.getString("email"));
                remetente.setTelefone(rs.getString("telefone"));
                remetente.setStatus(rs.getBoolean("status"));
                remetente.setOutrasInfo(rs.getString("outrasInfo"));
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
            PreparedStatement ps = c.prepareStatement(" select idRemetente, nome, tipo, email, telefone, status from Remetente where nome like ?");

            ps.setString(1, "%" + busca + "%");
            ps.execute();

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Remetente remetente = new Remetente();

                remetente.setIdRemetente(rs.getInt("idRemetente"));
                remetente.setNome(rs.getString("nome"));
                remetente.setEmail(rs.getString("tipo"));
                remetente.setTipo(rs.getString("email"));
                remetente.setTelefone(rs.getString("telefone"));
                remetente.setStatus(rs.getBoolean("status"));

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

    public void atualizaStatus(Remetente remetente) {
        Connection c = this.getConnection();

        try {

            PreparedStatement ps = c.prepareStatement("UPDATE remetente "
                    + "Set status = ? "
                    + "WHERE idRemetente = ? ");

            ps.setBoolean(1, remetente.isStatus());
            ps.setInt(2, remetente.getIdRemetente());
            ps.execute();
            ps.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}

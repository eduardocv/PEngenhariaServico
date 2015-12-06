package dao;

import entity.EnumPerfil;
import entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO extends MySQL {

    public boolean insert(Usuario usuario) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("INSERT INTO usuario "
                            + "(idUsuario, nome, cpf, perfil, email, status, senha )  "
                            + "VALUES ( ?, ?, ?, ?, ?, ?, ? )");
            ps.setInt(1, usuario.getIdUsuario());
            ps.setString(2, usuario.getNome());
            ps.setString(3, usuario.getCPF());
            ps.setInt(4, usuario.getPerfil().getId());
            ps.setString(5, usuario.getEmail());
            ps.setBoolean(6, usuario.isStatus());
            ps.setString(7, usuario.getSenha());

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

    public boolean delete(int idUsuario) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps
                    = c.prepareStatement("DELETE FROM usurio "
                            + "WHERE idUsuario = ?");
            ps.setInt(1, idUsuario);

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

    public void update(Usuario usuario) {

        Connection c = this.getConnection();

        try {

            PreparedStatement ps = c.prepareStatement("UPDATE usuario "
                    + "Set nome = ?, cpf = ?, perfil = ?, email= ? "
                    + "WHERE idUsuario = ? ");

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getCPF());
            ps.setInt(3, usuario.getPerfil().getId());
            ps.setString(4, usuario.getEmail());
            ps.setInt(5, usuario.getIdUsuario());

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

    public void atualizaStatus(Usuario usuario) {
        Connection c = this.getConnection();

        try {

            PreparedStatement ps = c.prepareStatement("UPDATE usuario "
                    + "Set status = ? "
                    + "WHERE idUsuario = ? ");

            ps.setBoolean(1, usuario.isStatus());
            ps.setInt(2, usuario.getIdUsuario());
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

    public Usuario getUsuarioById(int idUsuario) {
        Usuario usuario = new Usuario();
        Connection c = this.getConnection();
        try {
            PreparedStatement ps
                    = c.prepareStatement("SELECT idUsuario, nome, cpf , perfil, email, status "
                            + " FROM usuario"
                            + " WHERE idUsuario = ?");
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCPF(rs.getString("cpf"));

                usuario.setPerfil(EnumPerfil.ADMINISTRADOR.getPerfil(rs.getInt("perfil")));
                usuario.setEmail(rs.getString("email"));
                usuario.setStatus(rs.getBoolean("status"));
            }
            rs.close();
            ps.close();
            return usuario;

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

    public Usuario getLoginSenha(String email, String senha) {
        Usuario usuario = null;
        Connection c = this.getConnection();
        try {
            PreparedStatement ps
                    = c.prepareStatement("SELECT idUsuario, nome, cpf , perfil, email, status "
                            + " FROM usuario"
                            + " WHERE email = ? AND senha = ? ");
            ps.setString(1, email);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCPF(rs.getString("cpf"));
                usuario.setPerfil(EnumPerfil.ADMINISTRADOR.getPerfil(rs.getInt("perfil")));
                usuario.setEmail(rs.getString("email"));
                usuario.setStatus(rs.getBoolean("status"));

            }
            rs.close();
            ps.close();
            return usuario;

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

    public Usuario getLogin(String email) {
        Usuario usuario = null;
        Connection c = this.getConnection();
        try {
            PreparedStatement ps
                    = c.prepareStatement("SELECT idUsuario, nome, cpf , perfil, email, status "
                            + " FROM usuario"
                            + " WHERE email = ? ");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCPF(rs.getString("cpf"));

                usuario.setPerfil(EnumPerfil.ADMINISTRADOR.getPerfil(rs.getInt("perfil")));
                usuario.setEmail(rs.getString("email"));
                usuario.setStatus(rs.getBoolean("status"));

            }
            rs.close();
            ps.close();
            return usuario;

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

    public List<Usuario> listarUsuarios() {
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        Connection c = this.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT idUsuario, nome, cpf , perfil, email, status "
                    + " FROM usuario");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();

                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCPF(rs.getString("cpf"));
                usuario.setPerfil(EnumPerfil.USUARIO.getPerfil(rs.getInt("perfil")));
                usuario.setEmail(rs.getString("email"));
                usuario.setStatus(rs.getBoolean("status"));

                listaUsuarios.add(usuario);

            }
            rs.close();
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
        return listaUsuarios;
    }
}

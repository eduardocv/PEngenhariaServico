package dao;

import entity.ManutLaboratorio;
import entity.Componente;
import entity.EnumPerfil;
import entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ManutLaboratorioDAO extends MySQL {

    public boolean insert(ManutLaboratorio manutLaboratorio, Usuario usuario) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps
                    = c.prepareStatement("INSERT INTO ManutencaoLaboratorio "
                            + "(tecnico, remetente, produto, defRelatado, defApresentado, data, numSerie, chamadoOat, "
                            + "corrigidoEmCampo, descAtividades, tempoReparo )  "
                            + "VALUES (?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, manutLaboratorio.getTecnico());
            ps.setString(2, manutLaboratorio.getRemetente());
            ps.setString(3, manutLaboratorio.getProduto());
            ps.setString(4, manutLaboratorio.getDefRelatado());
            ps.setString(5, manutLaboratorio.getDefApresentado());
            ps.setString(6, manutLaboratorio.getData());
            ps.setString(7, manutLaboratorio.getNumSerie());
            ps.setString(8, manutLaboratorio.getChamadoOat());
            ps.setBoolean(9, manutLaboratorio.isCorrigidoEmCampo());
            ps.setString(10, manutLaboratorio.getDescAtividades());
            ps.setString(11, manutLaboratorio.getTempoReparo());
            // ps.setComponentes(11,manutLaboratorio.getComponentes());
            //manutLaboratorio.getComponentes());

            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            int id = 0;
            if (rs.next()) {
                id = rs.getInt(1);
            }

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

    public void update(ManutLaboratorio manutLaboratorio) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("UPDATE ManutencaoLaboratorio "
                    + "SET remetente = ?, produto = ?, defRelatado = ?, defApresentado = ?, numSerie = ?,"
                    + " chamadoOat = ?, corrigidoEmCampo = ?, descAtividades = ?, tempoReparo = ? WHERE idManut = ?");

            ps.setString(1, manutLaboratorio.getRemetente());
            ps.setString(2, manutLaboratorio.getProduto());
            ps.setString(3, manutLaboratorio.getDefRelatado());
            ps.setString(4, manutLaboratorio.getDefApresentado());
            //ps.setString(5, manutLaboratorio.getData()); ///PEGAR A DATA
            ps.setString(5, manutLaboratorio.getNumSerie());
            ps.setString(6, manutLaboratorio.getChamadoOat());
            ps.setBoolean(7, manutLaboratorio.isCorrigidoEmCampo());
            ps.setString(8, manutLaboratorio.getDescAtividades());
            ps.setString(9, manutLaboratorio.getTempoReparo());
            //ps.setComponentes(11,manutLaboratorio.getComponentes(List<Componente>));
            //manutLaboratorio.getComponentes());
            ps.setInt(10, manutLaboratorio.getIdManutLaboratorio());
            ps.execute();

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

    public java.util.List<ManutLaboratorio> listarManuts() {
        Connection c = this.getConnection();
        List<ManutLaboratorio> listaManuts = new ArrayList<ManutLaboratorio>();
        try {
            PreparedStatement ps = c.prepareStatement(" select idManut, tecnico, remetente, produto, defRelatado, defApresentado,"
                    + " data, numSerie, chamadoOat, corrigidoEmCampo, tempoReparo from ManutencaoLaboratorio");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                ManutLaboratorio manutLaboratorio = new ManutLaboratorio();

                manutLaboratorio.setIdManutLaboratorio(rs.getInt("idManut"));
                manutLaboratorio.setTecnico(rs.getString("tecnico"));
                manutLaboratorio.setRemetente(rs.getString("remetente"));
                manutLaboratorio.setProduto(rs.getString("produto"));
                manutLaboratorio.setDefRelatado(rs.getString("defRelatado"));
                manutLaboratorio.setDefApresentado(rs.getString("defApresentado"));
                manutLaboratorio.setData(rs.getString("data")); //PASSAR DATA
                manutLaboratorio.setNumSerie(rs.getString("numSerie"));
                manutLaboratorio.setChamadoOat(rs.getString("chamadoOat"));
                manutLaboratorio.setCorrigidoEmCampo(rs.getBoolean("corrigidoEmCampo"));
                manutLaboratorio.setTempoReparo(rs.getString("tempoReparo"));

                listaManuts.add(manutLaboratorio);
            }
            rs.close();
            ps.close();
            return listaManuts;

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

    public ManutLaboratorio getManutById(int id) {
        Connection c = this.getConnection();
        ManutLaboratorio manutLaboratorio = null;
        try {
            PreparedStatement ps = c.prepareStatement("SELECT idManut, tecnico, remetente, produto, defRelatado, defApresentado,"
                    + " numSerie, chamadoOat, corrigidoEmCampo, descAtividades, data, tempoReparo from ManutencaoLaboratorio WHERE idManut = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                manutLaboratorio = new ManutLaboratorio();
                manutLaboratorio.setIdManutLaboratorio(rs.getInt("idManut"));
                manutLaboratorio.setTecnico(rs.getString("tecnico"));
                manutLaboratorio.setRemetente(rs.getString("remetente"));
                manutLaboratorio.setProduto(rs.getString("produto"));
                manutLaboratorio.setDefRelatado(rs.getString("defRelatado"));
                manutLaboratorio.setDefApresentado(rs.getString("defApresentado"));
                manutLaboratorio.setData(rs.getString("data"));
                manutLaboratorio.setNumSerie(rs.getString("numSerie"));
                manutLaboratorio.setChamadoOat(rs.getString("chamadoOat"));
                manutLaboratorio.setCorrigidoEmCampo(rs.getBoolean("corrigidoEmCampo"));
                manutLaboratorio.setDescAtividades(rs.getString("descAtividades"));
                manutLaboratorio.setTempoReparo(rs.getString("tempoReparo"));

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
        return manutLaboratorio;
    }

}

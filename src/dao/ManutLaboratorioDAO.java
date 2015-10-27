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

public class ManutLaboratorioDAO extends MySQL {

    public boolean insert(ManutLaboratorio manutLaboratorio) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps
                    = c.prepareStatement("INSERT INTO ManutLaboratorio "
                            + "(remetente, produto, defRelatado, defApresentado, data, numSerie, chamadoOat, "
                            + "corrigidoEmCampo, descAtividades, tempoReparo, componentes )  "
                            + "VALUES (?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, manutLaboratorio.getRemetente());
            ps.setString(2, manutLaboratorio.getProduto());
            ps.setString(3, manutLaboratorio.getDefRelatado());
            ps.setString(4, manutLaboratorio.getDefApresentado());
            ps.setString(5, manutLaboratorio.getData());
            ps.setString(6, manutLaboratorio.getNumSerie());
            ps.setString(7, manutLaboratorio.getChamadoOat());
            ps.setBoolean(8, manutLaboratorio.isCorrigidoEmCampo());
            ps.setString(9, manutLaboratorio.getDescAtividades());
            ps.setString(10, manutLaboratorio.getTempoReparo());
            //ps.setComponentes(11,manutLaboratorio.getComponentes(List<Componente>));
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

    public boolean update(ManutLaboratorio manutLaboratorio) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("UPDATE empresa "
                    + "SET nomeFantasia = ?, razaoSocial = ?, CNPJ = ?, IE = ?, site = ?,"
                    + " logradouro = ?, complemento = ?, cidade = ?, CEP = ?, UF = ?, tipo = ?, status = ? "
                    + " WHERE idEmpresa = ?");

            ps.setString(1, manutLaboratorio.getRemetente());
            ps.setString(2, manutLaboratorio.getProduto());
            ps.setString(3, manutLaboratorio.getDefRelatado());
            ps.setString(4, manutLaboratorio.getDefApresentado());
            ps.setString(5, manutLaboratorio.getData()); ///PEGAR A DATA
            ps.setString(6, manutLaboratorio.getNumSerie());
            ps.setString(7, manutLaboratorio.getChamadoOat());
            ps.setBoolean(8, manutLaboratorio.isCorrigidoEmCampo());
            ps.setString(9, manutLaboratorio.getDescAtividades());
            ps.setString(10, manutLaboratorio.getTempoReparo());
            //ps.setComponentes(11,manutLaboratorio.getComponentes(List<Componente>));
            //manutLaboratorio.getComponentes());
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

    public java.util.List<ManutLaboratorio> listarManuts() {
        Connection c = this.getConnection();
        java.util.List<ManutLaboratorio> listaManuts = new ArrayList<ManutLaboratorio>();
        try {
            PreparedStatement ps = c.prepareStatement(" select idManutLaboratorio, remetente, produto, defRelatado, defApresentado,"
                    + " data, numSerie, chamadoOat, corrigidoEmCampo from ManutLaboratorio");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                ManutLaboratorio manutLaboratorio = new ManutLaboratorio();

                manutLaboratorio.setIdManutLaboratorio(rs.getInt("idManutLaboratorio"));
                manutLaboratorio.setRemetente(rs.getString("remetente"));
                manutLaboratorio.setProduto(rs.getString("produto"));
                manutLaboratorio.setDefRelatado(rs.getString("defRelatado"));
                manutLaboratorio.setDefApresentado(rs.getString("defApresentado"));
                manutLaboratorio.setData(rs.getString("data")); //PASSAR DATA
                manutLaboratorio.setNumSerie(rs.getString("numSerie"));
                manutLaboratorio.setChamadoOat(rs.getString("chamadoOat"));
                manutLaboratorio.setCorrigidoEmCampo(rs.getBoolean("corrigidoEmCampo"));
                

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
    
    public ManutLaboratorio getManutById (int id) {
        Connection c = this.getConnection();
        ManutLaboratorio manutLaboratorio = null;
        try{
            PreparedStatement ps = c.prepareStatement("SELECT idManutLaboratorio, codProduto, produto, status from Produto WHERE idProduto = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                manutLaboratorio = new ManutLaboratorio();
                manutLaboratorio.setIdManutLaboratorio(rs.getInt("idManutLaboratorio"));
               // manutLaboratorio.set(rs.getString("codProduto"));
                manutLaboratorio.setProduto(rs.getString("produto"));
                manutLaboratorio.setRemetente(rs.getString("remetente"));
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
        return manutLaboratorio;
    }
    
}

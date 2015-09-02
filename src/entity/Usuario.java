
package entity;

/**
 *
 * @author VDISOO0219
 */
public class Usuario {
    private String nome;
    private String CPF;
    private EnumPerfil Perfil;
    private String email;
    private int idUsuario;
    private String status;
    private String senha;

    @Override
    public String toString() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public EnumPerfil getPerfil() {
        return Perfil;
    }

    public void setPerfil(EnumPerfil Perfil) {
        this.Perfil = Perfil;
    }

    

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
}
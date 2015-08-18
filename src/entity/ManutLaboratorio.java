/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author eduardo.vieira
 */
public class ManutLaboratorio {
    private int idManutLaboratorio;
    private String data;
    private String chamadoOat;
    private int numSerial;
    private String descricao;
    private String tempoReparo;

    public int getIdManutLaboratorio() {
        return idManutLaboratorio;
    }

    public void setIdManutLaboratorio(int idManutLaboratorio) {
        this.idManutLaboratorio = idManutLaboratorio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getChamadoOat() {
        return chamadoOat;
    }

    public void setChamadoOat(String chamadoOat) {
        this.chamadoOat = chamadoOat;
    }

    public int getNumSerial() {
        return numSerial;
    }

    public void setNumSerial(int numSerial) {
        this.numSerial = numSerial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTempoReparo() {
        return tempoReparo;
    }

    public void setTempoReparo(String tempoReparo) {
        this.tempoReparo = tempoReparo;
    }
    
}

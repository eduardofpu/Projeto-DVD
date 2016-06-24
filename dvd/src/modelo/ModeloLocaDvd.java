/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Delfino
 */
public class ModeloLocaDvd {
    
    private int idLoca;
    private int idDvd;
    private int quantidadeDvd;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public int getIdLoca() {
        return idLoca;
    }

    public void setIdLoca(int idLoca) {
        this.idLoca = idLoca;
    }

    public int getIdDvd() {
        return idDvd;
    }

    public void setIdDvd(int idDvd) {
        this.idDvd = idDvd;
    }

    public int getQuantidadeDvd() {
        return quantidadeDvd;
    }

    public void setQuantidadeDvd(int quantidadeDvd) {
        this.quantidadeDvd = quantidadeDvd;
    }
    
    
    
}

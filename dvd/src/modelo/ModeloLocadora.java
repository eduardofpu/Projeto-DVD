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
public class ModeloLocadora {
    
    
    private int codigo;
    private int quantidade;
    private String dataInicio;
    private String dataDevol;
    private String tipoPag;
    private Float preco;
    private String nomeFunc;
    private String nomeCl;
    private int coCl;
    private int cofun;
    private int codDvd;
    private String fime;
    private int codLoca;

    public int getCodLoca() {
        return codLoca;
    }

    public void setCodLoca(int codLoca) {
        this.codLoca = codLoca;
    }
    

    public String getFime() {
        return fime;
    }

    public void setFime(String fime) {
        this.fime = fime;
    }
    
    

    public int getCoCl() {
        return coCl;
    }

    public void setCoCl(int coCl) {
        this.coCl = coCl;
    }

    public int getCofun() {
        return cofun;
    }

    public void setCofun(int cofun) {
        this.cofun = cofun;
    }

    public int getCodDvd() {
        return codDvd;
    }

    public void setCodDvd(int codDvd) {
        this.codDvd = codDvd;
    }
    

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getNomeCl() {
        return nomeCl;
    }

    public void setNomeCl(String nomeCl) {
        this.nomeCl = nomeCl;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataDevol() {
        return dataDevol;
    }

    public void setDataDevol(String dataDevol) {
        this.dataDevol = dataDevol;
    }

    public String getTipoPag() {
        return tipoPag;
    }

    public void setTipoPag(String tipoPag) {
        this.tipoPag = tipoPag;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
    
    
}

package br.com.prova.desafio.model;




import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patrimonio extends AbstractEntity {

    @Id
    @Column(name = "ID")
    private Integer id;
    @NotEmpty
    @Column(name = "NOME")
    private String nome;
    @Column(name = "ID_MARCA")
    private Integer idMarca;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "NUM_TOMBO")
    private Integer numTombo;

    public Patrimonio(String nome) {
        this.nome = nome;
    }

    public Patrimonio() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNumTombo() {
        return numTombo;
    }

    public void setNumTombo(Integer numTombo) {
        this.numTombo = numTombo;
    }
}

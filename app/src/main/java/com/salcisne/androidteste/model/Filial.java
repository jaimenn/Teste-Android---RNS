package com.salcisne.androidteste.model;

import com.salcisne.androidteste.model.enums.EnumTipoFilial;

public class Filial {

    private Long id;

    private String razaoSocial;

    private String cnpj;

    private String endereco;

    private EnumTipoFilial tipoFilial;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public EnumTipoFilial getTipoFilial() {
        return tipoFilial;
    }
    public void setTipoFilial(EnumTipoFilial tipoFilial) {
        this.tipoFilial = tipoFilial;
    }

}
